
package views.html.auth

import play.twirl.api._
import play.twirl.api.TemplateMagic._

object resetPassword_Scope0 {
  import models._
  import controllers._
  import play.api.i18n._
  import views.html._
  import play.api.templates.PlayMagic._
  import play.api.mvc._
  import play.api.data._

  class resetPassword extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable, Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String, Form[scala.Tuple2[String, String]], RequestHeader, Messages, play.twirl.api.HtmlFormat.Appendable] {

    /**/
    def apply /*1.2*/ (tokenId: String, passwordsForm: Form[(String, String)])(implicit request: RequestHeader, messages: Messages): play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
        {
          import b3.vertical.fieldConstructor

          Seq[Any](format.raw /*1.111*/ ("""
"""), _display_( /*3.2*/ default("Reset Password") /*3.27*/ {
            _display_(Seq[Any](format.raw /*3.29*/ ("""
	"""), _display_( /*4.3*/ tags /*4.7*/ .alertFromRequest(request, "error")), format.raw /*4.42*/ ("""
	"""), _display_( /*5.3*/ passwordsForm /*5.16*/ .globalError.map /*5.32*/ { error =>
              _display_(Seq[Any](format.raw /*5.43*/ ("""
		"""), _display_( /*6.4*/ tags /*6.8*/ .alert(error.message, "error")), format.raw /*6.38*/ ("""
	""")))
            }), format.raw /*7.3*/ ("""
	"""), _display_( /*8.3*/ b3 /*8.5*/ .formCSRF(controllers.routes.Auth.handleResetPassword(tokenId)) /*8.68*/ {
              _display_(Seq[Any](format.raw /*8.70*/ ("""
		"""), format.raw /*9.3*/ ("""<fieldset>
			<legend>"""), _display_( /*10.13*/ Messages("forgot.reset.title")), format.raw /*10.43*/ ("""</legend>
			"""), _display_( /*11.5*/ b3 /*11.7*/ .password(passwordsForm("password1"), '_hiddenLabel -> Messages("field.password"), 'placeholder -> Messages("field.password"), 'autofocus -> true)), format.raw /*11.155*/ ("""
			"""), _display_( /*12.5*/ b3 /*12.7*/ .password(passwordsForm("password2"), '_hiddenLabel -> Messages("field.password.repeat"), 'placeholder -> Messages("field.password.repeat"))), format.raw /*12.149*/ ("""
			"""), _display_( /*13.5*/ b3 /*13.7*/ .submit('class -> "btn btn-primary btn-block") /*13.53*/ { _display_(Seq[Any](format.raw /*13.54*/ (""" """), _display_( /*13.56*/ Messages("reset")), format.raw /*13.73*/ (""" """))) }), format.raw /*13.75*/ ("""
		"""), format.raw /*14.3*/ ("""</fieldset>
	""")))
            }), format.raw /*15.3*/ ("""
""")))
          }))
        }
      }
    }

    def render(tokenId: String, passwordsForm: Form[scala.Tuple2[String, String]], request: RequestHeader, messages: Messages): play.twirl.api.HtmlFormat.Appendable = apply(tokenId, passwordsForm)(request, messages)

    def f: ((String, Form[scala.Tuple2[String, String]]) => (RequestHeader, Messages) => play.twirl.api.HtmlFormat.Appendable) = (tokenId, passwordsForm) => (request, messages) => apply(tokenId, passwordsForm)(request, messages)

    def ref: this.type = this

  }

}

/**/
object resetPassword extends resetPassword_Scope0.resetPassword
/*
                  -- GENERATED --
                  DATE: Wed May 09 18:06:43 EAT 2018
                  SOURCE: /home/dan/House of Memes/app/views/auth/resetPassword.scala.html
                  HASH: 687c8d89f5cb423b118152689f1e1665a730d900
                  MATRIX: 606->1|846->110|873->149|906->174|945->176|973->179|984->183|1039->218|1067->221|1088->234|1112->250|1160->261|1189->265|1200->269|1250->299|1282->302|1310->305|1319->307|1390->370|1429->372|1458->375|1508->398|1559->428|1599->442|1609->444|1779->592|1810->597|1820->599|1984->741|2015->746|2025->748|2080->794|2119->795|2148->797|2186->814|2219->816|2249->819|2293->833
                  LINES: 20->1|25->1|26->3|26->3|26->3|27->4|27->4|27->4|28->5|28->5|28->5|28->5|29->6|29->6|29->6|30->7|31->8|31->8|31->8|31->8|32->9|33->10|33->10|34->11|34->11|34->11|35->12|35->12|35->12|36->13|36->13|36->13|36->13|36->13|36->13|36->13|37->14|38->15
                  -- GENERATED --
              */
