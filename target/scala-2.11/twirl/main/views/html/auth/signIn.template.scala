
package views.html.auth

import play.twirl.api._
import play.twirl.api.TemplateMagic._

object signIn_Scope0 {
  import models._
  import controllers._
  import play.api.i18n._
  import views.html._
  import play.api.templates.PlayMagic._
  import play.api.mvc._
  import play.api.data._

  class signIn extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable, Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[scala.Tuple3[String, String, Boolean]], RequestHeader, Messages, play.twirl.api.HtmlFormat.Appendable] {

    /**/
    def apply /*1.2*/ (signInForm: Form[(String, String, Boolean)])(implicit request: RequestHeader, messages: Messages): play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
        {
          import b3.vertical.fieldConstructor
          import controllers.routes

          Seq[Any](format.raw /*1.100*/ ("""
"""), format.raw /*4.1*/ ("""
"""), _display_( /*5.2*/ default("Sign In") /*5.20*/ {
            _display_(Seq[Any](format.raw /*5.22*/ ("""
	"""), _display_( /*6.3*/ tags /*6.7*/ .alertFromRequest(request, "error")), format.raw /*6.42*/ ("""
	"""), _display_( /*7.3*/ b3 /*7.5*/ .formCSRF(routes.Auth.authenticate) /*7.40*/ {
              _display_(Seq[Any](format.raw /*7.42*/ ("""
		"""), format.raw /*8.3*/ ("""<fieldset>
			<legend>"""), _display_( /*9.13*/ Messages("signin.title")), format.raw /*9.37*/ ("""</legend>
			"""), _display_( /*10.5*/ b3 /*10.7*/ .text(signInForm("identifier"), '_hiddenLabel -> Messages("field.email"), 'placeholder -> "your@email.com", 'autofocus -> true)), format.raw /*10.136*/ ("""
			"""), _display_( /*11.5*/ b3 /*11.7*/ .password(signInForm("password"), '_hiddenLabel -> Messages("field.password"), 'placeholder -> Messages("field.password"))), format.raw /*11.131*/ ("""
			"""), _display_( /*12.5*/ b3 /*12.7*/ .checkbox(signInForm("rememberMe"), '_text -> Messages("signin.rememberme"), 'checked -> true)), format.raw /*12.103*/ ("""
			"""), _display_( /*13.5*/ b3 /*13.7*/ .submit('class -> "btn btn-primary btn-block") /*13.53*/ { _display_(Seq[Any](format.raw /*13.54*/ (""" """), _display_( /*13.56*/ Messages("signin")), format.raw /*13.74*/ (""" """))) }), format.raw /*13.76*/ ("""
			"""), format.raw /*14.4*/ ("""<div class="post-form-opts">
				<p>"""), _display_( /*15.9*/ Messages("signin.forgot.question")), format.raw /*15.43*/ (""" """), format.raw /*15.44*/ ("""<a href=""""), _display_( /*15.54*/ routes /*15.60*/ .Auth.forgotPassword), format.raw /*15.80*/ ("""">"""), _display_( /*15.83*/ Messages("signin.forgot")), format.raw /*15.108*/ ("""</a></p>
			</div>
		</fieldset>
	""")))
            }), format.raw /*18.3*/ ("""
	
""")))
          }), format.raw /*20.2*/ ("""
"""))
        }
      }
    }

    def render(signInForm: Form[scala.Tuple3[String, String, Boolean]], request: RequestHeader, messages: Messages): play.twirl.api.HtmlFormat.Appendable = apply(signInForm)(request, messages)

    def f: ((Form[scala.Tuple3[String, String, Boolean]]) => (RequestHeader, Messages) => play.twirl.api.HtmlFormat.Appendable) = (signInForm) => (request, messages) => apply(signInForm)(request, messages)

    def ref: this.type = this

  }

}

/**/
object signIn extends signIn_Scope0.signIn
/*
                  -- GENERATED --
                  DATE: Wed May 09 18:06:43 EAT 2018
                  SOURCE: /home/dan/House of Memes/app/views/auth/signIn.scala.html
                  HASH: df1f8e5c7584fb9214ed89d9a48cbb96b52004a3
                  MATRIX: 594->1|849->99|876->164|903->166|929->184|968->186|996->189|1007->193|1062->228|1090->231|1099->233|1142->268|1181->270|1210->273|1259->296|1303->320|1343->334|1353->336|1504->465|1535->470|1545->472|1691->596|1722->601|1732->603|1850->699|1881->704|1891->706|1946->752|1985->753|2014->755|2053->773|2086->775|2117->779|2180->816|2235->850|2264->851|2301->861|2316->867|2357->887|2387->890|2434->915|2499->950|2533->954
                  LINES: 20->1|26->1|27->4|28->5|28->5|28->5|29->6|29->6|29->6|30->7|30->7|30->7|30->7|31->8|32->9|32->9|33->10|33->10|33->10|34->11|34->11|34->11|35->12|35->12|35->12|36->13|36->13|36->13|36->13|36->13|36->13|36->13|37->14|38->15|38->15|38->15|38->15|38->15|38->15|38->15|38->15|41->18|43->20
                  -- GENERATED --
              */
