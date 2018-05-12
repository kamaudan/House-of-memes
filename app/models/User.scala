package models

import utils.silhouette.IdentitySilhouette
import com.mohiva.play.silhouette.password.BCryptPasswordHasher
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

case class User(
    id: Option[Long],
    email: String,
    emailConfirmed: Boolean,
    password: String,
    nick: String,
    firstName: String,
    lastName: String,
    /*
	* A user can register some accounts from third-party services, then it will have access to different parts of the webpage. The 'master' privilege has full access.
	* Ex: ("master") -> full access to every point of the webpage.
	* Ex: ("serviceA") -> have access only to general and serviceA areas.
	* Ex: ("serviceA", "serviceB") -> have access only to general, serviceA and serviceB areas.
	*/
    services: List[String]
) extends IdentitySilhouette {
  def key = email
  def fullName: String = firstName + " " + lastName
}

object User {

  val services = Seq("serviceA", "admin", "master")

  val users = scala.collection.mutable.HashMap[Long, User](
    1L -> User(Some(1L), "sophiaw@sophiawise.com", true, (new BCryptPasswordHasher()).hash("wisdom").password, "Sophie", "Sophia", "Wise", List("master")),
    2L -> User(Some(2L), "ws@shiko.com", true, (new BCryptPasswordHasher()).hash("shiku").password, "Shiko", "Susan", "Wanjiku", List("master")),
    3L -> User(Some(3L), "mw@michaelwambua.com", true, (new BCryptPasswordHasher()).hash("wambuam").password, "Wambua", "Michael", "Wambua", List("admin")),
    4L -> User(Some(4L), "mo@morganotieno.com", true, (new BCryptPasswordHasher()).hash("motieno").password, "MT", "Morgan", "Otieno", List("admin")),
    5L -> User(Some(5L), "kd@dankamau.com", true, (new BCryptPasswordHasher()).hash("kamaudan").password, "Dan", "Dan", "kamau", List("master"))
  )

  def findByEmail(email: String): Future[Option[User]] = Future.successful(users.find(_._2.email == email).map(_._2))

  def save(user: User): Future[User] = {
    // A rudimentary auto-increment feature...
    def nextId: Long = users.maxBy(_._1)._1 + 1

    val theUser = if (user.id.isDefined) user else user.copy(id = Some(nextId))
    users += (theUser.id.get -> theUser)
    Future.successful(theUser)
  }

  def remove(email: String): Future[Unit] = findByEmail(email).map(_.map(u => users.remove(u.id.get)))
}
