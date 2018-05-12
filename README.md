#House of meme

Tools used

Play framework 2.5

Scala Programing Language 2.11.7

Silhoutte authentication and authorization library for scala 4.0.0

Play-Bootstrap: Bootstrap implementation specific for play framework.


Is a sample project that is built on top of Play-silhoutte-credential-seed template.  To show adding pages  to play application, then making sure that  users of the pages are authenticated using play silhouttte and they are also authorized to use specific resource(page) using the same.

/House of Memes/public/images/Inventory: White nav
/House of Memes/public/images/Invetory
/House of Memes/public/images/New Customers
/House of Memes/public/images/New Customers: White nav
/House of Memes/public/images/Profit
/House of Memes/public/images/Sales
More of silhouette authentication library can be found here (https://www.silhouette.rocks/).

Currently my users are stored in a variable in the user companion object, I am implementing a version that will be using database, will use MongoDB, and reactive mongo driver.

/House of Memes/public/images/Users


It implements the typical authentication and authorization functionality based on roles. You can:

* Sign up (with email confirmation)
* Sign in (with remember me)
* Sign out
* Change password
* Reset password (via email)
* Control of public and private areas
* Restrict areas to those users whose roles match with the specified ones (with logic `OR` or `AND`)




### Silhouette

All the authentication and authorization functionalities are implemented using the [Silhouette authentication library](https://www.silhouette.rocks/). Please check the [documentation](https://www.silhouette.rocks/docs) first.



* `app/models/User.scala`: the user class (with its login info: email and encrypted password). For this example, all the users are stored dynamically in a HashMap.
* `app/models/MailTokenUser.scala`: implements a token for the web page in case to reset a password or confirm a user's email during a sign up. For this example, all the tokens are stored dynamically in a HashMap.
* `app/utils/silhouette/Module.scala`: module that provides all the required classes for the Dependency Injection.
* `app/utils/silhouette/AuthController.scala`: declares the Controller will extend all our controllers.
* `app/utils/silhouette/UserService.scala`: simply retrieves a user from its corresponding LoginInfo.
* `app/utils/silhouette/PasswordInfoDAO.scala`: simply retrieves and saves a user's PasswordInfo from its corresponding LoginInfo.
* `app/utils/silhouette/MailTokenUserService.scala`: implements the corresponding MailTokenService[MailToken].
* `app/utils/silhouette/Authorization.scala`: provides the corresponding `Authorization` classes.
* `app/utils/ErrorHandler.scala`: with SecuredErrorHandler.

### Authentication

Please, check the Auth controller ( `app/controllers/Auth.scala`) to know how to:

* Sign up (with email confirmation)
* Sign in (with remember me)
* Sign out
* Change password
* Reset password (via email)

### Authorization

Each user has one or more services that indicate a specific area or hierarchical level. You can restrict sections to those users who match with a set of services (using logic `OR` or `AND`, you can choose). The master role has always full access to everywhere. For example:

* `admin`: the user has access to the 'admin' restricted area.
* `master`: full access to every point of the webpage.

The Authorization objects are implemented in `app/utils/silhouette/Authorization.scala`.

The endpoints use secured action for authentication. And withService() for authorization.

You also have some tags to customise your UI according to the services for the logged user. They are within the folder `app/views/admin/tags/auth`.

* `withService(anyOf: String*) { … }`
* `withServiceOrElse(anyOf: String*) { … } { … }`
* `withServices(anyOf: String*) { … }`
* `withServicesOrElse(anyOf: String*) { … } { … }`
To run this project: clone this repo, then open it in the terminal and type 'sbt'

This will start SBT(Simple/Scala Build Tool). Then writte either 'run' but it is advisible to '~ run' (so you don't have to keep running the application everytime you make changes on the code), then wait for the application to resolve all the dependancies.

/House of Memes/public/images/sbt

I will be adding more play scala projects to this github account.