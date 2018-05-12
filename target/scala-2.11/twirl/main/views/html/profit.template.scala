
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

object profit_Scope0 {
  import models._
  import controllers._
  import play.api.i18n._
  import views.html._
  import play.api.templates.PlayMagic._
  import play.api.mvc._
  import play.api.data._

  class profit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable, Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[User, Messages, play.twirl.api.HtmlFormat.Appendable] {

    /**/
    def apply /*1.2*/ ()(implicit user: User, messages: Messages): play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
        {
          import controllers.routes

          Seq[Any](format.raw /*1.45*/ ("""

"""), format.raw /*4.1*/ ("""
"""), _display_( /*5.2*/ views /*5.7*/ .html.templates.logged(title = "Profit", tab = "Profit") /*5.63*/ {
            _display_(Seq[Any](format.raw /*5.65*/ ("""
	"""), format.raw /*6.2*/ ("""<hr>
	<div class="well">
	
	<h1 class="text-center">Our profit: May 2018</h1>
	<br>
	
	<table class="table table-striped table-condensed">

		<th> Item</th>
		<th> Amount </th>

        <tr>
			<td>Memes frame</td>
			<td>Ksh 300,000</td>
		</tr>
		<tr>
			<td>House of meme app</td>
			<td> $ 1000</td>
		</tr>
		<tr>
			<td>Events</td>
			<td>$ 10,000</td>
		</tr>
		<tr>
			<td>Coporate</td>
			<td>$ 3000</td>
		</tr>
	</table>
</div>

""")))
          }), format.raw /*36.2*/ ("""
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
object profit extends profit_Scope0.profit
/*
                  -- GENERATED --
                  DATE: Wed May 09 18:06:42 EAT 2018
                  SOURCE: /home/dan/House of Memes/app/views/profit.scala.html
                  HASH: d0703ef8ef7978bed7193152e4596a7a0528d915
                  MATRIX: 536->1|699->44|727->73|754->75|766->80|830->136|869->138|897->140|1368->581
                  LINES: 20->1|25->1|27->4|28->5|28->5|28->5|28->5|29->6|59->36
                  -- GENERATED --
              */
