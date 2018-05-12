
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dan/House of Memes/conf/routes
// @DATE:Sat May 12 11:51:21 EAT 2018

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseAuth(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def handleChangePassword(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "change-password")
    }
  
    // @LINE:6
    def startSignUp(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:7
    def handleStartSignUp(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:13
    def handleForgotPassword(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "reset-password")
    }
  
    // @LINE:11
    def signOut(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "signout")
    }
  
    // @LINE:14
    def resetPassword(token:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "reset-password/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
    }
  
    // @LINE:8
    def signUp(token:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "signup/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
    }
  
    // @LINE:12
    def forgotPassword(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "reset-password")
    }
  
    // @LINE:16
    def changePassword(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "change-password")
    }
  
    // @LINE:15
    def handleResetPassword(token:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "reset-password/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
    }
  
    // @LINE:10
    def authenticate(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "authenticate")
    }
  
    // @LINE:9
    def signIn(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "signin")
    }
  
  }

  // @LINE:33
  class ReverseMyAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:33
    def public(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "public/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
    // @LINE:38
    def commonCss(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/lib/common/stylesheets")))
      Call("GET", _prefix + { _defaultPrefix } + "common/css/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
    // @LINE:35
    def css(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/stylesheets")))
      Call("GET", _prefix + { _defaultPrefix } + "css/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
    // @LINE:34
    def lib(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/lib")))
      Call("GET", _prefix + { _defaultPrefix } + "lib/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
    // @LINE:37
    def img(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/images")))
      Call("GET", _prefix + { _defaultPrefix } + "img/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
    // @LINE:40
    def commonImg(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/lib/common/images")))
      Call("GET", _prefix + { _defaultPrefix } + "common/img/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
    // @LINE:36
    def js(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts")))
      Call("GET", _prefix + { _defaultPrefix } + "js/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
    // @LINE:39
    def commonJs(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/lib/common/javascripts")))
      Call("GET", _prefix + { _defaultPrefix } + "common/js/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:21
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def newcustomers(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "newcustomers")
    }
  
    // @LINE:26
    def myAccount(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "myaccount")
    }
  
    // @LINE:24
    def inventory(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "inventory")
    }
  
    // @LINE:22
    def profit(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "profit")
    }
  
    // @LINE:25
    def settings(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "settings")
    }
  
    // @LINE:27
    def sales(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "sales")
    }
  
    // @LINE:21
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
    // @LINE:29
    def selectLang(lang:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "lang/" + implicitly[PathBindable[String]].unbind("lang", lang))
    }
  
  }


}
