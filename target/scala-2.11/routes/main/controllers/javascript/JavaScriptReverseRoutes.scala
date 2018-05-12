
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dan/House of Memes/conf/routes
// @DATE:Sat May 12 11:51:21 EAT 2018

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:6
  class ReverseAuth(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def handleChangePassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Auth.handleChangePassword",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "change-password"})
        }
      """
    )
  
    // @LINE:6
    def startSignUp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Auth.startSignUp",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:7
    def handleStartSignUp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Auth.handleStartSignUp",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:13
    def handleForgotPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Auth.handleForgotPassword",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "reset-password"})
        }
      """
    )
  
    // @LINE:11
    def signOut: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Auth.signOut",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signout"})
        }
      """
    )
  
    // @LINE:14
    def resetPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Auth.resetPassword",
      """
        function(token0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reset-password/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token0))})
        }
      """
    )
  
    // @LINE:8
    def signUp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Auth.signUp",
      """
        function(token0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token0))})
        }
      """
    )
  
    // @LINE:12
    def forgotPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Auth.forgotPassword",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reset-password"})
        }
      """
    )
  
    // @LINE:16
    def changePassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Auth.changePassword",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "change-password"})
        }
      """
    )
  
    // @LINE:15
    def handleResetPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Auth.handleResetPassword",
      """
        function(token0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "reset-password/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token0))})
        }
      """
    )
  
    // @LINE:10
    def authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Auth.authenticate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate"})
        }
      """
    )
  
    // @LINE:9
    def signIn: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Auth.signIn",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signin"})
        }
      """
    )
  
  }

  // @LINE:33
  class ReverseMyAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:33
    def public: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MyAssets.public",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "public/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
    // @LINE:38
    def commonCss: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MyAssets.commonCss",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "common/css/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
    // @LINE:35
    def css: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MyAssets.css",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "css/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
    // @LINE:34
    def lib: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MyAssets.lib",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "lib/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
    // @LINE:37
    def img: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MyAssets.img",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "img/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
    // @LINE:40
    def commonImg: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MyAssets.commonImg",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "common/img/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
    // @LINE:36
    def js: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MyAssets.js",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "js/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
    // @LINE:39
    def commonJs: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MyAssets.commonJs",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "common/js/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:21
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def newcustomers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.newcustomers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newcustomers"})
        }
      """
    )
  
    // @LINE:26
    def myAccount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.myAccount",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "myaccount"})
        }
      """
    )
  
    // @LINE:24
    def inventory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.inventory",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "inventory"})
        }
      """
    )
  
    // @LINE:22
    def profit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.profit",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profit"})
        }
      """
    )
  
    // @LINE:25
    def settings: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.settings",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "settings"})
        }
      """
    )
  
    // @LINE:27
    def sales: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.sales",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sales"})
        }
      """
    )
  
    // @LINE:21
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:29
    def selectLang: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.selectLang",
      """
        function(lang0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "lang/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("lang", lang0)})
        }
      """
    )
  
  }


}
