
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dan/House of Memes/conf/routes
// @DATE:Sat May 12 11:51:21 EAT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
