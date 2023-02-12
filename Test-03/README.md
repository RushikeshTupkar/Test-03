# University Event Management Project
## Frameworks and language used:
-  Spring Boot
-  Java
## Data Flow


* **Controller** :

   There are two Controller class in this application.

  1. Student Controller Class.
  2. Event Controller Class.


**Functions/Endpoints used in Student Controller Class.**
- To add Student data :
- http://localhost:8080/api/v1/addStudent


- To get all student's information:
- http://localhost:8080/api/v1/get_all_students


- To update student's department:
- http://localhost:8080/api/v1/update_student_department/2/Civil


- To delete student b y id:
- http://localhost:8080/api/v1/delete_student/4

**Functions/Endpoints used in Event Controller Class.**

- To add event:
- http://localhost:8080/api/v1/event/addEvent


- To get all event's information:
- http://localhost:8080/api/v1/event/getAllEvents


- To update event:
- http://localhost:8080/api/v1/event/updateEvent


- To delete event:
- http://localhost:8080/api/v1/event/deleteEvent/1 
* **Service** :

   * In this application there are two service class .
     * Student Service Class
     * Event Service Class


* **Repository**

  * In this application there are two Repository class.  
    * IStudentRepository
    * IEventRepository

* **Database**

   * I have used H2 Database to store the data.

## Project Summary

In this University Event Management Application you can add,delete,fetch and update events using RestApi end points.
You can perform CRUD operations in this application.
You can also add,delete,update and fetch student's data.
You can also use H2 database to view information in tabular form.



  













  