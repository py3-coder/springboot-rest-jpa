# springboot-rest-jpa
Simple CRUD app using spring boot and data jpa 

# Job Post Management API

This is a Spring Boot REST API for managing job posts, allowing users to perform CRUD operations and search job listings.

## Endpoints

### Get All Job Posts
- **URL**: `/jobPosts`
- **Method**: `GET`
- **Description**: Retrieves a list of all job posts.

### Get Job Post by ID
- **URL**: `/jobPost/{id}`
- **Method**: `GET`
- **Description**: Fetches a job post by its ID.

### Add a New Job Post
- **URL**: `/jobPost`
- **Method**: `POST`
- **Description**: Adds a new job post.

### Update a Job Post
- **URL**: `/update/jobPost`
- **Method**: `PUT`
- **Description**: Updates an existing job post.

### Delete a Job Post
- **URL**: `/delete/jobPost/{id}`
- **Method**: `DELETE`
- **Description**: Deletes a job post by its ID.

### Search Job Posts by Keyword
- **URL**: `/search/jobPost/{keyword}`
- **Method**: `GET`
- **Description**: Searches job posts by a keyword.

### Search Job Posts by Required Experience
- **URL**: `/search/jobPost/yoe/{year}`
- **Method**: `GET`
- **Description**: Searches job posts by required years of experience.

### Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- Mysql

