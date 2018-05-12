
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

object newcustomers_Scope0 {
  import models._
  import controllers._
  import play.api.i18n._
  import views.html._
  import play.api.templates.PlayMagic._
  import play.api.mvc._
  import play.api.data._

  class newcustomers extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable, Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[User, Messages, play.twirl.api.HtmlFormat.Appendable] {

    /**/
    def apply /*1.2*/ ()(implicit user: User, messages: Messages): play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
        {
          import controllers.routes

          Seq[Any](format.raw /*1.45*/ ("""

"""), format.raw /*4.1*/ ("""
"""), _display_( /*5.2*/ views /*5.7*/ .html.templates.logged(title = "New Customers", tab = "New Customers") /*5.77*/ {
            _display_(Seq[Any](format.raw /*5.79*/ ("""
	"""), format.raw /*6.2*/ ("""<hr>
	
	<div class="well">
	<h1 class="text-center">Our new customers</h1>
	<br>

	
	<table class="table table-striped table-condensed">

		<th>Customer</th>
		<th>Location</th>
		<th>Since</th>

        <tr>
			<td>Teldron athletics</td>
			<td>Sydney Australia</td>
			<td> 03rd May 2018</td>
		</tr>
		<tr>
			<td>DCOS:Mesos</td>
			<td>United States </td>
			<td>05th May 2018</td>
		</tr>
		<tr>
			<td>Confluent</td>
			<td>Swissland</td>
			<td>10th May 2018 </td>
		</tr>
		<tr>
			<td>XIVELY</td>
			<td>United Kingdom</td>
			<td>15th May  2018</td>
		</tr>
		<tr>
			<td>Glaucon Analytics</td>
			<td>Kenya</td>
			<td>20th May 2018</td>
		</tr>
	</table>

	</div>

""")))
          }), format.raw /*48.2*/ ("""
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
object newcustomers extends newcustomers_Scope0.newcustomers
/*
                  -- GENERATED --
                  DATE: Wed May 09 18:06:42 EAT 2018
                  SOURCE: /home/dan/House of Memes/app/views/newcustomers.scala.html
                  HASH: 51225bd6f5f70fab3d424a695d6064cf774857cd
                  MATRIX: 548->1|711->44|739->73|766->75|778->80|856->150|895->152|923->154|1631->832
                  LINES: 20->1|25->1|27->4|28->5|28->5|28->5|28->5|29->6|71->48
                  -- GENERATED --
              */
