package controllers

import play.api.mvc.{Action, Controller}
import streams.AvailableStreams

object Application extends Controller {
  def index = Action {
    Ok(views.html.index("Hello Play Framework"))
  }
  def stats = Action {
    Ok.chunked(AvailableStreams.mem)
  }
}