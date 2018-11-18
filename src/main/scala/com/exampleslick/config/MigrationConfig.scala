package com.exampleslick.config

import org.flywaydb.core.Flyway

trait MigrationConfig extends Config {

  private val flyway = new Flyway()

  flyway.setDataSource(databaseUrl, databaseUser, databasePassword)

  /**
    * Flyway Repair is important when one database Micration fails
    * Once you correct the Migration Issue, then run these line
    * to fix the issue.
    * @return
    */
  //flyway.repair()

  def migrate() = flyway.migrate()

  def reloadSchema() = {
    flyway.clean()
    flyway.migrate()
  }
}