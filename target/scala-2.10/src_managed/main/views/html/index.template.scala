
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
	<legend>
        <div>
            <h1 class="alert alert-block alert-info"><em>"""),_display_(/*6.59*/{System.getProperty("user.name")}),format.raw/*6.92*/("""</em> System Monitor</h1>
        </div>   
    </legend>

    <div class="progress progress-info">
        <div class="bar" style="width: 100%"></div>
    </div>

    <div>
        <h2 class="alert alert-success">Tasks</h2>
    </div>



    <div class="well" id="summary">
            <span class="span1">Total:</span>
            <span class="span1" id="total"></span>
            <span class="span1">Running:</span>
            <span class="span1" id="running"></span>
            <span class="span1">Sleeping:</span>
            <span class="span1" id="sleeping"></span>
            <span class="span1">Stopped:</span>
            <span class="span1" id="stopped"></span>
            <span class="span1">Zombie:</span>
            <span class="span1" id="zombie"></span>
    </div>

    <div class="progress progress-info">
        <div class="bar" style="width: 100%"></div>
    </div>

	<div>
        <h2 class="alert alert-success">RAM</h2>
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

    <div>
        <h2 class="alert alert-success">CPU</h2>
    </div>

    <div class="row-fluid">
        <div id="chartCpu" class="span6">
            <canvas id="myChartCpu" width="400" height="400"></canvas>
        </div>
        <div id="legendCpu" class="span6"></div>
    </div>

    <div class="progress progress-info">
        <div class="bar" style="width: 100%"></div>
    </div>

    <script type="text/javascript">
        Chart.defaults.global = """),format.raw/*68.33*/("""{"""),format.raw/*68.34*/("""
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
            tooltipTemplate: "<%if (label)"""),format.raw/*180.43*/("""{"""),format.raw/*180.44*/("""%><%=label%>: <%"""),format.raw/*180.60*/("""}"""),format.raw/*180.61*/("""%><%= value %> %",

            // String - Template string for single tooltips
            multiTooltipTemplate: "<%= value %>",

            // Function - Will fire on animation progression.
            onAnimationProgress: function()"""),format.raw/*186.44*/("""{"""),format.raw/*186.45*/("""}"""),format.raw/*186.46*/(""",

            // Function - Will fire on animation completion.
            onAnimationComplete: function()"""),format.raw/*189.44*/("""{"""),format.raw/*189.45*/("""this.showTooltip(this.segments, true);"""),format.raw/*189.83*/("""}"""),format.raw/*189.84*/("""
        """),format.raw/*190.9*/("""}"""),format.raw/*190.10*/("""

        //Chart.defaults.global.responsive = true;

        var ctx = $("#myChart").get(0).getContext("2d");

        var data = [
                        """),format.raw/*197.25*/("""{"""),format.raw/*197.26*/("""
                            value: 100,
                            color:"#00ff00",
                            highlight: "#44ff44",
                            label: "Free RAM"
                        """),format.raw/*202.25*/("""}"""),format.raw/*202.26*/(""",
                        """),format.raw/*203.25*/("""{"""),format.raw/*203.26*/("""
                            value: 0,
                            color: "#ff1155",
                            highlight: "#ff5555",
                            label: "Used RAM"
                        """),format.raw/*208.25*/("""}"""),format.raw/*208.26*/("""
                    ]


        var options = """),format.raw/*212.23*/("""{"""),format.raw/*212.24*/("""
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
                            legendTemplate : "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<segments.length; i++)"""),format.raw/*238.132*/("""{"""),format.raw/*238.133*/("""%><li><span style=\"background-color:<%=segments[i].fillColor%>\"></span><%if(segments[i].label)"""),format.raw/*238.229*/("""{"""),format.raw/*238.230*/("""%><%=segments[i].label%><%"""),format.raw/*238.256*/("""}"""),format.raw/*238.257*/("""%> &nbsp; <span id=\"legend<%=i%>\"></span></li><%"""),format.raw/*238.307*/("""}"""),format.raw/*238.308*/("""%></ul>"
                        """),format.raw/*239.25*/("""}"""),format.raw/*239.26*/("""

        var myDoughnutChart = new Chart(ctx).Doughnut(data,options);

        var legend = myDoughnutChart.generateLegend();
        $("#legend").html(legend);

        if (!!window.EventSource) """),format.raw/*246.35*/("""{"""),format.raw/*246.36*/("""
         var source = new EventSource(""""),_display_(/*247.41*/routes/*247.47*/.Application.mem()),format.raw/*247.65*/("""");
         source.addEventListener('message', function(e) """),format.raw/*248.57*/("""{"""),format.raw/*248.58*/("""
            var json = e.data;
            var mem = JSON.parse(json);
            myDoughnutChart.segments[0].value = Math.floor((mem.free * 100)/(mem.total));
            myDoughnutChart.segments[1].value = Math.floor((mem.used * 100)/(mem.total));
            myDoughnutChart.update();
            $("#legend0").text((Math.floor((mem.free/(1024 * 1024)) * 100) / 100)+"GB");
            $("#legend1").text((Math.floor((mem.used/(1024 * 1024)) * 100) / 100)+"GB");
         """),format.raw/*256.10*/("""}"""),format.raw/*256.11*/(""");
       """),format.raw/*257.8*/("""}"""),format.raw/*257.9*/(""" else """),format.raw/*257.15*/("""{"""),format.raw/*257.16*/("""
         $("#chart").html("Sorry. This browser doesn't seem to support Server sent event. Check <a href='http://html5test.com/compare/feature/communication-eventSource.html'>html5test</a> for browser compatibility.");
       """),format.raw/*259.8*/("""}"""),format.raw/*259.9*/("""
    </script>

    <script type="text/javascript">
        if (!!window.EventSource) """),format.raw/*263.35*/("""{"""),format.raw/*263.36*/("""
         var source = new EventSource(""""),_display_(/*264.41*/routes/*264.47*/.Application.taskSummary()),format.raw/*264.73*/("""");
         source.addEventListener('message', function(e) """),format.raw/*265.57*/("""{"""),format.raw/*265.58*/("""
            var json = e.data;
            var summary = JSON.parse(json);
            $("#total").text(summary.total);
            $('#running').text(summary.running);
            $('#sleeping').text(summary.sleeping);
            $('#stopped').text(summary.stopped);
            $('#zombie').text(summary.zombie);
         """),format.raw/*273.10*/("""}"""),format.raw/*273.11*/(""");
       """),format.raw/*274.8*/("""}"""),format.raw/*274.9*/(""" else """),format.raw/*274.15*/("""{"""),format.raw/*274.16*/("""
         $("#summary").html("Sorry. This browser doesn't seem to support Server sent event. Check <a href='http://html5test.com/compare/feature/communication-eventSource.html'>html5test</a> for browser compatibility.");
       """),format.raw/*276.8*/("""}"""),format.raw/*276.9*/("""
    </script>

    <script>

        var ctxCpu = $("#myChartCpu").get(0).getContext("2d");

        var data = [
                        """),format.raw/*284.25*/("""{"""),format.raw/*284.26*/("""
                            value: 10,
                            color:"#ff1155",
                            highlight: "#ff5555",
                            label: "User time"
                        """),format.raw/*289.25*/("""}"""),format.raw/*289.26*/(""",
                        """),format.raw/*290.25*/("""{"""),format.raw/*290.26*/("""
                            value: 10,
                            color: "#ff0000",
                            highlight: "#ff9999",
                            label: "System time"
                        """),format.raw/*295.25*/("""}"""),format.raw/*295.26*/(""",
                        """),format.raw/*296.25*/("""{"""),format.raw/*296.26*/("""
                            value: 10,
                            color: "#FFFF00",
                            highlight: "#FFFF66",
                            label: "Nice time"
                        """),format.raw/*301.25*/("""}"""),format.raw/*301.26*/(""",
                        """),format.raw/*302.25*/("""{"""),format.raw/*302.26*/("""
                            value: 10,
                            color: "#00ff00",
                            highlight: "#44ff44",
                            label: "Idle time"
                        """),format.raw/*307.25*/("""}"""),format.raw/*307.26*/(""",
                        """),format.raw/*308.25*/("""{"""),format.raw/*308.26*/("""
                            value: 10,
                            color: "#3300FF",
                            highlight: "#3366FF",
                            label: "Wait cpu time"
                        """),format.raw/*313.25*/("""}"""),format.raw/*313.26*/(""",
                        """),format.raw/*314.25*/("""{"""),format.raw/*314.26*/("""
                            value: 10,
                            color: "#660066",
                            highlight: "#663366",
                            label: "Hardware interrupt time"
                        """),format.raw/*319.25*/("""}"""),format.raw/*319.26*/(""",
                        """),format.raw/*320.25*/("""{"""),format.raw/*320.26*/("""
                            value: 10,
                            color: "#FF0099",
                            highlight: "#FF6699",
                            label: "Software interrupt time"
                        """),format.raw/*325.25*/("""}"""),format.raw/*325.26*/(""",
                        """),format.raw/*326.25*/("""{"""),format.raw/*326.26*/("""
                            value: 10,
                            color: "#000033",
                            highlight: "#000099",
                            label: "Steal time"
                        """),format.raw/*331.25*/("""}"""),format.raw/*331.26*/("""
                    ]


        var options = """),format.raw/*335.23*/("""{"""),format.raw/*335.24*/("""
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
                            legendTemplate : "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<segments.length; i++)"""),format.raw/*361.132*/("""{"""),format.raw/*361.133*/("""%><li><span style=\"background-color:<%=segments[i].fillColor%>\"></span><%if(segments[i].label)"""),format.raw/*361.229*/("""{"""),format.raw/*361.230*/("""%><%=segments[i].label%><%"""),format.raw/*361.256*/("""}"""),format.raw/*361.257*/("""%> &nbsp;<span id=\"legendCpu<%=i%>\"></span></li><%"""),format.raw/*361.309*/("""}"""),format.raw/*361.310*/("""%></ul>"
                        """),format.raw/*362.25*/("""}"""),format.raw/*362.26*/("""

        var myDoughnutChartCpu = new Chart(ctxCpu).Doughnut(data,options);

        var legend = myDoughnutChartCpu.generateLegend();
        $("#legendCpu").html(legend);

        if (!!window.EventSource) """),format.raw/*369.35*/("""{"""),format.raw/*369.36*/("""
         var source = new EventSource(""""),_display_(/*370.41*/routes/*370.47*/.Application.cpu()),format.raw/*370.65*/("""");
         source.addEventListener('message', function(e) """),format.raw/*371.57*/("""{"""),format.raw/*371.58*/("""
            var json = e.data;
            var cpu = JSON.parse(json);
            myDoughnutChartCpu.segments[0].value = Math.floor(cpu.us);
            myDoughnutChartCpu.segments[1].value = Math.floor(cpu.sy);
            myDoughnutChartCpu.segments[2].value = Math.floor(cpu.ni);
            myDoughnutChartCpu.segments[3].value = Math.floor(cpu.id);
            myDoughnutChartCpu.segments[4].value = Math.floor(cpu.wa);
            myDoughnutChartCpu.segments[5].value = Math.floor(cpu.hi);
            myDoughnutChartCpu.segments[6].value = Math.floor(cpu.si);
            myDoughnutChartCpu.segments[7].value = Math.floor(cpu.st);
            myDoughnutChartCpu.update();
            $("#legendCpu0").text(Math.floor(cpu.us * 100)/100+"%");
            $("#legendCpu1").text(Math.floor(cpu.sy * 100)/100+"%");
            $("#legendCpu2").text(Math.floor(cpu.ni * 100)/100+"%");
            $("#legendCpu3").text(Math.floor(cpu.id * 100)/100+"%");
            $("#legendCpu4").text(Math.floor(cpu.wa * 100)/100+"%");
            $("#legendCpu5").text(Math.floor(cpu.hi * 100)/100+"%");
            $("#legendCpu6").text(Math.floor(cpu.si * 100)/100+"%");
            $("#legendCpu7").text(Math.floor(cpu.st * 100)/100+"%");
         """),format.raw/*391.10*/("""}"""),format.raw/*391.11*/(""");
       """),format.raw/*392.8*/("""}"""),format.raw/*392.9*/(""" else """),format.raw/*392.15*/("""{"""),format.raw/*392.16*/("""
         $("#myChartCpu").html("Sorry. This browser doesn't seem to support Server sent event. Check <a href='http://html5test.com/compare/feature/communication-eventSource.html'>html5test</a> for browser compatibility.");
       """),format.raw/*394.8*/("""}"""),format.raw/*394.9*/("""
    </script>
""")))}))}
    }
    
    def render(title:String): play.api.templates.HtmlFormat.Appendable = apply(title)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (title) => apply(title)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Feb 05 11:58:23 IST 2015
                    SOURCE: /home/android/Documents/SbtWorkspace/PlaySystemMonitor/app/views/index.scala.html
                    HASH: c82b48367d2b0dc28a6f223778152cefef8e783e
                    MATRIX: 556->1|665->16|693->19|712->30|750->31|859->114|912->147|2675->1882|2704->1883|7010->6160|7040->6161|7085->6177|7115->6178|7380->6414|7410->6415|7440->6416|7576->6523|7606->6524|7673->6562|7703->6563|7740->6572|7770->6573|7956->6730|7986->6731|8221->6937|8251->6938|8306->6964|8336->6965|8570->7170|8600->7171|8676->7218|8706->7219|10035->8518|10066->8519|10192->8615|10223->8616|10279->8642|10310->8643|10390->8693|10421->8694|10483->8727|10513->8728|10739->8925|10769->8926|10838->8967|10854->8973|10894->8991|10983->9051|11013->9052|11519->9529|11549->9530|11587->9540|11616->9541|11651->9547|11681->9548|11935->9774|11964->9775|12079->9861|12109->9862|12178->9903|12194->9909|12242->9935|12331->9995|12361->9996|12716->10322|12746->10323|12784->10333|12813->10334|12848->10340|12878->10341|13134->10569|13163->10570|13331->10709|13361->10710|13596->10916|13626->10917|13681->10943|13711->10944|13949->11153|13979->11154|14034->11180|14064->11181|14300->11388|14330->11389|14385->11415|14415->11416|14651->11623|14681->11624|14736->11650|14766->11651|15006->11862|15036->11863|15091->11889|15121->11890|15371->12111|15401->12112|15456->12138|15486->12139|15736->12360|15766->12361|15821->12387|15851->12388|16088->12596|16118->12597|16194->12644|16224->12645|17553->13944|17584->13945|17710->14041|17741->14042|17797->14068|17828->14069|17910->14121|17941->14122|18003->14155|18033->14156|18271->14365|18301->14366|18370->14407|18386->14413|18426->14431|18515->14491|18545->14492|19816->15734|19846->15735|19884->15745|19913->15746|19948->15752|19978->15753|20237->15984|20266->15985
                    LINES: 19->1|22->1|24->3|24->3|24->3|27->6|27->6|89->68|89->68|201->180|201->180|201->180|201->180|207->186|207->186|207->186|210->189|210->189|210->189|210->189|211->190|211->190|218->197|218->197|223->202|223->202|224->203|224->203|229->208|229->208|233->212|233->212|259->238|259->238|259->238|259->238|259->238|259->238|259->238|259->238|260->239|260->239|267->246|267->246|268->247|268->247|268->247|269->248|269->248|277->256|277->256|278->257|278->257|278->257|278->257|280->259|280->259|284->263|284->263|285->264|285->264|285->264|286->265|286->265|294->273|294->273|295->274|295->274|295->274|295->274|297->276|297->276|305->284|305->284|310->289|310->289|311->290|311->290|316->295|316->295|317->296|317->296|322->301|322->301|323->302|323->302|328->307|328->307|329->308|329->308|334->313|334->313|335->314|335->314|340->319|340->319|341->320|341->320|346->325|346->325|347->326|347->326|352->331|352->331|356->335|356->335|382->361|382->361|382->361|382->361|382->361|382->361|382->361|382->361|383->362|383->362|390->369|390->369|391->370|391->370|391->370|392->371|392->371|412->391|412->391|413->392|413->392|413->392|413->392|415->394|415->394
                    -- GENERATED --
                */
            