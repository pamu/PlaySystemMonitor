
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.17*/("""

"""),_display_(/*3.2*/main(title)/*3.13*/{_display_(Seq[Any](format.raw/*3.14*/("""
    <div class="well" ng-controller="AlertCtrl">
        <h1>"""),_display_(/*5.14*/title),format.raw/*5.19*/("""</h1>
        """),format.raw/*6.9*/("""{"""),format.raw/*6.10*/("""{"""),format.raw/*6.11*/("""1 + 2"""),format.raw/*6.16*/("""}"""),format.raw/*6.17*/("""}"""),format.raw/*6.18*/("""
    </div>
""")))}))}
    }
    
    def render(title:String): play.api.templates.HtmlFormat.Appendable = apply(title)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (title) => apply(title)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Feb 03 22:24:01 IST 2015
                    SOURCE: /home/android/Documents/SbtWorkspace/PlaySystemMonitor/app/views/index.scala.html
                    HASH: 7374cde3c6f4221fb95eaf2f015170adfa7a6763
                    MATRIX: 556->1|665->16|693->19|712->30|750->31|839->94|864->99|904->113|932->114|960->115|992->120|1020->121|1048->122
                    LINES: 19->1|22->1|24->3|24->3|24->3|26->5|26->5|27->6|27->6|27->6|27->6|27->6|27->6
                    -- GENERATED --
                */
            