package controllers

import models._
import utils.silhouette._
import com.mohiva.play.silhouette.api.Silhouette
import play.api._
import play.api.mvc._
import play.api.Play.current
import play.api.i18n.{ MessagesApi, Messages, Lang }
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits._
import javax.inject.{ Inject, Singleton }

@Singleton
class Application @Inject() (val silhouette: Silhouette[MyEnv], val messagesApi: MessagesApi) extends AuthController {

  def index = UserAwareAction { implicit request =>
    Ok(views.html.index())
  }

  def myAccount = SecuredAction { implicit request =>
    Ok(views.html.myAccount())
  }

  // REQUIRED ROLES: serviceA (or master)
  def profit = SecuredAction(WithService("master")) { implicit request =>
    Ok(views.html.profit())
  }

  // REQUIRED ROLES: serviceA OR serviceB (or master)
  def newcustomers = SecuredAction(WithService("master")) { implicit request =>
    Ok(views.html.newcustomers())
  }

  // REQUIRED ROLES: serviceA AND serviceB (or master)
  def inventory = SecuredAction(WithServices("admin")) { implicit request =>
    Ok(views.html.inventory())
  }

  // REQUIRED ROLES: master
  def settings = SecuredAction(WithService("master")) { implicit request =>
    Ok(views.html.settings())
  }

  def sales = SecuredAction(WithService("admin")) { implicit request =>
    Ok(views.html.sales())
  }

  def selectLang(lang: String) = UserAwareAction { implicit request =>
    Logger.logger.debug("Change user lang to : " + lang)
    request.headers.get(REFERER).map { referer =>
      Redirect(referer).withLang(Lang(lang))
    }.getOrElse {
      Redirect(routes.Application.index).withLang(Lang(lang))
    }
  }

}