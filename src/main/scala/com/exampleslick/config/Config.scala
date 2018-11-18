package com.exampleslick.config

import com.typesafe.config.ConfigFactory

trait Config {
  private val config = ConfigFactory.load()
  //private val httpConfig = config.getConfig("http")
  private val databaseConfig = config.getConfig("database")

  val databaseUrl = databaseConfig.getString("url")
  val databaseUser = databaseConfig.getString("user")
  val databasePassword = databaseConfig.getString("password")
}