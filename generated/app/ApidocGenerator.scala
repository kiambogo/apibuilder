/**
 * Generated by apidoc - http://www.apidoc.me
 * Service version: 0.9.2
 * apidoc:0.9.2 http://www.apidoc.me/gilt/apidoc-generator/0.9.2/play_2_3_client
 */
package com.gilt.apidoc.generator.v0.models {

  case class Error(
    code: String,
    message: String
  )

  /**
   * The generator metadata.
   */
  case class Generator(
    key: String,
    name: String,
    language: _root_.scala.Option[String] = None,
    description: _root_.scala.Option[String] = None
  )

  case class Healthcheck(
    status: String
  )

  /**
   * The result of invoking a generator.
   */
  case class Invocation(
    source: String
  )

  case class InvocationForm(
    service: com.gilt.apidoc.spec.v0.models.Service,
    userAgent: _root_.scala.Option[String] = None
  )

}

package com.gilt.apidoc.generator.v0.models {

  package object json {
    import play.api.libs.json.__
    import play.api.libs.json.JsString
    import play.api.libs.json.Writes
    import play.api.libs.functional.syntax._
    import com.gilt.apidoc.generator.v0.models.json._
    import com.gilt.apidoc.spec.v0.models.json._

    private[v0] implicit val jsonReadsUUID = __.read[String].map(java.util.UUID.fromString)

    private[v0] implicit val jsonWritesUUID = new Writes[java.util.UUID] {
      def writes(x: java.util.UUID) = JsString(x.toString)
    }

    private[v0] implicit val jsonReadsJodaDateTime = __.read[String].map { str =>
      import org.joda.time.format.ISODateTimeFormat.dateTimeParser
      dateTimeParser.parseDateTime(str)
    }

    private[v0] implicit val jsonWritesJodaDateTime = new Writes[org.joda.time.DateTime] {
      def writes(x: org.joda.time.DateTime) = {
        import org.joda.time.format.ISODateTimeFormat.dateTime
        val str = dateTime.print(x)
        JsString(str)
      }
    }

    implicit def jsonReadsApidocgeneratorError: play.api.libs.json.Reads[Error] = {
      (
        (__ \ "code").read[String] and
        (__ \ "message").read[String]
      )(Error.apply _)
    }

    implicit def jsonWritesApidocgeneratorError: play.api.libs.json.Writes[Error] = {
      (
        (__ \ "code").write[String] and
        (__ \ "message").write[String]
      )(unlift(Error.unapply _))
    }

    implicit def jsonReadsApidocgeneratorGenerator: play.api.libs.json.Reads[Generator] = {
      (
        (__ \ "key").read[String] and
        (__ \ "name").read[String] and
        (__ \ "language").readNullable[String] and
        (__ \ "description").readNullable[String]
      )(Generator.apply _)
    }

    implicit def jsonWritesApidocgeneratorGenerator: play.api.libs.json.Writes[Generator] = {
      (
        (__ \ "key").write[String] and
        (__ \ "name").write[String] and
        (__ \ "language").writeNullable[String] and
        (__ \ "description").writeNullable[String]
      )(unlift(Generator.unapply _))
    }

    implicit def jsonReadsApidocgeneratorHealthcheck: play.api.libs.json.Reads[Healthcheck] = {
      (__ \ "status").read[String].map { x => new Healthcheck(status = x) }
    }

    implicit def jsonWritesApidocgeneratorHealthcheck: play.api.libs.json.Writes[Healthcheck] = new play.api.libs.json.Writes[Healthcheck] {
      def writes(x: Healthcheck) = play.api.libs.json.Json.obj(
        "status" -> play.api.libs.json.Json.toJson(x.status)
      )
    }

    implicit def jsonReadsApidocgeneratorInvocation: play.api.libs.json.Reads[Invocation] = {
      (__ \ "source").read[String].map { x => new Invocation(source = x) }
    }

    implicit def jsonWritesApidocgeneratorInvocation: play.api.libs.json.Writes[Invocation] = new play.api.libs.json.Writes[Invocation] {
      def writes(x: Invocation) = play.api.libs.json.Json.obj(
        "source" -> play.api.libs.json.Json.toJson(x.source)
      )
    }

    implicit def jsonReadsApidocgeneratorInvocationForm: play.api.libs.json.Reads[InvocationForm] = {
      (
        (__ \ "service").read[com.gilt.apidoc.spec.v0.models.Service] and
        (__ \ "user_agent").readNullable[String]
      )(InvocationForm.apply _)
    }

    implicit def jsonWritesApidocgeneratorInvocationForm: play.api.libs.json.Writes[InvocationForm] = {
      (
        (__ \ "service").write[com.gilt.apidoc.spec.v0.models.Service] and
        (__ \ "user_agent").writeNullable[String]
      )(unlift(InvocationForm.unapply _))
    }
  }
}

