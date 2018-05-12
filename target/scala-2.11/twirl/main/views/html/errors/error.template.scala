
package views.html.errors

import play.twirl.api._
import play.twirl.api.TemplateMagic._

object error_Scope0 {
  import models._
  import controllers._
  import play.api.i18n._
  import views.html._
  import play.api.templates.PlayMagic._
  import play.api.mvc._
  import play.api.data._

  class error extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable, Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[RequestHeader, play.api.UsefulException, Messages, play.twirl.api.HtmlFormat.Appendable] {

    /**/
    def apply /*1.2*/ (request: RequestHeader, error: play.api.UsefulException)(implicit messages: Messages): play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
        {

          Seq[Any](format.raw /*1.88*/ ("""
"""), _display_( /*2.2*/ views /*2.7*/ .html.templates.main("Oops, an error occurred") /*2.54*/ {
            _display_(Seq[Any](format.raw /*2.56*/ ("""
	"""), format.raw /*3.2*/ ("""<h1>"""), _display_( /*3.7*/ Messages("error.unknown.title")), format.raw /*3.38*/ ("""</h1>
	<p>"""), _display_( /*4.6*/ Messages("error.unknown.text", error.id)), format.raw /*4.46*/ ("""</p>
""")))
          }))
        }
      }
    }

    def render(request: RequestHeader, error: play.api.UsefulException, messages: Messages): play.twirl.api.HtmlFormat.Appendable = apply(request, error)(messages)

    def f: ((RequestHeader, play.api.UsefulException) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (request, error) => (messages) => apply(request, error)(messages)

    def ref: this.type = this

  }

}

/**/
object error extends error_Scope0.error
/*
                  -- GENERATED --
                  DATE: Wed May 09 18:06:42 EAT 2018
                  SOURCE: /home/dan/House of Memes/app/views/errors/error.scala.html
                  HASH: 681077aac519bbb8b63d730c8ff493dafd52d27d
                  MATRIX: 575->1|756->87|783->89|795->94|850->141|889->143|917->145|947->150|998->181|1034->192|1094->232
                  LINES: 20->1|25->1|26->2|26->2|26->2|26->2|27->3|27->3|27->3|28->4|28->4
                  -- GENERATED --
              */
