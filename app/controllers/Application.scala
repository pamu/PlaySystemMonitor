package controllers


import play.api.libs.EventSource
import play.api.mvc.{Action, Controller}
import streams.AvailableStreams

/**
 * Created by @nagarjuna_pamu on 2/2/15.
 */
object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Play System Monitor"))
  }

  def taskSummary() = Action {
    Ok.chunked(AvailableStreams.taskSummary &> EventSource()).as(EVENT_STREAM)
  }

  def cpu() = Action {
    Ok.chunked(AvailableStreams.cpu &> EventSource()).as(EVENT_STREAM)
  }

  def mem() = Action {
    Ok.chunked(AvailableStreams.mem &> EventSource()).as(EVENT_STREAM)
  }
}