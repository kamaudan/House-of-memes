
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

object inventory_Scope0 {
  import models._
  import controllers._
  import play.api.i18n._
  import views.html._
  import play.api.templates.PlayMagic._
  import play.api.mvc._
  import play.api.data._

  class inventory extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable, Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[User, Messages, play.twirl.api.HtmlFormat.Appendable] {

    /**/
    def apply /*1.2*/ ()(implicit user: User, messages: Messages): play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
        {
          import controllers.routes

          Seq[Any](format.raw /*1.45*/ ("""

"""), format.raw /*4.1*/ ("""
"""), _display_( /*5.2*/ views /*5.7*/ .html.templates.logged(title = "Inventory", tab = "Inventory") /*5.69*/ {
            _display_(Seq[Any](format.raw /*5.71*/ ("""

    """), format.raw /*7.5*/ ("""<hr>
	<div class="well">
	
	<h1 class="text-center">Our Inventory this month</h1>
	
	<h5 class="text-center"> We have added 9,400 memes online this month, resulting to 17, 000,000 views</h5>
	<br>

	<table class="table table-striped table-condensed">

		<th> Name of meme</th>
		<th> Amount </th>

        <tr>
			<td>Memes of love</td>
			<td> 1,800</td>
		</tr>
		<tr>
			<td>Robert mugabe quotes</td>
			<td> 3,600</td>
		</tr>
		<tr>
			<td>Funny Videos</td>
			<td>2,000</td>
		</tr>
		<tr>
			<td>Street 'wisdom'</td>
			<td>2,000</td>
		</tr>
	</table>
</div>

""")))
          }), format.raw /*39.2*/ ("""
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
object inventory extends inventory_Scope0.inventory
/*
                  -- GENERATED --
                  DATE: Wed May 09 18:06:42 EAT 2018
                  SOURCE: /home/dan/House of Memes/app/views/inventory.scala.html
                  HASH: bbde3f469657253a73f4ef6c3128f8fda8153884
                  MATRIX: 542->1|705->44|733->73|760->75|772->80|842->142|881->144|913->150|1512->719
                  LINES: 20->1|25->1|27->4|28->5|28->5|28->5|28->5|30->7|62->39
                  -- GENERATED --
              */
