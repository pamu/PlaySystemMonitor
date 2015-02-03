
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
    <title>"""),_display_(/*6.13*/title),format.raw/*6.18*/("""</title>
    <link rel='shortcut icon' type='image/png' href='"""),_display_(/*7.55*/routes/*7.61*/.Assets.at("images/favicon.png")),format.raw/*7.93*/("""'>
    <link rel='stylesheet' href='"""),_display_(/*8.35*/routes/*8.41*/.WebJarAssets.at(WebJarAssets.locate("bootstrap.min.css"))),format.raw/*8.99*/("""'>
    <script type='text/javascript' src='"""),_display_(/*9.42*/routes/*9.48*/.WebJarAssets.at(WebJarAssets.locate("jquery.min.js"))),format.raw/*9.102*/("""'></script>
    <style>
    body """),format.raw/*11.10*/("""{"""),format.raw/*11.11*/("""
        margin-top: 50px;
    """),format.raw/*13.5*/("""}"""),format.raw/*13.6*/("""
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
        """),_display_(/*25.10*/content),format.raw/*25.17*/("""
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
                    DATE: Mon Feb 02 23:25:53 IST 2015
                    SOURCE: /home/android/Documents/SbtWorkspace/PlaySystemMonitor/app/views/main.scala.html
                    HASH: b9738732d28330f7b420ee46ca87909a8809b05f
                    MATRIX: 560->1|684->31|754->75|779->80|868->143|882->149|934->181|997->218|1011->224|1089->282|1159->326|1173->332|1248->386|1309->419|1338->420|1396->451|1424->452|1657->658|1683->663|1797->750|1825->757
                    LINES: 19->1|22->1|27->6|27->6|28->7|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|32->11|32->11|34->13|34->13|41->20|41->20|46->25|46->25
                    -- GENERATED --
                */
            