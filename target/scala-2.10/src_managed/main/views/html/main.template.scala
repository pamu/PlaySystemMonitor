
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

<html>
<head>
    <title>"""),_display_(/*7.13*/title),format.raw/*7.18*/("""</title>
    <link rel='shortcut icon' type='image/png' href='"""),_display_(/*8.55*/routes/*8.61*/.Assets.at("images/favicon.png")),format.raw/*8.93*/("""'>
    <link rel='stylesheet' href='"""),_display_(/*9.35*/routes/*9.41*/.WebJarAssets.at(WebJarAssets.locate("bootstrap.min.css"))),format.raw/*9.99*/("""'>
    <script type='text/javascript' src='"""),_display_(/*10.42*/routes/*10.48*/.WebJarAssets.at(WebJarAssets.locate("angular.min.js"))),format.raw/*10.103*/("""'></script>
    <style>
        body """),format.raw/*12.14*/("""{"""),format.raw/*12.15*/("""
        margin-top: 50px;
        """),format.raw/*14.9*/("""}"""),format.raw/*14.10*/("""
    </style>
</head>
<body>
    <div class="navbar navbar-fixed-top">
        <div class="navbar-inner">
            <div class="container-fluid">
                <a id="titleLink" class="brand" href="/">"""),_display_(/*21.59*/title),format.raw/*21.64*/("""</a>
            </div>
        </div>
    </div>
    <div class="container">
        """),_display_(/*26.10*/content),format.raw/*26.17*/("""
    </div>
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
                    DATE: Tue Feb 03 19:46:59 IST 2015
                    SOURCE: /home/android/Documents/SbtWorkspace/PlaySystemMonitor/app/views/main.scala.html
                    HASH: eccdefc0ad07d4de51ce066a15d2796b00d01db9
                    MATRIX: 560->1|684->31|755->76|780->81|869->144|883->150|935->182|998->219|1012->225|1090->283|1161->327|1176->333|1253->388|1318->425|1347->426|1409->461|1438->462|1671->668|1697->673|1811->760|1839->767
                    LINES: 19->1|22->1|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|33->12|33->12|35->14|35->14|42->21|42->21|47->26|47->26
                    -- GENERATED --
                */
            