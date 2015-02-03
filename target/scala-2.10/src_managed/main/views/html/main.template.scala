
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html ng-app="monitor">
<head>
    <title>"""),_display_(/*7.13*/title),format.raw/*7.18*/("""</title>
    <link rel='shortcut icon' type='image/png' href='"""),_display_(/*8.55*/routes/*8.61*/.Assets.at("images/favicon.png")),format.raw/*8.93*/("""'>
    <link rel='stylesheet' href='"""),_display_(/*9.35*/routes/*9.41*/.WebJarAssets.at(WebJarAssets.locate("bootstrap.min.css"))),format.raw/*9.99*/("""'>
    <style>
        body """),format.raw/*11.14*/("""{"""),format.raw/*11.15*/("""
        margin-top: 50px;
        """),format.raw/*13.9*/("""}"""),format.raw/*13.10*/("""
    </style>
</head>
<body>
    <div class="navbar navbar-fixed-top">
        <div class="navbar-inner">
            <div class="container-fluid">
                <a id="titleLink" class="brand" href="/">"""),_display_(/*20.59*/title),format.raw/*20.64*/("""</a>
            </div>
        </div>
    </div>

    <div class="container">
        """),_display_(/*26.10*/content),format.raw/*26.17*/("""
    </div>

    <script type='text/javascript' src='"""),_display_(/*29.42*/routes/*29.48*/.WebJarAssets.at(WebJarAssets.locate("angular.min.js"))),format.raw/*29.103*/("""'></script>
    <script type='text/javascript' src='"""),_display_(/*30.42*/routes/*30.48*/.Assets.at("js/app.js")),format.raw/*30.71*/("""'></script>
</body>
</html>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Feb 03 22:22:25 IST 2015
                    SOURCE: /home/android/Documents/SbtWorkspace/PlaySystemMonitor/app/views/main.scala.html
                    HASH: c82e33ed24a1b120d0fefd93ed520182e6b7f06b
                    MATRIX: 560->1|684->31|772->93|797->98|886->161|900->167|952->199|1015->236|1029->242|1107->300|1163->328|1192->329|1254->364|1283->365|1516->571|1542->576|1657->664|1685->671|1766->725|1781->731|1858->786|1938->839|1953->845|1997->868
                    LINES: 19->1|22->1|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|32->11|32->11|34->13|34->13|41->20|41->20|47->26|47->26|50->29|50->29|50->29|51->30|51->30|51->30
                    -- GENERATED --
                */
            