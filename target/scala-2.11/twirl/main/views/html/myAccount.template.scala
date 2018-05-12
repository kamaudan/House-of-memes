
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

object myAccount_Scope0 {
  import models._
  import controllers._
  import play.api.i18n._
  import views.html._
  import play.api.templates.PlayMagic._
  import play.api.mvc._
  import play.api.data._

  class myAccount extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable, Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[RequestHeader, User, Messages, play.twirl.api.HtmlFormat.Appendable] {

    /**/
    def apply /*1.2*/ ()(implicit request: RequestHeader, user: User, messages: Messages): play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
        {
          import controllers.routes

          Seq[Any](format.raw /*1.69*/ ("""

"""), format.raw /*4.1*/ ("""
"""), _display_( /*5.2*/ views /*5.7*/ .html.templates.logged(title = "My account", tab = "myaccount") /*5.70*/ {
            _display_(Seq[Any](format.raw /*5.72*/ ("""
	
	"""), _display_( /*7.3*/ tags /*7.7*/ .alertFromRequest(request, "success")), format.raw /*7.44*/ ("""
	"""), format.raw /*8.2*/ ("""<hr>
	<div class="well">
	
	
	<h1>"""), _display_( /*12.7*/ Messages("myaccount.title")), format.raw /*12.34*/ (""" """), format.raw /*12.35*/ ("""<a class="btn btn-default btn-sm pull-right" href=""""), _display_( /*12.87*/ routes /*12.93*/ .Auth.changePassword), format.raw /*12.113*/ ("""">"""), _display_( /*12.116*/ Messages("changepass")), format.raw /*12.138*/ ("""</a></h1>
	
	<table class="table table-striped table-condensed">
		<tr>
			<td>"""), _display_( /*16.9*/ Messages("field.email")), format.raw /*16.32*/ ("""</td>
			<td>"""), _display_( /*17.9*/ user /*17.13*/ .email), format.raw /*17.19*/ ("""</td>
		</tr>
		<tr>
			<td>"""), _display_( /*20.9*/ Messages("field.firstname")), format.raw /*20.36*/ ("""</td>
			<td>"""), _display_( /*21.9*/ user /*21.13*/ .firstName), format.raw /*21.23*/ ("""</td>
		</tr>
		<tr>
			<td>"""), _display_( /*24.9*/ Messages("field.lastname")), format.raw /*24.35*/ ("""</td>
			<td>"""), _display_( /*25.9*/ user /*25.13*/ .lastName), format.raw /*25.22*/ ("""</td>
		</tr>
		<tr>
			<td>"""), _display_( /*28.9*/ Messages("field.services")), format.raw /*28.35*/ ("""</td>
			<td>"""), _display_( /*29.9*/ user /*29.13*/ .services.mkString(", ")), format.raw /*29.37*/ ("""</td>
		</tr>
	</table>
</div>
""")))
          }))
        }
      }
    }

    def render(request: RequestHeader, user: User, messages: Messages): play.twirl.api.HtmlFormat.Appendable = apply()(request, user, messages)

    def f: (() => (RequestHeader, User, Messages) => play.twirl.api.HtmlFormat.Appendable) = () => (request, user, messages) => apply()(request, user, messages)

    def ref: this.type = this

  }

}

/**/
object myAccount extends myAccount_Scope0.myAccount
/*
                  -- GENERATED --
                  DATE: Wed May 09 18:06:42 EAT 2018
                  SOURCE: /home/dan/House of Memes/app/views/myAccount.scala.html
                  HASH: d80c99b009123015fe550c3819eeca1700036472
                  MATRIX: 556->1|743->68|771->97|798->99|810->104|881->167|920->169|950->174|961->178|1018->215|1046->217|1107->252|1155->279|1184->280|1263->332|1278->338|1320->358|1351->361|1395->383|1501->463|1545->486|1585->500|1598->504|1625->510|1680->539|1728->566|1768->580|1781->584|1812->594|1867->623|1914->649|1954->663|1967->667|1997->676|2052->705|2099->731|2139->745|2152->749|2197->773
                  LINES: 20->1|25->1|27->4|28->5|28->5|28->5|28->5|30->7|30->7|30->7|31->8|35->12|35->12|35->12|35->12|35->12|35->12|35->12|35->12|39->16|39->16|40->17|40->17|40->17|43->20|43->20|44->21|44->21|44->21|47->24|47->24|48->25|48->25|48->25|51->28|51->28|52->29|52->29|52->29
                  -- GENERATED --
              */
