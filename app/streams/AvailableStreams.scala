package streams

import play.api.libs.iteratee.{Input, Enumeratee, Enumerator}

import play.api.libs.concurrent.Execution.Implicits.defaultContext
import play.api.libs.json._
import play.api.libs.functional.syntax._


/**
 * Created by @nagarjuna_pamu on 2/2/15.
 */
object AvailableStreams {
  import sys.process._

  def iteratorMemSorted = s"top -c -u ${System.getProperty("user.name")} -b".lines_!.iterator

  def statsMemSorted: Enumerator[String] = Enumerator.enumerate(iteratorMemSorted)

  case class TaskSummary(total: Int, running: Int, sleeping: Int, stopped: Int, zombie: Int)

  implicit val taskSummaryWrites: Writes[TaskSummary] = (
      (JsPath \ "total").write[Int] and
      (JsPath \ "running").write[Int] and
      (JsPath \ "sleeping").write[Int] and
      (JsPath \ "stopped").write[Int] and
      (JsPath \ "zombie").write[Int]
    )(unlift(TaskSummary.unapply))

  def taskSummary: Enumerator[JsValue] = statsMemSorted &> Enumeratee.mapInput[String] {
    case Input.El(line) if line contains "Tasks" => {
      val pieces = line.split("\\s+")
      implicit def toInt(str: String) = str.toInt
      Input.El(Json.toJson(TaskSummary(pieces(1), pieces(3), pieces(5), pieces(7), pieces(9))))
    }
    case Input.EOF => Input.EOF
    case other => Input.Empty
  }

  case class Cpu(us: Float, sy: Float, ni: Float, id: Float, wa: Float, hi: Float, si: Float, st: Float)

  implicit val cpuWrites: Writes[Cpu] = (
      (JsPath \ "us").write[Float] and
      (JsPath \ "sy").write[Float] and
      (JsPath \ "ni").write[Float] and
      (JsPath \ "id").write[Float] and
      (JsPath \ "wa").write[Float] and
      (JsPath \ "hi").write[Float] and
      (JsPath \ "si").write[Float] and
      (JsPath \ "st").write[Float]
    )(unlift(Cpu.unapply))

  def cpu: Enumerator[JsValue] = statsMemSorted &> Enumeratee.mapInput[String] {
    case Input.El(line) if line contains "%Cpu(s)" => {
      val pieces = line.split("\\s+")
      implicit def toFloat(str: String) = str.toFloat
      Input.El(Json.toJson(Cpu(pieces(1), pieces(3), pieces(5), pieces(7), pieces(9), pieces(11), pieces(13), pieces(15))))
    }
    case Input.EOF => Input.EOF
    case other => Input.Empty
  }

  case class Mem(total: Float, used: Float, free: Float, buffers: Float)

  implicit val memWrites: Writes[Mem] = (
      (JsPath \ "total").write[Float] and
      (JsPath \ "used").write[Float] and
      (JsPath \ "free").write[Float] and
      (JsPath \ "buffers").write[Float]
    )(unlift(Mem.unapply))

  def mem: Enumerator[JsValue] = statsMemSorted &> Enumeratee.mapInput[String] {
    case Input.El(line) if line contains "KiB Mem:" => {
      val pieces = line.split("\\s+")

      implicit def toFloat(str: String) = str.toFloat

      Input.El(Json.toJson(Mem(pieces(2), pieces(4), pieces(6), pieces(8))))
    }
    case Input.EOF => Input.EOF
    case other => Input.Empty
  }
}
