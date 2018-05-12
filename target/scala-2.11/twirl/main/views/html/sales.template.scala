
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

object sales_Scope0 {
  import models._
  import controllers._
  import play.api.i18n._
  import views.html._
  import play.api.templates.PlayMagic._
  import play.api.mvc._
  import play.api.data._

  class sales extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable, Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[User, Messages, play.twirl.api.HtmlFormat.Appendable] {

    /**/
    def apply /*1.2*/ ()(implicit user: User, messages: Messages): play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
        {
          import controllers.routes

          Seq[Any](format.raw /*1.45*/ ("""


"""), format.raw /*5.1*/ ("""
"""), _display_( /*6.2*/ views /*6.7*/ .html.templates.logged(title = "Sales", tab = "Sales") /*6.61*/ {
            _display_(Seq[Any](format.raw /*6.63*/ ("""

"""), format.raw /*8.1*/ ("""<hr>
<div class="well">


<h1 class="text-center">Our sales this month</h1>
<br>

 	<table class="table table-striped table-condensed">

		<th> Item</th>
		<th> Amount </th>

        <tr>
			<td>Memes frame</td>
			<td> 3,600</td>
		</tr>
		<tr>
			<td>House of meme app</td>
			<td>90,000 downloads</td>
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
          }))
        }
      }
    }

    def render(user: User, messages: Messages): play.twirl.api.HtmlFormat.Appendable = apply()(user, messages)

    def f: (() => (User, Messages) => play.twirl.api.HtmlFormat.Appendable) = () => (user, messages) => apply()(user, messages)

    def ref: this.type = this

  }

}

/**/
object sales extends sales_Scope0.sales
/*
                  -- GENERATED --
                  DATE: Wed May 09 18:06:42 EAT 2018
                  SOURCE: /home/dan/House of Memes/app/views/sales.scala.html
                  HASH: b8462ec4a635cf997cc0a6953377cf52318f2f61
                  MATRIX: 534->1|697->44|726->74|753->76|765->81|827->135|866->137|894->139
                  LINES: 20->1|25->1|28->5|29->6|29->6|29->6|29->6|31->8
                  -- GENERATED --
              */