package com.gilt.apidoc.generator.v0 {

  object Bindables {

    import play.api.mvc.{PathBindable, QueryStringBindable}
    import org.joda.time.{DateTime, LocalDate}
    import org.joda.time.format.ISODateTimeFormat
    import com.gilt.apidoc.generator.v0.models._

    // Type: date-time-iso8601
    implicit val pathBindableTypeDateTimeIso8601 = new PathBindable.Parsing[org.joda.time.DateTime](
      ISODateTimeFormat.dateTimeParser.parseDateTime(_), _.toString, (key: String, e: Exception) => s"Error parsing date time $key. Example: 2014-04-29T11:56:52Z"
    )

    implicit val queryStringBindableTypeDateTimeIso8601 = new QueryStringBindable.Parsing[org.joda.time.DateTime](
      ISODateTimeFormat.dateTimeParser.parseDateTime(_), _.toString, (key: String, e: Exception) => s"Error parsing date time $key. Example: 2014-04-29T11:56:52Z"
    )

    // Type: date-iso8601
    implicit val pathBindableTypeDateIso8601 = new PathBindable.Parsing[org.joda.time.LocalDate](
      ISODateTimeFormat.yearMonthDay.parseLocalDate(_), _.toString, (key: String, e: Exception) => s"Error parsing date $key. Example: 2014-04-29"
    )

    implicit val queryStringBindableTypeDateIso8601 = new QueryStringBindable.Parsing[org.joda.time.LocalDate](
      ISODateTimeFormat.yearMonthDay.parseLocalDate(_), _.toString, (key: String, e: Exception) => s"Error parsing date $key. Example: 2014-04-29"
    )



  }

}


