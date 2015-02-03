package controllers

import play.api.mvc.{Action, Controller}
import streams.AvailableStreams

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Hello Play Framework"))
  }

  def taskSummary() = Action {
    Ok.chunked(AvailableStreams.taskSummary)
  }

  def cpu() = Action {
    Ok.chunked(AvailableStreams.cpu)
  }

  def mem() = Action {
    Ok.chunked(AvailableStreams.mem)
  }

  def processInfoCpuSorted = Action {
    Ok.chunked(AvailableStreams.processInfoCpuSorted)
  }

  def processInfoMemSorted = Action {
    Ok.chunked(AvailableStreams.processInfoMemSorted)
  }
}