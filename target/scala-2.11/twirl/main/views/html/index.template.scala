
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

object index_Scope0 {
  import models._
  import controllers._
  import play.api.i18n._
  import views.html._
  import play.api.templates.PlayMagic._
  import play.api.mvc._
  import play.api.data._

  class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable, Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Option[User], Messages, play.twirl.api.HtmlFormat.Appendable] {

    /**/
    def apply /*1.2*/ ()(implicit loggedUser: Option[User], messages: Messages): play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
        {
          import views.html.tags.auth._
          import controllers.routes
          def /*6.2*/ servicesString /*6.16*/ (user: User) = {
            {
              user.services match {
                case Nil => "none"
                case head :: Nil => head
                case init :+ last => init.mkString(", ") + " " + Messages("and") + " " + last
              }
            }
          };
          Seq[Any](format.raw /*1.59*/ ("""

"""), format.raw /*5.1*/ ("""
"""), format.raw /*10.3*/ ("""

"""), _display_( /*12.2*/ views /*12.7*/ .html.templates.default(title = "House of memes", loggedUser, tab = "index") /*12.83*/ {
            _display_(Seq[Any](format.raw /*12.85*/ ("""
"""), format.raw /*13.1*/ ("""<hr>
		
		<h1 class="text-center">"""), _display_( /*15.28*/ Messages("index.title")), format.raw /*15.51*/ ("""</h1>
		
		
    
		
		<div class="jumbotron">"""), _display_( /*20.27*/ Html(Messages("index.explanation"))), format.raw /*20.62*/ ("""</div>

		
		
		
	
		

	""")))
          }), format.raw /*28.3*/ ("""
	"""))
        }
      }
    }

    def render(loggedUser: Option[User], messages: Messages): play.twirl.api.HtmlFormat.Appendable = apply()(loggedUser, messages)

    def f: (() => (Option[User], Messages) => play.twirl.api.HtmlFormat.Appendable) = () => (loggedUser, messages) => apply()(loggedUser, messages)

    def ref: this.type = this

  }

}

/**/
object index extends index_Scope0.index
/*
                  -- GENERATED --
                  DATE: Wed May 09 18:06:42 EAT 2018
                  SOURCE: /home/dan/House of Memes/app/views/index.scala.html
                  HASH: 344b45e3e5bfcfe964bb284805e6d26bf9b907a5
                  MATRIX: 542->1|732->120|754->134|951->58|979->118|1007->301|1036->304|1049->309|1134->385|1174->387|1202->388|1264->423|1308->446|1381->492|1437->527|1492->552
                  LINES: 20->1|25->6|25->6|30->1|32->5|33->10|35->12|35->12|35->12|35->12|36->13|38->15|38->15|43->20|43->20|51->28
                  -- GENERATED --
              */
