package controllers

import play.api.mvc.{Controller, Action}

class ScalaController extends Controller {

  def docs(message: String) = Action {
    Ok(views.html.docs.render(message, "Scala"))
  }
}
