package com.exampleslick.models

import com.exampleslick.models.definition.UserId
import slick.jdbc.MySQLProfile.api._

case class User(id: Option[UserId], username: String, password: String, location: String, gender: Int)

case class Users(users: Seq[User])


class UsersTable(tag: Tag) extends Table[User](tag, "users") {

  def id = column[UserId]("id", O.PrimaryKey, O.AutoInc)
  def username = column[String]("username")
  def password = column[String]("password")
  def location = column[String]("location")
  def gender = column[Int]("gender")

  //Add id to *
  def * = (id.?, username, password, location, gender) <> ((User.apply _).tupled, User.unapply)
}