
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
    <script type='text/javascript' src='"""),_display_(/*10.42*/routes/*10.48*/.WebJarAssets.at(WebJarAssets.locate("jquery.min.js"))),format.raw/*10.102*/("""'></script>
    <script type='text/javascript' src='"""),_display_(/*11.42*/routes/*11.48*/.Assets.at("js/Chart.js")),format.raw/*11.73*/("""'></script>
    <style>
        body """),format.raw/*13.14*/("""{"""),format.raw/*13.15*/("""
            margin-top: 50px;
        """),format.raw/*15.9*/("""}"""),format.raw/*15.10*/("""
        .doughnut-legend li span """),format.raw/*16.34*/("""{"""),format.raw/*16.35*/("""
            width: 1em;
            height: 1em;
            display: inline-block;
            margin-right: 5px;
        """),format.raw/*21.9*/("""}"""),format.raw/*21.10*/("""
        .doughnut-legend """),format.raw/*22.26*/("""{"""),format.raw/*22.27*/("""
            list-style: none;    
        """),format.raw/*24.9*/("""}"""),format.raw/*24.10*/("""
    </style>
</head>
<body>
    <div class="navbar navbar-fixed-top">
        <div class="navbar-inner">
            <div class="container-fluid">
                <a id="titleLink" class="brand" href="/">"""),_display_(/*31.59*/title),format.raw/*31.64*/("""</a>
            </div>
        </div>
    </div>

    <div class="container">
        """),_display_(/*37.10*/content),format.raw/*37.17*/("""
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
                    DATE: Wed Feb 04 13:13:49 IST 2015
                    SOURCE: /home/android/Documents/SbtWorkspace/PlaySystemMonitor/app/views/main.scala.html
                    HASH: a24397cf027fcd997d009e074cbcb21bacb1c5ce
                    MATRIX: 560->1|684->31|755->76|780->81|869->144|883->150|935->182|998->219|1012->225|1090->283|1161->327|1176->333|1252->387|1332->440|1347->446|1393->471|1458->508|1487->509|1553->548|1582->549|1644->583|1673->584|1824->708|1853->709|1907->735|1936->736|2006->779|2035->780|2268->986|2294->991|2409->1079|2437->1086
                    LINES: 19->1|22->1|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|34->13|34->13|36->15|36->15|37->16|37->16|42->21|42->21|43->22|43->22|45->24|45->24|52->31|52->31|58->37|58->37
                    -- GENERATED --
                */
            