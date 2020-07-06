**API-REST - SPRING - MONGODB**
----
_This API was created with a very simple concept, simulate a small blog, that is, there are users these users make posts and this posts contains comments from the same users._

* **URL**
_The api was deployed, if you want to make requests to the server the URL is:_

_https://api-rest-spring-mongodb.herokuapp.com/_

* **METHOD:**
  
  _The main operations of the API are related to the User and Post Entities_
  
  * **User:**

  `GET` | `POST` 
  _URL: https://api-rest-spring-mongodb.herokuapp.com/users_
  
  `DELETE` | `PUT`
  _URL: https://api-rest-spring-mongodb.herokuapp.com/users/{id}_
  
  
   * **Post:**

  `GET` | `POST`
  _URL: https://api-rest-spring-mongodb.herokuapp.com/post_
  
  `DELETE` | `PUT`
  _URL: https://api-rest-spring-mongodb.herokuapp.com/post/{id}_

  
* **Data Params**

  _To make POST requests follow an example below the JSON format to be sent:_
  
  
  
  **User**
  
  ```
  {
    "name": "User",
    "email": "user@gmail.com"
  }
  ```
  
  
  **Post**

    ```
  {
	 "date": "2020-06-30T21:53:07.156+00:00",
    "title": "new post",
    "body": "post",
    "author": {"id": "5efbc95a18962a2b86dc9cea"},
    "comments": [
        {
            "text": "comment post",
            "date": "2020-06-30T21:53:07.156+00:00",
            "author": {
                "id": "5efbc95a18962a2b86dc9ce9",
                "name": "John Connor"
                }
        }
    ]
  }
  ```
  
  **Get**
  
	  Success Response:
	  
		Expected response to the success of the Get request

		  Code: 200 
		  Content: { name : "user", email: "user@gmail" }
	 
	  Error Response:

		Expected response to Get request failure.

		Code: 404 NOT FOUND 
		Content: { error : "Log in" }
	
	
  **Post**
  
		Success Response:
  
		   Expected response to the success of the Post request

			Code: 201 
	 
	   Error Response:

		Expected response to Post request failure.

		  Code: 400 BAD REQUEST 
	

**Notes:**

  If you have any questions about any project endpoint, access the API documentation at:
  
  https://api-rest-spring-mongodb.herokuapp.com/swagger-ui.html#/
