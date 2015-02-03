
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
    <div class="well">
        <h1>"""),_display_(/*5.14*/title),format.raw/*5.19*/("""</h1>
    </div>
""")))}))}
    }
    
    def render(title:String): play.api.templates.HtmlFormat.Appendable = apply(title)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (title) => apply(title)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Feb 03 19:47:15 IST 2015
                    SOURCE: /home/android/Documents/SbtWorkspace/PlaySystemMonitor/app/views/index.scala.html
                    HASH: 0106400778dfededbebf273a8923cd53aa14c137
                    MATRIX: 556->1|665->16|693->19|712->30|750->31|813->68|838->73
                    LINES: 19->1|22->1|24->3|24->3|24->3|26->5|26->5
                    -- GENERATED --
                */
            