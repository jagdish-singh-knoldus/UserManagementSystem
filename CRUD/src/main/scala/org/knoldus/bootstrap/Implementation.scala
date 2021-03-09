package org.knoldus.bootstrap

import org.knoldus.Controller.UserCRUD
import org.knoldus.Modal.User
import scala.io.StdIn.{readInt, readLine}

object Implementation extends App with UserCRUD{
  /**
   * input string to update username
   * @return
   */
  def inputString: String = {
    readLine()
  }

  /**
   * input int for index to be deleted
   * @return
   */
  def inputInt: Int = {
    readInt()
  }

  /**
   * insert user details
   */
  def insert: Unit ={
    create(new User("admin", "admin name", "username"))
    create(new User("customer", "customer1", "customerUser1"))
    create(new User("customer", "customer2", "customerUser2"))
    create(new User("customer", "customer3", "customerUser3"))
    create(new User("customer", "customer4", "customerUser4"))
    create(new User("customer", "customer5", "customerUser5"))
  }

  /**
   * delete customer from ListBuffer
   * @param deleteIndex
   */
  def deleteCustomer(deleteIndex:Int): Unit ={
    if (deleteIndex == 0)
      println("Selected user is not customer!")
    else
      delete(deleteIndex)
  }

    insert
    listAllUsers
    print("Enter username to be updated for the admin : ")
    updateUsername(0, inputString)
    listAllUsers
    print("Enter index of customer to be deleted: ")
    val deleteIndex = inputInt
    deleteCustomer(deleteIndex)
    listAllUsers
}
