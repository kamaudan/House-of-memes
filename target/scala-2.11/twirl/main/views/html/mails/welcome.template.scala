
package views.html.mails

import play.twirl.api._
import play.twirl.api.TemplateMagic._

object welcome_Scope0 {
  import models._
  import controllers._
  import play.api.i18n._
  import views.html._
  import play.api.templates.PlayMagic._
  import play.api.mvc._
  import play.api.data._

  class welcome extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable, Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String, String, Messages, play.twirl.api.HtmlFormat.Appendable] {

    /**/
    def apply /*1.2*/ (name: String, link: String)(implicit messages: Messages): play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
        {

          Seq[Any](format.raw /*1.59*/ ("""
"""), format.raw /*2.1*/ ("""<html>
<head><meta charset="utf-8"></head>
<body>
	<p>"""), _display_( /*5.6*/ Messages("mail.welcome.hello", name)), format.raw /*5.42*/ ("""</p>
	<p>"""), _display_( /*6.6*/ Messages("mail.welcome.prelink")), format.raw /*6.38*/ ("""</p>
	<a href=""""), _display_( /*7.12*/ link), format.raw /*7.16*/ ("""">"""), _display_( /*7.19*/ link), format.raw /*7.23*/ ("""</a>
	<p>"""), _display_( /*8.6*/ Messages("mail.welcome.postlink")), format.raw /*8.39*/ ("""</p>
	<p>"""), _display_( /*9.6*/ Messages("mail.sign")), format.raw /*9.27*/ ("""</p>
</body>
</html>"""))
        }
      }
    }

    def render(name: String, link: String, messages: Messages): play.twirl.api.HtmlFormat.Appendable = apply(name, link)(messages)

    def f: ((String, String) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (name, link) => (messages) => apply(name, link)(messages)

    def ref: this.type = this

  }

}

/**/
object welcome extends welcome_Scope0.welcome
/*
                  -- GENERATED --
                  DATE: Wed May 09 18:06:42 EAT 2018
                  SOURCE: /home/dan/House of Memes/app/views/mails/welcome.scala.html
                  HASH: c5891de3dd150a0b25b8c5914f09cb9de9691f16
                  MATRIX: 553->1|705->58|732->59|812->114|868->150|903->160|955->192|997->208|1021->212|1050->215|1074->219|1109->229|1162->262|1197->272|1238->293
                  LINES: 20->1|25->1|26->2|29->5|29->5|30->6|30->6|31->7|31->7|31->7|31->7|32->8|32->8|33->9|33->9
                  -- GENERATED --
              */
