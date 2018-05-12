
package views.html.auth

import play.twirl.api._
import play.twirl.api.TemplateMagic._

object changePassword_Scope0 {
  import models._
  import controllers._
  import play.api.i18n._
  import views.html._
  import play.api.templates.PlayMagic._
  import play.api.mvc._
  import play.api.data._

  class changePassword extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable, Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[scala.Tuple3[String, String, String]], RequestHeader, Messages, play.twirl.api.HtmlFormat.Appendable] {

    /**/
    def apply /*1.2*/ (passwordsForm: Form[(String, String, String)])(implicit request: RequestHeader, messages: Messages): play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
        {
          import b3.vertical.fieldConstructor
          import controllers.routes

          Seq[Any](format.raw /*1.102*/ ("""
"""), _display_( /*4.2*/ default("Change Password") /*4.28*/ {
            _display_(Seq[Any](format.raw /*4.30*/ ("""
	"""), _display_( /*5.3*/ tags /*5.7*/ .alertFromRequest(request, "error")), format.raw /*5.42*/ ("""
	"""), _display_( /*6.3*/ passwordsForm /*6.16*/ .globalError.map /*6.32*/ { error =>
              _display_(Seq[Any](format.raw /*6.43*/ ("""
		"""), _display_( /*7.4*/ tags /*7.8*/ .alert(error.message, "error")), format.raw /*7.38*/ ("""
	""")))
            }), format.raw /*8.3*/ ("""
	"""), _display_( /*9.3*/ b3 /*9.5*/ .formCSRF(routes.Auth.handleChangePassword) /*9.48*/ {
              _display_(Seq[Any](format.raw /*9.50*/ ("""
		"""), format.raw /*10.3*/ ("""<fieldset>
			<legend>"""), _display_( /*11.13*/ Messages("changepass.title")), format.raw /*11.41*/ ("""</legend>
			"""), _display_( /*12.5*/ b3 /*12.7*/ .password(passwordsForm("current"), '_hiddenLabel -> Messages("changepass.field.current"), 'placeholder -> Messages("changepass.field.current"), 'autofocus -> true)), format.raw /*12.173*/ ("""
			"""), _display_( /*13.5*/ b3 /*13.7*/ .password(passwordsForm("password1"), '_hiddenLabel -> Messages("changepass.field.new"), 'placeholder -> Messages("changepass.field.new"))), format.raw /*13.147*/ ("""
			"""), _display_( /*14.5*/ b3 /*14.7*/ .password(passwordsForm("password2"), '_hiddenLabel -> Messages("changepass.field.repeat"), 'placeholder -> Messages("changepass.field.repeat"))), format.raw /*14.153*/ ("""
			"""), _display_( /*15.5*/ b3 /*15.7*/ .submit('class -> "btn btn-primary btn-block") /*15.53*/ { _display_(Seq[Any](format.raw /*15.54*/ (""" """), _display_( /*15.56*/ Messages("reset")), format.raw /*15.73*/ (""" """))) }), format.raw /*15.75*/ ("""
			"""), format.raw /*16.4*/ ("""<a class="btn btn-default btn-block" href=""""), _display_( /*16.48*/ routes /*16.54*/ .Application.myAccount), format.raw /*16.76*/ ("""">"""), _display_( /*16.79*/ Messages("back")), format.raw /*16.95*/ ("""</a>
		</fieldset>
	""")))
            }), format.raw /*18.3*/ ("""
""")))
          }))
        }
      }
    }

    def render(passwordsForm: Form[scala.Tuple3[String, String, String]], request: RequestHeader, messages: Messages): play.twirl.api.HtmlFormat.Appendable = apply(passwordsForm)(request, messages)

    def f: ((Form[scala.Tuple3[String, String, String]]) => (RequestHeader, Messages) => play.twirl.api.HtmlFormat.Appendable) = (passwordsForm) => (request, messages) => apply(passwordsForm)(request, messages)

    def ref: this.type = this

  }

}

/**/
object changePassword extends changePassword_Scope0.changePassword
/*
                  -- GENERATED --
                  DATE: Wed May 09 18:06:43 EAT 2018
                  SOURCE: /home/dan/House of Memes/app/views/auth/changePassword.scala.html
                  HASH: d921c2cbb732eee74b2e7e274a1b563a3bb9ea55
                  MATRIX: 609->1|866->101|893->167|927->193|966->195|994->198|1005->202|1060->237|1088->240|1109->253|1133->269|1181->280|1210->284|1221->288|1271->318|1303->321|1331->324|1340->326|1391->369|1430->371|1460->374|1510->397|1559->425|1599->439|1609->441|1797->607|1828->612|1838->614|2000->754|2031->759|2041->761|2209->907|2240->912|2250->914|2305->960|2344->961|2373->963|2411->980|2444->982|2475->986|2546->1030|2561->1036|2604->1058|2634->1061|2671->1077|2722->1098
                  LINES: 20->1|26->1|27->4|27->4|27->4|28->5|28->5|28->5|29->6|29->6|29->6|29->6|30->7|30->7|30->7|31->8|32->9|32->9|32->9|32->9|33->10|34->11|34->11|35->12|35->12|35->12|36->13|36->13|36->13|37->14|37->14|37->14|38->15|38->15|38->15|38->15|38->15|38->15|38->15|39->16|39->16|39->16|39->16|39->16|39->16|41->18
                  -- GENERATED --
              */
