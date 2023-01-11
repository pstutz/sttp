package sttp.client3

import scala.concurrent.Future

object quick extends SttpApi {
  lazy val backend: Backend[Future] = FetchBackend()
  lazy val simpleHttpClient: SimpleHttpClient = SimpleHttpClient(backend)
}
