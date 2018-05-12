
package views.html.templates

import play.twirl.api._
import play.twirl.api.TemplateMagic._

object default_Scope0 {
  import models._
  import controllers._
  import play.api.i18n._
  import views.html._
  import play.api.templates.PlayMagic._
  import play.api.mvc._
  import play.api.data._

  class default extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable, Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template9[String, Option[User], Boolean, String, Html, Html, Html, Html, Messages, play.twirl.api.HtmlFormat.Appendable] {

    /**/
    def apply /*1.2*/ (title: String, loggedUser: Option[User], withMainTabs: Boolean = true, tab: String = "", styles: Html = Html(""), scripts: Html = Html(""), modals: Html = Html(""))(content: Html)(implicit messages: Messages): play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
        {
          import views.html.tags.auth._
          import controllers.routes
          def /*6.2*/ displayToggleLang /*6.19*/ : play.twirl.api.HtmlFormat.Appendable = {
            _display_(

              Seq[Any](format.raw /*6.23*/ ("""
	"""), _display_( /*7.3*/ if (messages.lang.code == "en") /*7.33*/ {
                _display_(Seq[Any](format.raw /*7.35*/ ("""
		"""), format.raw /*8.3*/ ("""<li><a href=""""), _display_( /*8.17*/ routes /*8.23*/ .Application.selectLang("es")), format.raw /*8.52*/ ("""">Español</a></li>
	""")))
              } /*9.4*/ else /*9.9*/ {
                _display_(Seq[Any](format.raw /*9.10*/ ("""
		"""), format.raw /*10.3*/ ("""<li><a href=""""), _display_( /*10.17*/ routes /*10.23*/ .Application.selectLang("en")), format.raw /*10.52*/ ("""">English</a></li>
	""")))
              }), format.raw /*11.3*/ ("""
"""))
            )
          }; def /*14.2*/ navbarContent /*14.15*/ : play.twirl.api.HtmlFormat.Appendable = {
            _display_(

              Seq[Any](format.raw /*14.19*/ ("""
	"""), _display_( /*15.3*/ if (withMainTabs) /*15.19*/ {
                _display_(Seq[Any](format.raw /*15.21*/ ("""
		"""), format.raw /*16.3*/ ("""<ul class="nav navbar-nav">
			<li class=""""), _display_( /*17.16*/ ("active".when(tab == "index"))), format.raw /*17.47*/ (""" """), format.raw /*17.48*/ (""""><a href=""""), _display_( /*17.60*/ routes /*17.66*/ .Application.index), format.raw /*17.84*/ ("""">"""), _display_( /*17.87*/ Messages("Home")), format.raw /*17.103*/ ("""  """), format.raw /*17.105*/ ("""</a></li>
			"""), _display_( /*18.5*/ loggedUser /*18.15*/ .map /*18.19*/ { implicit user =>
                  _display_(Seq[Any](format.raw /*18.38*/ ("""
				
				"""), format.raw /*20.5*/ ("""<li class=""""), _display_( /*20.17*/ ("active".when(tab == "myaccount"))), format.raw /*20.52*/ (""""><a href=""""), _display_( /*20.64*/ routes /*20.70*/ .Application.myAccount), format.raw /*20.92*/ ("""">"""), _display_( /*20.95*/ Messages("topbar.myaccount")), format.raw /*20.123*/ ("""</a></li>

				
				<li class=""""), _display_( /*23.17*/ ("active".when(tab == "Profit"))), format.raw /*23.49*/ (""""><a href=""""), _display_( /*23.61*/ routes /*23.67*/ .Application.profit), format.raw /*23.86*/ ("""">"""), _display_( /*23.89*/ Messages("topbar.profit")), format.raw /*23.114*/ ("""</a></li>

				<li class=""""), _display_( /*25.17*/ ("active".when(tab == "Sales"))), format.raw /*25.48*/ (""""><a href=""""), _display_( /*25.60*/ routes /*25.66*/ .Application.sales), format.raw /*25.84*/ ("""">"""), _display_( /*25.87*/ Messages("topbar.sales")), format.raw /*25.111*/ ("""</a>
				</li>
				
				<li class=""""), _display_( /*28.17*/ ("active".when(tab == "Inventory"))), format.raw /*28.52*/ (""""><a href=""""), _display_( /*28.64*/ routes /*28.70*/ .Application.inventory), format.raw /*28.92*/ ("""">"""), _display_( /*28.95*/ Messages("topbar.inventory")), format.raw /*28.123*/ ("""</a></li>
				
				<li class=""""), _display_( /*30.17*/ ("active".when(tab == "New Customers"))), format.raw /*30.56*/ (""""><a href=""""), _display_( /*30.68*/ routes /*30.74*/ .Application.newcustomers), format.raw /*30.99*/ ("""">"""), _display_( /*30.102*/ Messages("topbar.newcustomers")), format.raw /*30.133*/ ("""</a></li>
			""")))
                }), format.raw /*31.5*/ ("""
		"""), format.raw /*32.3*/ ("""</ul>
	""")))
              }), format.raw /*33.3*/ ("""
	"""), format.raw /*34.2*/ ("""<ul class="nav navbar-nav navbar-right">
		
		"""), _display_( /*36.4*/ loggedUser /*36.14*/ .map /*36.18*/ { user =>
                _display_(Seq[Any](format.raw /*36.28*/ ("""
			"""), format.raw /*37.4*/ ("""<li class="navbar-text text-right" >
				"""), _display_( /*38.6*/ Html(Messages("topbar.hello", s"""<span class="text-success">${user.nick}</span>""", s"""<span class="text-info">${user.services.mkString(", ")}</span>"""))), format.raw /*38.162*/ ("""
			"""), format.raw /*39.4*/ ("""</li>
			
			<li><a href=""""), _display_( /*41.18*/ routes /*41.24*/ .Auth.signOut), format.raw /*41.37*/ ("""">"""), _display_( /*41.40*/ Messages("signout")), format.raw /*41.59*/ ("""</a></li>
		""")))
              } /*42.4*/ .getOrElse /*42.14*/ {
                _display_(Seq[Any](format.raw /*42.16*/ ("""
			
			"""), format.raw /*44.4*/ ("""<li class=""""), _display_( /*44.16*/ ("active".when(tab == "signin"))), format.raw /*44.48*/ (""""><a href=""""), _display_( /*44.60*/ routes /*44.66*/ .Auth.signIn), format.raw /*44.78*/ ("""">"""), _display_( /*44.81*/ Messages("signin")), format.raw /*44.99*/ ("""</a></li>
			<li class=""""), _display_( /*45.16*/ ("active".when(tab == "signup"))), format.raw /*45.48*/ (""""><a href=""""), _display_( /*45.60*/ routes /*45.66*/ .Auth.startSignUp), format.raw /*45.83*/ ("""">"""), _display_( /*45.86*/ Messages("signup")), format.raw /*45.104*/ ("""</a></li>
		""")))
              }), format.raw /*46.4*/ ("""
	"""), format.raw /*47.2*/ ("""</ul>
"""))
            )
          };
          Seq[Any](format.raw /*1.211*/ ("""

"""), format.raw /*5.1*/ ("""
"""), format.raw /*12.2*/ ("""

"""), format.raw /*48.2*/ ("""

"""), _display_( /*50.2*/ main(title, navbarContent, styles, scripts, modals) /*50.53*/ (content)), format.raw /*50.62*/ ("""
"""))
        }
      }
    }

    def render(title: String, loggedUser: Option[User], withMainTabs: Boolean, tab: String, styles: Html, scripts: Html, modals: Html, content: Html, messages: Messages): play.twirl.api.HtmlFormat.Appendable = apply(title, loggedUser, withMainTabs, tab, styles, scripts, modals)(content)(messages)

    def f: ((String, Option[User], Boolean, String, Html, Html, Html) => (Html) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (title, loggedUser, withMainTabs, tab, styles, scripts, modals) => (content) => (messages) => apply(title, loggedUser, withMainTabs, tab, styles, scripts, modals)(content)(messages)

    def ref: this.type = this

  }

}

