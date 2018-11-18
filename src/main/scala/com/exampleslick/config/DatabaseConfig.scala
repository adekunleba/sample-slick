package com.exampleslick.config

trait DatabaseConfig extends Config {

  val driver = slick.jdbc.MySQLProfile

  import driver.api._

  def db = Database.forConfig("database")

  implicit val session: Session = db.createSession()
}