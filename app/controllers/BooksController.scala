package controllers
import javax.inject._
import play.api._
import play.api.mvc._
import views.books._

/**
  * Created by macbook on 29/09/2017.
  */
class BooksController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  //get all books

  def index() = Action { implicit request: Request[AnyContent] =>
    val allBooks = Book.allBooks

    Ok(index())
  }

  //create a book

  def create() = Action { implicit request: Request[AnyContent] =>
    Ok("hello")
  }

  def save() = Action { implicit request: Request[AnyContent] =>
    Ok("hello")
  }

  def edit(id:Int) = Action { implicit request: Request[AnyContent] =>
    Ok("hello")
  }

  def update() = Action { implicit request: Request[AnyContent] =>
    Ok("hello")
  }

  def destroy(id:Int) = Action { implicit request: Request[AnyContent] =>
    Ok("hello")
  }

  def show(id:Int) = Action { implicit request: Request[AnyContent] =>
    Ok("hello")
  }

}
