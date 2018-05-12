
package views.html.errors

import play.twirl.api._
import play.twirl.api.TemplateMagic._

object notFound_Scope0 {
  import models._
  import controllers._
  import play.api.i18n._
  import views.html._
  import play.api.templates.PlayMagic._
  import play.api.mvc._
  import play.api.data._

  class notFound extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable, Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[RequestHeader, Messages, play.twirl.api.HtmlFormat.Appendable] {

    /**/
    def apply /*1.2*/ (request: RequestHeader)(implicit messages: Messages): play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
        {

          Seq[Any](format.raw /*1.55*/ ("""
"""), _display_( /*2.2*/ views /*2.7*/ .html.templates.main("Handler Not Found") /*2.48*/ {
            _display_(Seq[Any](format.raw /*2.50*/ ("""
  """), format.raw /*3.3*/ ("""<h1>"""), _display_( /*3.8*/ Messages("error.notfound.title")), format.raw /*3.40*/ ("""</h1>
	<p>"""), _display_( /*4.6*/ Messages("error.notfound.text", request.method + " " + request.uri)), format.raw /*4.73*/ ("""</p>
""")))
          }))
        }
      }
    }

    def render(request: RequestHeader, messages: Messages): play.twirl.api.HtmlFormat.Appendable = apply(request)(messages)

    def f: ((RequestHeader) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (request) => (messages) => apply(request)(messages)

    def ref: this.type = this

  }

}

/**/
object notFound extends notFound_Scope0.notFound
/*
                  -- GENERATED --
                  DATE: Wed May 09 18:06:42 EAT 2018
                  SOURCE: /home/dan/House of Memes/app/views/errors/notFound.scala.html
                  HASH: d9f2b58a6149e03aff4188e129e7da132c725fd7
                  MATRIX: 556->1|704->54|731->56|743->61|792->102|831->104|860->107|890->112|942->144|978->155|1065->222
                  LINES: 20->1|25->1|26->2|26->2|26->2|26->2|27->3|27->3|27->3|28->4|28->4
                  -- GENERATED --
              */