package com.gilt.apidoc.generator.v0 {

  object Constants {

    val UserAgent = "apidoc:0.9.2 http://www.apidoc.me/gilt/apidoc-generator/0.9.2/play_2_3_client"
    val Version = "0.9.2"
    val VersionMajor = 0

  }

  class Client(
    apiUrl: String,
    auth: scala.Option[com.gilt.apidoc.generator.v0.Authorization] = None
  ) {
    import com.gilt.apidoc.generator.v0.models.json._

    private val logger = play.api.Logger("com.gilt.apidoc.generator.v0.Client")

    logger.info(s"Initializing com.gilt.apidoc.generator.v0.Client for url $apiUrl")

    def generators: Generators = Generators

    def healthchecks: Healthchecks = Healthchecks

    def invocations: Invocations = Invocations

    object Generators extends Generators {
      override def get(
        key: _root_.scala.Option[String] = None,
        limit: Int = 100,
        offset: Int = 0
      )(implicit ec: scala.concurrent.ExecutionContext): scala.concurrent.Future[Seq[com.gilt.apidoc.generator.v0.models.Generator]] = {
        val queryParameters = Seq(
          key.map("key" -> _),
          Some("limit" -> limit.toString),
          Some("offset" -> offset.toString)
        ).flatten

        _executeRequest("GET", s"/generators", queryParameters = queryParameters).map {
          case r if r.status == 200 => _root_.com.gilt.apidoc.generator.v0.Client.parseJson("Seq[com.gilt.apidoc.generator.v0.models.Generator]", r, _.validate[Seq[com.gilt.apidoc.generator.v0.models.Generator]])
          case r => throw new com.gilt.apidoc.generator.v0.errors.FailedRequest(r.status, s"Unsupported response code[${r.status}]. Expected: 200")
        }
      }

      override def getByKey(
        key: String
      )(implicit ec: scala.concurrent.ExecutionContext): scala.concurrent.Future[_root_.scala.Option[com.gilt.apidoc.generator.v0.models.Generator]] = {
        _executeRequest("GET", s"/generators/${play.utils.UriEncoding.encodePathSegment(key, "UTF-8")}").map {
          case r if r.status == 200 => Some(_root_.com.gilt.apidoc.generator.v0.Client.parseJson("com.gilt.apidoc.generator.v0.models.Generator", r, _.validate[com.gilt.apidoc.generator.v0.models.Generator]))
          case r if r.status == 404 => None
          case r => throw new com.gilt.apidoc.generator.v0.errors.FailedRequest(r.status, s"Unsupported response code[${r.status}]. Expected: 200, 404")
        }
      }
    }

    object Healthchecks extends Healthchecks {
      override def getInternalAndHealthcheck()(implicit ec: scala.concurrent.ExecutionContext): scala.concurrent.Future[_root_.scala.Option[com.gilt.apidoc.generator.v0.models.Healthcheck]] = {
        _executeRequest("GET", s"/_internal_/healthcheck").map {
          case r if r.status == 200 => Some(_root_.com.gilt.apidoc.generator.v0.Client.parseJson("com.gilt.apidoc.generator.v0.models.Healthcheck", r, _.validate[com.gilt.apidoc.generator.v0.models.Healthcheck]))
          case r if r.status == 404 => None
          case r => throw new com.gilt.apidoc.generator.v0.errors.FailedRequest(r.status, s"Unsupported response code[${r.status}]. Expected: 200, 404")
        }
      }
    }

    object Invocations extends Invocations {
      override def postByKey(
        key: String,
        invocationForm: com.gilt.apidoc.generator.v0.models.InvocationForm
      )(implicit ec: scala.concurrent.ExecutionContext): scala.concurrent.Future[com.gilt.apidoc.generator.v0.models.Invocation] = {
        val payload = play.api.libs.json.Json.toJson(invocationForm)

        _executeRequest("POST", s"/invocations/${play.utils.UriEncoding.encodePathSegment(key, "UTF-8")}", body = Some(payload)).map {
          case r if r.status == 200 => _root_.com.gilt.apidoc.generator.v0.Client.parseJson("com.gilt.apidoc.generator.v0.models.Invocation", r, _.validate[com.gilt.apidoc.generator.v0.models.Invocation])
          case r if r.status == 409 => throw new com.gilt.apidoc.generator.v0.errors.ErrorsResponse(r)
          case r => throw new com.gilt.apidoc.generator.v0.errors.FailedRequest(r.status, s"Unsupported response code[${r.status}]. Expected: 200, 409")
        }
      }
    }

    def _requestHolder(path: String): play.api.libs.ws.WSRequestHolder = {
      import play.api.Play.current

      val holder = play.api.libs.ws.WS.url(apiUrl + path).withHeaders(
        "User-Agent" -> Constants.UserAgent,
        "X-Apidoc-Version" -> Constants.Version,
        "X-Apidoc-Version-Major" -> Constants.VersionMajor.toString
      )
      auth.fold(holder) { a =>
        a match {
          case Authorization.Basic(username, password) => {
            holder.withAuth(username, password.getOrElse(""), play.api.libs.ws.WSAuthScheme.BASIC)
          }
          case _ => sys.error("Invalid authorization scheme[" + a.getClass + "]")
        }
      }
    }

    def _logRequest(method: String, req: play.api.libs.ws.WSRequestHolder)(implicit ec: scala.concurrent.ExecutionContext): play.api.libs.ws.WSRequestHolder = {
      val queryComponents = for {
        (name, values) <- req.queryString
        value <- values
      } yield name -> value
      val url = s"${req.url}${queryComponents.mkString("?", "&", "")}"
      auth.fold(logger.info(s"curl -X $method $url")) { _ =>
        logger.info(s"curl -X $method -u '[REDACTED]:' $url")
      }
      req
    }

    def _executeRequest(
      method: String,
      path: String,
      queryParameters: Seq[(String, String)] = Seq.empty,
      body: Option[play.api.libs.json.JsValue] = None
    )(implicit ec: scala.concurrent.ExecutionContext): scala.concurrent.Future[play.api.libs.ws.WSResponse] = {
      method.toUpperCase match {
        case "GET" => {
          _logRequest("GET", _requestHolder(path).withQueryString(queryParameters:_*)).get()
        }
        case "POST" => {
          _logRequest("POST", _requestHolder(path).withQueryString(queryParameters:_*)).post(body.getOrElse(play.api.libs.json.Json.obj()))
        }
        case "PUT" => {
          _logRequest("PUT", _requestHolder(path).withQueryString(queryParameters:_*)).put(body.getOrElse(play.api.libs.json.Json.obj()))
        }
        case "PATCH" => {
          _logRequest("PATCH", _requestHolder(path).withQueryString(queryParameters:_*)).patch(body.getOrElse(play.api.libs.json.Json.obj()))
        }
        case "DELETE" => {
          _logRequest("DELETE", _requestHolder(path).withQueryString(queryParameters:_*)).delete()
        }
         case "HEAD" => {
          _logRequest("HEAD", _requestHolder(path).withQueryString(queryParameters:_*)).head()
        }
         case "OPTIONS" => {
          _logRequest("OPTIONS", _requestHolder(path).withQueryString(queryParameters:_*)).options()
        }
        case _ => {
          _logRequest(method, _requestHolder(path).withQueryString(queryParameters:_*))
          sys.error("Unsupported method[%s]".format(method))
        }
      }
    }

  }

  object Client {

    def parseJson[T](
      className: String,
      r: play.api.libs.ws.WSResponse,
      f: (play.api.libs.json.JsValue => play.api.libs.json.JsResult[T])
    ): T = {
      f(play.api.libs.json.Json.parse(r.body)) match {
        case play.api.libs.json.JsSuccess(x, _) => x
        case play.api.libs.json.JsError(errors) => {
          throw new com.gilt.apidoc.generator.v0.errors.FailedRequest(r.status, s"Invalid json for class[" + className + "]: " + errors.mkString(" "))
        }
      }
    }

  }

  sealed trait Authorization
  object Authorization {
    case class Basic(username: String, password: Option[String] = None) extends Authorization
  }

  trait Generators {
    /**
     * Get all available generators
     */
    def get(
      key: _root_.scala.Option[String] = None,
      limit: Int = 100,
      offset: Int = 0
    )(implicit ec: scala.concurrent.ExecutionContext): scala.concurrent.Future[Seq[com.gilt.apidoc.generator.v0.models.Generator]]

    /**
     * Get generator with this key
     */
    def getByKey(
      key: String
    )(implicit ec: scala.concurrent.ExecutionContext): scala.concurrent.Future[_root_.scala.Option[com.gilt.apidoc.generator.v0.models.Generator]]
  }

  trait Healthchecks {
    def getInternalAndHealthcheck()(implicit ec: scala.concurrent.ExecutionContext): scala.concurrent.Future[_root_.scala.Option[com.gilt.apidoc.generator.v0.models.Healthcheck]]
  }

  trait Invocations {
    /**
     * Invoke a generator
     */
    def postByKey(
      key: String,
      invocationForm: com.gilt.apidoc.generator.v0.models.InvocationForm
    )(implicit ec: scala.concurrent.ExecutionContext): scala.concurrent.Future[com.gilt.apidoc.generator.v0.models.Invocation]
  }

  package errors {

    import com.gilt.apidoc.generator.v0.models.json._
    import com.gilt.apidoc.spec.v0.models.json._

    case class ErrorsResponse(
      response: play.api.libs.ws.WSResponse,
      message: Option[String] = None
    ) extends Exception(message.getOrElse(response.status + ": " + response.body)){
      lazy val errors = _root_.com.gilt.apidoc.generator.v0.Client.parseJson("Seq[com.gilt.apidoc.generator.v0.models.Error]", response, _.validate[Seq[com.gilt.apidoc.generator.v0.models.Error]])
    }

    case class FailedRequest(responseCode: Int, message: String, requestUri: Option[_root_.java.net.URI] = None) extends Exception(s"HTTP $responseCode: $message")

  }

}