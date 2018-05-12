
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dan/House of Memes/conf/routes
// @DATE:Sat May 12 11:51:21 EAT 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Auth_1: controllers.Auth,
  // @LINE:21
  Application_0: controllers.Application,
  // @LINE:33
  MyAssets_2: controllers.MyAssets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Auth_1: controllers.Auth,
    // @LINE:21
    Application_0: controllers.Application,
    // @LINE:33
    MyAssets_2: controllers.MyAssets
  ) = this(errorHandler, Auth_1, Application_0, MyAssets_2, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Auth_1, Application_0, MyAssets_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.Auth.startSignUp"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.Auth.handleStartSignUp"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup/""" + "$" + """token<[^/]+>""", """controllers.Auth.signUp(token:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signin""", """controllers.Auth.signIn"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """authenticate""", """controllers.Auth.authenticate"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signout""", """controllers.Auth.signOut"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reset-password""", """controllers.Auth.forgotPassword"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reset-password""", """controllers.Auth.handleForgotPassword"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reset-password/""" + "$" + """token<[^/]+>""", """controllers.Auth.resetPassword(token:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reset-password/""" + "$" + """token<[^/]+>""", """controllers.Auth.handleResetPassword(token:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """change-password""", """controllers.Auth.changePassword"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """change-password""", """controllers.Auth.handleChangePassword"""),
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profit""", """controllers.Application.profit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newcustomers""", """controllers.Application.newcustomers"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """inventory""", """controllers.Application.inventory"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """settings""", """controllers.Application.settings"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """myaccount""", """controllers.Application.myAccount"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sales""", """controllers.Application.sales"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """lang/""" + "$" + """lang<(en|es)>""", """controllers.Application.selectLang(lang:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """public/""" + "$" + """file<.+>""", """controllers.MyAssets.public(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """lib/""" + "$" + """file<.+>""", """controllers.MyAssets.lib(path:String = "/public/lib", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """css/""" + "$" + """file<.+>""", """controllers.MyAssets.css(path:String = "/public/stylesheets", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """js/""" + "$" + """file<.+>""", """controllers.MyAssets.js(path:String = "/public/javascripts", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """img/""" + "$" + """file<.+>""", """controllers.MyAssets.img(path:String = "/public/images", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """common/css/""" + "$" + """file<.+>""", """controllers.MyAssets.commonCss(path:String = "/public/lib/common/stylesheets", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """common/js/""" + "$" + """file<.+>""", """controllers.MyAssets.commonJs(path:String = "/public/lib/common/javascripts", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """common/img/""" + "$" + """file<.+>""", """controllers.MyAssets.commonImg(path:String = "/public/lib/common/images", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Auth_startSignUp0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_Auth_startSignUp0_invoker = createInvoker(
    Auth_1.startSignUp,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Auth",
      "startSignUp",
      Nil,
      "GET",
      """ Authentication pages""",
      this.prefix + """signup"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Auth_handleStartSignUp1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_Auth_handleStartSignUp1_invoker = createInvoker(
    Auth_1.handleStartSignUp,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Auth",
      "handleStartSignUp",
      Nil,
      "POST",
      """""",
      this.prefix + """signup"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Auth_signUp2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Auth_signUp2_invoker = createInvoker(
    Auth_1.signUp(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Auth",
      "signUp",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """signup/""" + "$" + """token<[^/]+>"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Auth_signIn3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signin")))
  )
  private[this] lazy val controllers_Auth_signIn3_invoker = createInvoker(
    Auth_1.signIn,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Auth",
      "signIn",
      Nil,
      "GET",
      """""",
      this.prefix + """signin"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Auth_authenticate4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("authenticate")))
  )
  private[this] lazy val controllers_Auth_authenticate4_invoker = createInvoker(
    Auth_1.authenticate,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Auth",
      "authenticate",
      Nil,
      "POST",
      """""",
      this.prefix + """authenticate"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Auth_signOut5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signout")))
  )
  private[this] lazy val controllers_Auth_signOut5_invoker = createInvoker(
    Auth_1.signOut,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Auth",
      "signOut",
      Nil,
      "GET",
      """""",
      this.prefix + """signout"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Auth_forgotPassword6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset-password")))
  )
  private[this] lazy val controllers_Auth_forgotPassword6_invoker = createInvoker(
    Auth_1.forgotPassword,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Auth",
      "forgotPassword",
      Nil,
      "GET",
      """""",
      this.prefix + """reset-password"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Auth_handleForgotPassword7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset-password")))
  )
  private[this] lazy val controllers_Auth_handleForgotPassword7_invoker = createInvoker(
    Auth_1.handleForgotPassword,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Auth",
      "handleForgotPassword",
      Nil,
      "POST",
      """""",
      this.prefix + """reset-password"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Auth_resetPassword8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset-password/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Auth_resetPassword8_invoker = createInvoker(
    Auth_1.resetPassword(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Auth",
      "resetPassword",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """reset-password/""" + "$" + """token<[^/]+>"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Auth_handleResetPassword9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset-password/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Auth_handleResetPassword9_invoker = createInvoker(
    Auth_1.handleResetPassword(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Auth",
      "handleResetPassword",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """reset-password/""" + "$" + """token<[^/]+>"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Auth_changePassword10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("change-password")))
  )
  private[this] lazy val controllers_Auth_changePassword10_invoker = createInvoker(
    Auth_1.changePassword,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Auth",
      "changePassword",
      Nil,
      "GET",
      """""",
      this.prefix + """change-password"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Auth_handleChangePassword11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("change-password")))
  )
  private[this] lazy val controllers_Auth_handleChangePassword11_invoker = createInvoker(
    Auth_1.handleChangePassword,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Auth",
      "handleChangePassword",
      Nil,
      "POST",
      """""",
      this.prefix + """change-password"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Application_index12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index12_invoker = createInvoker(
    Application_0.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Application_profit13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profit")))
  )
  private[this] lazy val controllers_Application_profit13_invoker = createInvoker(
    Application_0.profit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "profit",
      Nil,
      "GET",
      """""",
      this.prefix + """profit"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Application_newcustomers14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newcustomers")))
  )
  private[this] lazy val controllers_Application_newcustomers14_invoker = createInvoker(
    Application_0.newcustomers,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "newcustomers",
      Nil,
      "GET",
      """""",
      this.prefix + """newcustomers"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Application_inventory15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("inventory")))
  )
  private[this] lazy val controllers_Application_inventory15_invoker = createInvoker(
    Application_0.inventory,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "inventory",
      Nil,
      "GET",
      """""",
      this.prefix + """inventory"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Application_settings16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("settings")))
  )
  private[this] lazy val controllers_Application_settings16_invoker = createInvoker(
    Application_0.settings,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "settings",
      Nil,
      "GET",
      """""",
      this.prefix + """settings"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Application_myAccount17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("myaccount")))
  )
  private[this] lazy val controllers_Application_myAccount17_invoker = createInvoker(
    Application_0.myAccount,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "myAccount",
      Nil,
      "GET",
      """""",
      this.prefix + """myaccount"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Application_sales18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sales")))
  )
  private[this] lazy val controllers_Application_sales18_invoker = createInvoker(
    Application_0.sales,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "sales",
      Nil,
      "GET",
      """""",
      this.prefix + """sales"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_Application_selectLang19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lang/"), DynamicPart("lang", """(en|es)""",false)))
  )
  private[this] lazy val controllers_Application_selectLang19_invoker = createInvoker(
    Application_0.selectLang(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "selectLang",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """lang/""" + "$" + """lang<(en|es)>"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_MyAssets_public20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("public/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_MyAssets_public20_invoker = createInvoker(
    MyAssets_2.public(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MyAssets",
      "public",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """public/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_MyAssets_lib21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lib/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_MyAssets_lib21_invoker = createInvoker(
    MyAssets_2.lib(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MyAssets",
      "lib",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """""",
      this.prefix + """lib/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_MyAssets_css22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("css/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_MyAssets_css22_invoker = createInvoker(
    MyAssets_2.css(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MyAssets",
      "css",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """""",
      this.prefix + """css/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_MyAssets_js23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("js/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_MyAssets_js23_invoker = createInvoker(
    MyAssets_2.js(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MyAssets",
      "js",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """""",
      this.prefix + """js/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_MyAssets_img24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("img/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_MyAssets_img24_invoker = createInvoker(
    MyAssets_2.img(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MyAssets",
      "img",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """""",
      this.prefix + """img/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_MyAssets_commonCss25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("common/css/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_MyAssets_commonCss25_invoker = createInvoker(
    MyAssets_2.commonCss(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MyAssets",
      "commonCss",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """""",
      this.prefix + """common/css/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_MyAssets_commonJs26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("common/js/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_MyAssets_commonJs26_invoker = createInvoker(
    MyAssets_2.commonJs(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MyAssets",
      "commonJs",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """""",
      this.prefix + """common/js/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_MyAssets_commonImg27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("common/img/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_MyAssets_commonImg27_invoker = createInvoker(
    MyAssets_2.commonImg(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MyAssets",
      "commonImg",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """""",
      this.prefix + """common/img/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Auth_startSignUp0_route(params) =>
      call { 
        controllers_Auth_startSignUp0_invoker.call(Auth_1.startSignUp)
      }
  
    // @LINE:7
    case controllers_Auth_handleStartSignUp1_route(params) =>
      call { 
        controllers_Auth_handleStartSignUp1_invoker.call(Auth_1.handleStartSignUp)
      }
  
    // @LINE:8
    case controllers_Auth_signUp2_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_Auth_signUp2_invoker.call(Auth_1.signUp(token))
      }
  
    // @LINE:9
    case controllers_Auth_signIn3_route(params) =>
      call { 
        controllers_Auth_signIn3_invoker.call(Auth_1.signIn)
      }
  
    // @LINE:10
    case controllers_Auth_authenticate4_route(params) =>
      call { 
        controllers_Auth_authenticate4_invoker.call(Auth_1.authenticate)
      }
  
    // @LINE:11
    case controllers_Auth_signOut5_route(params) =>
      call { 
        controllers_Auth_signOut5_invoker.call(Auth_1.signOut)
      }
  
    // @LINE:12
    case controllers_Auth_forgotPassword6_route(params) =>
      call { 
        controllers_Auth_forgotPassword6_invoker.call(Auth_1.forgotPassword)
      }
  
    // @LINE:13
    case controllers_Auth_handleForgotPassword7_route(params) =>
      call { 
        controllers_Auth_handleForgotPassword7_invoker.call(Auth_1.handleForgotPassword)
      }
  
    // @LINE:14
    case controllers_Auth_resetPassword8_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_Auth_resetPassword8_invoker.call(Auth_1.resetPassword(token))
      }
  
    // @LINE:15
    case controllers_Auth_handleResetPassword9_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_Auth_handleResetPassword9_invoker.call(Auth_1.handleResetPassword(token))
      }
  
    // @LINE:16
    case controllers_Auth_changePassword10_route(params) =>
      call { 
        controllers_Auth_changePassword10_invoker.call(Auth_1.changePassword)
      }
  
    // @LINE:17
    case controllers_Auth_handleChangePassword11_route(params) =>
      call { 
        controllers_Auth_handleChangePassword11_invoker.call(Auth_1.handleChangePassword)
      }
  
    // @LINE:21
    case controllers_Application_index12_route(params) =>
      call { 
        controllers_Application_index12_invoker.call(Application_0.index)
      }
  
    // @LINE:22
    case controllers_Application_profit13_route(params) =>
      call { 
        controllers_Application_profit13_invoker.call(Application_0.profit)
      }
  
    // @LINE:23
    case controllers_Application_newcustomers14_route(params) =>
      call { 
        controllers_Application_newcustomers14_invoker.call(Application_0.newcustomers)
      }
  
    // @LINE:24
    case controllers_Application_inventory15_route(params) =>
      call { 
        controllers_Application_inventory15_invoker.call(Application_0.inventory)
      }
  
    // @LINE:25
    case controllers_Application_settings16_route(params) =>
      call { 
        controllers_Application_settings16_invoker.call(Application_0.settings)
      }
  
    // @LINE:26
    case controllers_Application_myAccount17_route(params) =>
      call { 
        controllers_Application_myAccount17_invoker.call(Application_0.myAccount)
      }
  
    // @LINE:27
    case controllers_Application_sales18_route(params) =>
      call { 
        controllers_Application_sales18_invoker.call(Application_0.sales)
      }
  
    // @LINE:29
    case controllers_Application_selectLang19_route(params) =>
      call(params.fromPath[String]("lang", None)) { (lang) =>
        controllers_Application_selectLang19_invoker.call(Application_0.selectLang(lang))
      }
  
    // @LINE:33
    case controllers_MyAssets_public20_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_MyAssets_public20_invoker.call(MyAssets_2.public(path, file))
      }
  
    // @LINE:34
    case controllers_MyAssets_lib21_route(params) =>
      call(Param[String]("path", Right("/public/lib")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_MyAssets_lib21_invoker.call(MyAssets_2.lib(path, file))
      }
  
    // @LINE:35
    case controllers_MyAssets_css22_route(params) =>
      call(Param[String]("path", Right("/public/stylesheets")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_MyAssets_css22_invoker.call(MyAssets_2.css(path, file))
      }
  
    // @LINE:36
    case controllers_MyAssets_js23_route(params) =>
      call(Param[String]("path", Right("/public/javascripts")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_MyAssets_js23_invoker.call(MyAssets_2.js(path, file))
      }
  
    // @LINE:37
    case controllers_MyAssets_img24_route(params) =>
      call(Param[String]("path", Right("/public/images")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_MyAssets_img24_invoker.call(MyAssets_2.img(path, file))
      }
  
    // @LINE:38
    case controllers_MyAssets_commonCss25_route(params) =>
      call(Param[String]("path", Right("/public/lib/common/stylesheets")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_MyAssets_commonCss25_invoker.call(MyAssets_2.commonCss(path, file))
      }
  
    // @LINE:39
    case controllers_MyAssets_commonJs26_route(params) =>
      call(Param[String]("path", Right("/public/lib/common/javascripts")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_MyAssets_commonJs26_invoker.call(MyAssets_2.commonJs(path, file))
      }
  
    // @LINE:40
    case controllers_MyAssets_commonImg27_route(params) =>
      call(Param[String]("path", Right("/public/lib/common/images")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_MyAssets_commonImg27_invoker.call(MyAssets_2.commonImg(path, file))
      }
  }
}
