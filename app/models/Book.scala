package models

/**
  * Created by macbook on 02/10/2017.
  */
class Book(id:Int, title:String, price:Double, author:String) {

  val book1 = new Book(1, "Emily's World", 12.00, "Emily Thornton")
  val book2 = new Book(2, "Dave's World", 30.00, "Lee Thornton")
  val book3 = new Book(3, "Scully's World", 100.00, "Scully Thornton")

  val books:List[Book] = List[Book](book1, book2, book3)

  def allBooks: List[Book] = {
    books
  }

  def findBook(i: Int): List[Book] = {
    books.filter(_.id == i)
  }

  /*def addBook(): Unit ={

  }*/
}
