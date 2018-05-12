
package views.html.errors

import play.twirl.api._
import play.twirl.api.TemplateMagic._

object accessDenied_Scope0 {
  import models._
  import controllers._
  import play.api.i18n._
  import views.html._
  import play.api.templates.PlayMagic._
  import play.api.mvc._
  import play.api.data._

  class accessDenied extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable, Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[RequestHeader, Messages, play.twirl.api.HtmlFormat.Appendable] {

    /**/
    def apply /*1.2*/ ()(implicit request: RequestHeader, messages: Messages): play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
        {

          Seq[Any](format.raw /*1.57*/ ("""
"""), _display_( /*2.2*/ views /*2.7*/ .html.templates.default("Access Denied", None) /*2.53*/ {
            _display_(Seq[Any](format.raw /*2.55*/ ("""
	"""), _display_( /*3.3*/ tags /*3.7*/ .alertFromRequest(request, "error")), format.raw /*3.42*/ ("""
	"""), format.raw /*4.2*/ ("""<h1 class="text-primary">"""), _display_( /*4.28*/ Messages("denied.title")), format.raw /*4.52*/ ("""</h1>
	<h3 class="text-danger">"""), _display_( /*5.27*/ Messages("denied.text")), format.raw /*5.50*/ ("""</h3>
""")))
          }))
        }
      }
    }

    def render(request: RequestHeader, messages: Messages): play.twirl.api.HtmlFormat.Appendable = apply()(request, messages)

    def f: (() => (RequestHeader, Messages) => play.twirl.api.HtmlFormat.Appendable) = () => (request, messages) => apply()(request, messages)

    def ref: this.type = this

  }

}

/**/
object accessDenied extends accessDenied_Scope0.accessDenied
/*
                  -- GENERATED --
                  DATE: Wed May 09 18:06:42 EAT 2018
                  SOURCE: /home/dan/House of Memes/app/views/errors/accessDenied.scala.html
                  HASH: 101007c8c6da837a4ac7a40fd9cd4c314794472a
                  MATRIX: 564->1|714->56|741->58|753->63|807->109|846->111|874->114|885->118|940->153|968->155|1020->181|1064->205|1122->237|1165->260
                  LINES: 20->1|25->1|26->2|26->2|26->2|26->2|27->3|27->3|27->3|28->4|28->4|28->4|29->5|29->5
                  -- GENERATED --
              */
