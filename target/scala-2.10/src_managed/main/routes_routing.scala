// @SOURCE:/home/android/Documents/SbtWorkspace/PlaySystemMonitor/conf/routes
// @HASH:fbb5fd022be04b838d49e1f3470670d0020b88d9
// @DATE:Tue Feb 03 11:57:12 IST 2015


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:5
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:6
private[this] lazy val controllers_Application_taskSummary1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("taskSummary"))))
        

// @LINE:7
private[this] lazy val controllers_Application_cpu2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cpu"))))
        

// @LINE:8
private[this] lazy val controllers_Application_mem3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mem"))))
        

// @LINE:9
private[this] lazy val controllers_Application_processInfoCpuSorted4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("processInfoCpuSorted"))))
        

// @LINE:10
private[this] lazy val controllers_Application_processInfoMemSorted5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("processInfoMemSorted"))))
        

// @LINE:13
private[this] lazy val controllers_Assets_at6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:14
private[this] lazy val controllers_WebJarAssets_at7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("webjars/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """taskSummary""","""controllers.Application.taskSummary()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cpu""","""controllers.Application.cpu()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mem""","""controllers.Application.mem()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """processInfoCpuSorted""","""controllers.Application.processInfoCpuSorted()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """processInfoMemSorted""","""controllers.Application.processInfoMemSorted()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """webjars/$file<.+>""","""controllers.WebJarAssets.at(file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:5
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "", "controllers.Application", "index", Nil,"GET", """""", Routes.prefix + """"""))
   }
}
        

// @LINE:6
case controllers_Application_taskSummary1(params) => {
   call { 
        invokeHandler(controllers.Application.taskSummary(), HandlerDef(this, "", "controllers.Application", "taskSummary", Nil,"GET", """""", Routes.prefix + """taskSummary"""))
   }
}
        

// @LINE:7
case controllers_Application_cpu2(params) => {
   call { 
        invokeHandler(controllers.Application.cpu(), HandlerDef(this, "", "controllers.Application", "cpu", Nil,"GET", """""", Routes.prefix + """cpu"""))
   }
}
        

// @LINE:8
case controllers_Application_mem3(params) => {
   call { 
        invokeHandler(controllers.Application.mem(), HandlerDef(this, "", "controllers.Application", "mem", Nil,"GET", """""", Routes.prefix + """mem"""))
   }
}
        

// @LINE:9
case controllers_Application_processInfoCpuSorted4(params) => {
   call { 
        invokeHandler(controllers.Application.processInfoCpuSorted(), HandlerDef(this, "", "controllers.Application", "processInfoCpuSorted", Nil,"GET", """""", Routes.prefix + """processInfoCpuSorted"""))
   }
}
        

// @LINE:10
case controllers_Application_processInfoMemSorted5(params) => {
   call { 
        invokeHandler(controllers.Application.processInfoMemSorted(), HandlerDef(this, "", "controllers.Application", "processInfoMemSorted", Nil,"GET", """""", Routes.prefix + """processInfoMemSorted"""))
   }
}
        

// @LINE:13
case controllers_Assets_at6(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:14
case controllers_WebJarAssets_at7(params) => {
   call(params.fromPath[String]("file", None)) { (file) =>
        invokeHandler(controllers.WebJarAssets.at(file), HandlerDef(this, "", "controllers.WebJarAssets", "at", Seq(classOf[String]),"GET", """""", Routes.prefix + """webjars/$file<.+>"""))
   }
}
        
}

}
     