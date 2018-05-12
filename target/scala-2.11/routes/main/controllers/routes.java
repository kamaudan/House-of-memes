
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dan/House of Memes/conf/routes
// @DATE:Sat May 12 11:51:21 EAT 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAuth Auth = new controllers.ReverseAuth(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseMyAssets MyAssets = new controllers.ReverseMyAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApplication Application = new controllers.ReverseApplication(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAuth Auth = new controllers.javascript.ReverseAuth(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseMyAssets MyAssets = new controllers.javascript.ReverseMyAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
  }

}
