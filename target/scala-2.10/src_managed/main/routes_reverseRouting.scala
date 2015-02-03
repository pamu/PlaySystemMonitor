// @SOURCE:/home/android/Documents/SbtWorkspace/PlaySystemMonitor/conf/routes
// @HASH:fbb5fd022be04b838d49e1f3470670d0020b88d9
// @DATE:Tue Feb 03 11:57:12 IST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:14
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
package controllers {

// @LINE:14
class ReverseWebJarAssets {
    

// @LINE:14
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "webjars/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:13
class ReverseAssets {
    

// @LINE:13
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
class ReverseApplication {
    

// @LINE:9
def processInfoCpuSorted(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "processInfoCpuSorted")
}
                                                

// @LINE:6
def taskSummary(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "taskSummary")
}
                                                

// @LINE:8
def mem(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "mem")
}
                                                

// @LINE:7
def cpu(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "cpu")
}
                                                

// @LINE:10
def processInfoMemSorted(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "processInfoMemSorted")
}
                                                

// @LINE:5
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:14
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
package controllers.javascript {

// @LINE:14
class ReverseWebJarAssets {
    

// @LINE:14
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WebJarAssets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "webjars/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:13
class ReverseAssets {
    

// @LINE:13
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
class ReverseApplication {
    

// @LINE:9
def processInfoCpuSorted : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.processInfoCpuSorted",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "processInfoCpuSorted"})
      }
   """
)
                        

// @LINE:6
def taskSummary : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.taskSummary",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "taskSummary"})
      }
   """
)
                        

// @LINE:8
def mem : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.mem",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mem"})
      }
   """
)
                        

// @LINE:7
def cpu : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.cpu",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cpu"})
      }
   """
)
                        

// @LINE:10
def processInfoMemSorted : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.processInfoMemSorted",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "processInfoMemSorted"})
      }
   """
)
                        

// @LINE:5
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:14
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
package controllers.ref {


// @LINE:14
class ReverseWebJarAssets {
    

// @LINE:14
def at(file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WebJarAssets.at(file), HandlerDef(this, "", "controllers.WebJarAssets", "at", Seq(classOf[String]), "GET", """""", _prefix + """webjars/$file<.+>""")
)
                      
    
}
                          

// @LINE:13
class ReverseAssets {
    

// @LINE:13
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
class ReverseApplication {
    

// @LINE:9
def processInfoCpuSorted(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.processInfoCpuSorted(), HandlerDef(this, "", "controllers.Application", "processInfoCpuSorted", Seq(), "GET", """""", _prefix + """processInfoCpuSorted""")
)
                      

// @LINE:6
def taskSummary(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.taskSummary(), HandlerDef(this, "", "controllers.Application", "taskSummary", Seq(), "GET", """""", _prefix + """taskSummary""")
)
                      

// @LINE:8
def mem(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.mem(), HandlerDef(this, "", "controllers.Application", "mem", Seq(), "GET", """""", _prefix + """mem""")
)
                      

// @LINE:7
def cpu(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.cpu(), HandlerDef(this, "", "controllers.Application", "cpu", Seq(), "GET", """""", _prefix + """cpu""")
)
                      

// @LINE:10
def processInfoMemSorted(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.processInfoMemSorted(), HandlerDef(this, "", "controllers.Application", "processInfoMemSorted", Seq(), "GET", """""", _prefix + """processInfoMemSorted""")
)
                      

// @LINE:5
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "", "controllers.Application", "index", Seq(), "GET", """""", _prefix + """""")
)
                      
    
}
                          
}
        
    