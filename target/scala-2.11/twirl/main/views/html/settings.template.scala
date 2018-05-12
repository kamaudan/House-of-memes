
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

object settings_Scope0 {
  import models._
  import controllers._
  import play.api.i18n._
  import views.html._
  import play.api.templates.PlayMagic._
  import play.api.mvc._
  import play.api.data._

  class settings extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable, Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[User, Messages, play.twirl.api.HtmlFormat.Appendable] {

    /**/
    def apply /*1.2*/ ()(implicit user: User, messages: Messages): play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
        {
          import controllers.routes

          Seq[Any](format.raw /*1.45*/ ("""

"""), format.raw /*4.1*/ ("""
"""), _display_( /*5.2*/ views /*5.7*/ .html.templates.logged(title = "Settings Area", tab = "settings") /*5.72*/ {
            _display_(Seq[Any](format.raw /*5.74*/ ("""
	
	"""), format.raw /*7.2*/ ("""<h1 class="text-primary">Settings Area</h1>
	
	<h3>This is the Settings Area. Only users with <strong>'master'</strong> role can be here.</h3>

""")))
          }), format.raw /*11.2*/ ("""
"""))
        }
      }
    }

    def render(user: User, messages: Messages): play.twirl.api.HtmlFormat.Appendable = apply()(user, messages)

    def f: (() => (User, Messages) => play.twirl.api.HtmlFormat.Appendable) = () => (user, messages) => apply()(user, messages)

    def ref: this.type = this

  }

}

/**/
object settings extends settings_Scope0.settings
/*
                  -- GENERATED --
                  DATE: Wed May 09 18:06:42 EAT 2018
                  SOURCE: /home/dan/House of Memes/app/views/settings.scala.html
                  HASH: 8784152d89524617b1096bdd0257a64f28d66a14
                  MATRIX: 540->1|703->44|731->73|758->75|770->80|843->145|882->147|912->151|1087->296
                  LINES: 20->1|25->1|27->4|28->5|28->5|28->5|28->5|30->7|34->11
                  -- GENERATED --
              */
