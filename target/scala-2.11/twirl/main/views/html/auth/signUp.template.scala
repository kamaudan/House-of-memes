
package views.html.auth

import play.twirl.api._
import play.twirl.api.TemplateMagic._

object signUp_Scope0 {
  import models._
  import controllers._
  import play.api.i18n._
  import views.html._
  import play.api.templates.PlayMagic._
  import play.api.mvc._
  import play.api.data._

  class signUp extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable, Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[User], RequestHeader, Messages, play.twirl.api.HtmlFormat.Appendable] {

    /**/
    def apply /*1.2*/ (signUpForm: Form[User])(implicit request: RequestHeader, messages: Messages): play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
        {
          import b3.vertical.fieldConstructor
          import controllers.routes

          Seq[Any](format.raw /*1.79*/ ("""
"""), format.raw /*4.1*/ ("""
"""), _display_( /*5.2*/ default("Sign Up") /*5.20*/ {
            _display_(Seq[Any](format.raw /*5.22*/ ("""
	"""), _display_( /*6.3*/ tags /*6.7*/ .alertFromRequest(request, "error")), format.raw /*6.42*/ ("""
	"""), _display_( /*7.3*/ b3 /*7.5*/ .formCSRF(routes.Auth.handleStartSignUp) /*7.45*/ {
              _display_(Seq[Any](format.raw /*7.47*/ ("""
		"""), format.raw /*8.3*/ ("""<fieldset>
			<legend>"""), _display_( /*9.13*/ Messages("signup.title")), format.raw /*9.37*/ ("""</legend>
			"""), _display_( /*10.5*/ b3 /*10.7*/ .text(signUpForm("firstName"), '_label -> Messages("field.firstname"), 'placeholder -> "John", 'autofocus -> true)), format.raw /*10.122*/ ("""
			"""), _display_( /*11.5*/ b3 /*11.7*/ .text(signUpForm("lastName"), '_label -> Messages("field.lastname"), 'placeholder -> "Doe")), format.raw /*11.99*/ ("""
			"""), _display_( /*12.5*/ b3 /*12.7*/ .text(signUpForm("nick"), '_label -> Messages("field.nick"), 'placeholder -> "Johny")), format.raw /*12.93*/ ("""
			"""), _display_( /*13.5*/ b3 /*13.7*/ .text(signUpForm("email"), '_label -> Messages("field.email"), 'placeholder -> "your@email.com")), format.raw /*13.104*/ ("""
			"""), _display_( /*14.5*/ b3 /*14.7*/ .password(signUpForm("password"), '_label -> Messages("field.password"), 'placeholder -> Messages("field.password"))), format.raw /*14.124*/ ("""
			"""), _display_( /*15.5*/ b3 /*15.7*/ .select(signUpForm("services"), options = User.services.map(s => (s, s)), '_label -> "Select the services you have an account", 'multiple -> true)), format.raw /*15.154*/ ("""
			"""), _display_( /*16.5*/ b3 /*16.7*/ .submit('class -> "btn btn-primary btn-block") /*16.53*/ { _display_(Seq[Any](format.raw /*16.54*/ (""" """), _display_( /*16.56*/ Messages("signup")), format.raw /*16.74*/ (""" """))) }), format.raw /*16.76*/ ("""
			"""), format.raw /*17.4*/ ("""<div class="post-form-opts">
				<p>"""), _display_( /*18.9*/ Messages("signup.signin.question")), format.raw /*18.43*/ (""" """), format.raw /*18.44*/ ("""<a href=""""), _display_( /*18.54*/ routes /*18.60*/ .Auth.signIn), format.raw /*18.72*/ ("""">"""), _display_( /*18.75*/ Messages("signup.signin")), format.raw /*18.100*/ ("""</a></p>
			</div>
		</fieldset>
	""")))
            }), format.raw /*21.3*/ ("""
""")))
          }), format.raw /*22.2*/ ("""
"""))
        }
      }
    }

    def render(signUpForm: Form[User], request: RequestHeader, messages: Messages): play.twirl.api.HtmlFormat.Appendable = apply(signUpForm)(request, messages)

    def f: ((Form[User]) => (RequestHeader, Messages) => play.twirl.api.HtmlFormat.Appendable) = (signUpForm) => (request, messages) => apply(signUpForm)(request, messages)

    def ref: this.type = this

  }

}

/**/
object signUp extends signUp_Scope0.signUp
/*
                  -- GENERATED --
                  DATE: Wed May 09 18:06:43 EAT 2018
                  SOURCE: /home/dan/House of Memes/app/views/auth/signUp.scala.html
                  HASH: 8d591dd8c04380734c7b4a42b999f7c9bec2f376
                  MATRIX: 561->1|794->78|821->143|848->145|874->163|913->165|941->168|952->172|1007->207|1035->210|1044->212|1092->252|1131->254|1160->257|1209->280|1253->304|1293->318|1303->320|1440->435|1471->440|1481->442|1594->534|1625->539|1635->541|1742->627|1773->632|1783->634|1902->731|1933->736|1943->738|2082->855|2113->860|2123->862|2292->1009|2323->1014|2333->1016|2388->1062|2427->1063|2456->1065|2495->1083|2528->1085|2559->1089|2622->1126|2677->1160|2706->1161|2743->1171|2758->1177|2791->1189|2821->1192|2868->1217|2933->1252|2965->1254
                  LINES: 20->1|26->1|27->4|28->5|28->5|28->5|29->6|29->6|29->6|30->7|30->7|30->7|30->7|31->8|32->9|32->9|33->10|33->10|33->10|34->11|34->11|34->11|35->12|35->12|35->12|36->13|36->13|36->13|37->14|37->14|37->14|38->15|38->15|38->15|39->16|39->16|39->16|39->16|39->16|39->16|39->16|40->17|41->18|41->18|41->18|41->18|41->18|41->18|41->18|41->18|44->21|45->22
                  -- GENERATED --
              */
