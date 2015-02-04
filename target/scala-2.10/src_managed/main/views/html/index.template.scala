
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
	
	<div>
        <h2 class="alert alert-success" >RAM</h2>
    </div>

    <div class="progress progress-info">
        <div class="bar" style="width: 100%"></div>
    </div>

    <div class="row-fluid">
        <div id="chart" class="span6">
            <canvas id="myChart" width="400" height="400"></canvas>
        </div>
        <div id="legend" class="span6"></div>
    </div>

    <div class="progress progress-info">
        <div class="bar" style="width: 100%"></div>
    </div>

    <script>

        Chart.defaults.global = """),format.raw/*26.33*/("""{"""),format.raw/*26.34*/("""
            // Boolean - Whether to animate the chart
            animation: true,

            // Number - Number of animation steps
            animationSteps: 60,

            // String - Animation easing effect
            animationEasing: "easeOutQuart",

            // Boolean - If we should show the scale at all
            showScale: true,

            // Boolean - If we want to override with a hard coded scale
            scaleOverride: false,

            // ** Required if scaleOverride is true **
            // Number - The number of steps in a hard coded scale
            scaleSteps: null,
            // Number - The value jump in the hard coded scale
            scaleStepWidth: null,
            // Number - The scale starting value
            scaleStartValue: null,

            // String - Colour of the scale line
            scaleLineColor: "rgba(0,0,0,.1)",

            // Number - Pixel width of the scale line
            scaleLineWidth: 1,

            // Boolean - Whether to show labels on the scale
            scaleShowLabels: true,

            // Interpolated JS string - can access value
            scaleLabel: "<%=value%>",

            // Boolean - Whether the scale should stick to integers, not floats even if drawing space is there
            scaleIntegersOnly: true,

            // Boolean - Whether the scale should start at zero, or an order of magnitude down from the lowest value
            scaleBeginAtZero: false,

            // String - Scale label font declaration for the scale label
            scaleFontFamily: "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif",

            // Number - Scale label font size in pixels
            scaleFontSize: 12,

            // String - Scale label font weight style
            scaleFontStyle: "normal",

            // String - Scale label font colour
            scaleFontColor: "#666",

            // Boolean - whether or not the chart should be responsive and resize when the browser does.
            responsive: false,

            // Boolean - whether to maintain the starting aspect ratio or not when responsive, if set to false, will take up entire container
            maintainAspectRatio: true,

            // Boolean - Determines whether to draw tooltips on the canvas or not
            showTooltips: true,

            // Function - Determines whether to execute the customTooltips function instead of drawing the built in tooltips (See [Advanced - External Tooltips](#advanced-usage-custom-tooltips))
            customTooltips: false,

            // Array - Array of string names to attach tooltip events
            tooltipEvents: ["mousemove", "touchstart", "touchmove"],

            // String - Tooltip background colour
            tooltipFillColor: "rgba(0,0,0,0.8)",

            // String - Tooltip label font declaration for the scale label
            tooltipFontFamily: "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif",

            // Number - Tooltip label font size in pixels
            tooltipFontSize: 14,

            // String - Tooltip font weight style
            tooltipFontStyle: "normal",

            // String - Tooltip label font colour
            tooltipFontColor: "#fff",

            // String - Tooltip title font declaration for the scale label
            tooltipTitleFontFamily: "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif",

            // Number - Tooltip title font size in pixels
            tooltipTitleFontSize: 14,

            // String - Tooltip title font weight style
            tooltipTitleFontStyle: "bold",

            // String - Tooltip title font colour
            tooltipTitleFontColor: "#fff",

            // Number - pixel width of padding around tooltip text
            tooltipYPadding: 6,

            // Number - pixel width of padding around tooltip text
            tooltipXPadding: 6,

            // Number - Size of the caret on the tooltip
            tooltipCaretSize: 8,

            // Number - Pixel radius of the tooltip border
            tooltipCornerRadius: 6,

            // Number - Pixel offset from point x to tooltip edge
            tooltipXOffset: 10,

            // String - Template string for single tooltips
            tooltipTemplate: "<%if (label)"""),format.raw/*138.43*/("""{"""),format.raw/*138.44*/("""%><%=label%>: <%"""),format.raw/*138.60*/("""}"""),format.raw/*138.61*/("""%><%= value %> %",

            // String - Template string for single tooltips
            multiTooltipTemplate: "<%= value %>",

            // Function - Will fire on animation progression.
            onAnimationProgress: function()"""),format.raw/*144.44*/("""{"""),format.raw/*144.45*/("""}"""),format.raw/*144.46*/(""",

            // Function - Will fire on animation completion.
            onAnimationComplete: function()"""),format.raw/*147.44*/("""{"""),format.raw/*147.45*/("""this.showTooltip(this.segments, true);"""),format.raw/*147.83*/("""}"""),format.raw/*147.84*/("""
        """),format.raw/*148.9*/("""}"""),format.raw/*148.10*/("""

        //Chart.defaults.global.responsive = true;

        var ctx = $("#myChart").get(0).getContext("2d");

        var data = [
                        """),format.raw/*155.25*/("""{"""),format.raw/*155.26*/("""
                            value: 100,
                            color:"#00ff00",
                            highlight: "#44ff44",
                            label: "Free RAM"
                        """),format.raw/*160.25*/("""}"""),format.raw/*160.26*/(""",
                        """),format.raw/*161.25*/("""{"""),format.raw/*161.26*/("""
                            value: 0,
                            color: "#ff1155",
                            highlight: "#ff5555",
                            label: "Used RAM"
                        """),format.raw/*166.25*/("""}"""),format.raw/*166.26*/("""
                    ]


        var options = """),format.raw/*170.23*/("""{"""),format.raw/*170.24*/("""
                            //Boolean - Whether we should show a stroke on each segment
                            segmentShowStroke : true,

                            //String - The colour of each segment stroke
                            segmentStrokeColor : "#fff",

                            //Number - The width of each segment stroke
                            segmentStrokeWidth : 2,

                            //Number - The percentage of the chart that we cut out of the middle
                            percentageInnerCutout : 50, // This is 0 for Pie charts

                            //Number - Amount of animation steps
                            animationSteps : 100,

                            //String - Animation easing effect
                            animationEasing : "easeOutBounce",

                            //Boolean - Whether we animate the rotation of the Doughnut
                            animateRotate : true,

                            //Boolean - Whether we animate scaling the Doughnut from the centre
                            animateScale : false,

                            //String - A legend template
                            legendTemplate : "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<segments.length; i++)"""),format.raw/*196.132*/("""{"""),format.raw/*196.133*/("""%><li><span style=\"background-color:<%=segments[i].fillColor%>\"></span><%if(segments[i].label)"""),format.raw/*196.229*/("""{"""),format.raw/*196.230*/("""%><%=segments[i].label%><%"""),format.raw/*196.256*/("""}"""),format.raw/*196.257*/("""%> &nbsp; GB <span id=\"legend<%=i%>\"></span></li><%"""),format.raw/*196.310*/("""}"""),format.raw/*196.311*/("""%></ul>"
                        """),format.raw/*197.25*/("""}"""),format.raw/*197.26*/("""

        var myDoughnutChart = new Chart(ctx).Doughnut(data,options);

        var legend = myDoughnutChart.generateLegend();
        $("#legend").html(legend);

        if (!!window.EventSource) """),format.raw/*204.35*/("""{"""),format.raw/*204.36*/("""
         var source = new EventSource(""""),_display_(/*205.41*/routes/*205.47*/.Application.mem()),format.raw/*205.65*/("""");
         source.addEventListener('message', function(e) """),format.raw/*206.57*/("""{"""),format.raw/*206.58*/("""
            var json = e.data;
            var mem = JSON.parse(json);
            myDoughnutChart.segments[0].value = Math.floor((mem.free * 100)/(mem.total));
            myDoughnutChart.segments[1].value = Math.floor((mem.used * 100)/(mem.total));
            myDoughnutChart.update();
            $("#legend0").text(mem.free/(1024 * 1024));
            $("#legend1").text(mem.used/(1024 * 1024));
         """),format.raw/*214.10*/("""}"""),format.raw/*214.11*/(""");
       """),format.raw/*215.8*/("""}"""),format.raw/*215.9*/(""" else """),format.raw/*215.15*/("""{"""),format.raw/*215.16*/("""
         $("#chart").html("Sorry. This browser doesn't seem to support Server sent event. Check <a href='http://html5test.com/compare/feature/communication-eventSource.html'>html5test</a> for browser compatibility.");
       """),format.raw/*217.8*/("""}"""),format.raw/*217.9*/("""
    </script>
""")))}))}
    }
    
    def render(title:String): play.api.templates.HtmlFormat.Appendable = apply(title)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (title) => apply(title)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Feb 04 14:15:28 IST 2015
                    SOURCE: /home/android/Documents/SbtWorkspace/PlaySystemMonitor/app/views/index.scala.html
                    HASH: 4c81fc8696bac096da8cfd9f1538fe960b43bd47
                    MATRIX: 556->1|665->16|693->19|712->30|750->31|1314->567|1343->568|5649->4845|5679->4846|5724->4862|5754->4863|6019->5099|6049->5100|6079->5101|6215->5208|6245->5209|6312->5247|6342->5248|6379->5257|6409->5258|6595->5415|6625->5416|6860->5622|6890->5623|6945->5649|6975->5650|7209->5855|7239->5856|7315->5903|7345->5904|8674->7203|8705->7204|8831->7300|8862->7301|8918->7327|8949->7328|9032->7381|9063->7382|9125->7415|9155->7416|9381->7613|9411->7614|9480->7655|9496->7661|9536->7679|9625->7739|9655->7740|10095->8151|10125->8152|10163->8162|10192->8163|10227->8169|10257->8170|10511->8396|10540->8397
                    LINES: 19->1|22->1|24->3|24->3|24->3|47->26|47->26|159->138|159->138|159->138|159->138|165->144|165->144|165->144|168->147|168->147|168->147|168->147|169->148|169->148|176->155|176->155|181->160|181->160|182->161|182->161|187->166|187->166|191->170|191->170|217->196|217->196|217->196|217->196|217->196|217->196|217->196|217->196|218->197|218->197|225->204|225->204|226->205|226->205|226->205|227->206|227->206|235->214|235->214|236->215|236->215|236->215|236->215|238->217|238->217
                    -- GENERATED --
                */
            