/**/
object default extends default_Scope0.default
/*
                  -- GENERATED --
                  DATE: Wed May 09 18:06:42 EAT 2018
                  SOURCE: /home/dan/House of Memes/app/views/templates/default.scala.html
                  HASH: 5d893103b360f1ab22faad45d1ce0ed865c7d297
                  MATRIX: 598->1|940->272|965->289|1045->293|1073->296|1111->326|1150->328|1179->331|1219->345|1233->351|1282->380|1320->402|1331->407|1369->408|1399->411|1440->425|1455->431|1505->460|1556->481|1581->486|1603->499|1684->503|1713->506|1738->522|1778->524|1808->527|1878->570|1930->601|1959->602|1998->614|2013->620|2052->638|2082->641|2120->657|2151->659|2191->673|2210->683|2223->687|2280->706|2317->716|2356->728|2412->763|2451->775|2466->781|2509->803|2539->806|2589->834|2648->866|2701->898|2740->910|2755->916|2795->935|2825->938|2872->963|2926->990|2978->1021|3017->1033|3032->1039|3071->1057|3101->1060|3147->1084|3210->1120|3266->1155|3305->1167|3320->1173|3363->1195|3393->1198|3443->1226|3501->1257|3561->1296|3600->1308|3615->1314|3661->1339|3692->1342|3745->1373|3789->1387|3819->1390|3857->1398|3886->1400|3959->1447|3978->1457|3991->1461|4039->1471|4070->1475|4138->1517|4316->1673|4347->1677|4401->1704|4416->1710|4450->1723|4480->1726|4520->1745|4551->1758|4570->1768|4610->1770|4645->1778|4684->1790|4737->1822|4776->1834|4791->1840|4824->1852|4854->1855|4893->1873|4945->1898|4998->1930|5037->1942|5052->1948|5090->1965|5120->1968|5160->1986|5203->1999|5232->2001|5279->210|5307->270|5335->483|5364->2008|5393->2011|5453->2062|5483->2071
                  LINES: 20->1|25->6|25->6|27->6|28->7|28->7|28->7|29->8|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|31->10|32->11|33->14|33->14|35->14|36->15|36->15|36->15|37->16|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|38->17|39->18|39->18|39->18|39->18|41->20|41->20|41->20|41->20|41->20|41->20|41->20|41->20|44->23|44->23|44->23|44->23|44->23|44->23|44->23|46->25|46->25|46->25|46->25|46->25|46->25|46->25|49->28|49->28|49->28|49->28|49->28|49->28|49->28|51->30|51->30|51->30|51->30|51->30|51->30|51->30|52->31|53->32|54->33|55->34|57->36|57->36|57->36|57->36|58->37|59->38|59->38|60->39|62->41|62->41|62->41|62->41|62->41|63->42|63->42|63->42|65->44|65->44|65->44|65->44|65->44|65->44|65->44|65->44|66->45|66->45|66->45|66->45|66->45|66->45|66->45|67->46|68->47|70->1|72->5|73->12|75->48|77->50|77->50|77->50
                  -- GENERATED --
              */
