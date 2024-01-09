This project demonstrates custom exception handling and validation
EmailAlreadyExistsException custom exception class throws exception when the email being inserted is already present in the
database.
ResourceNotFoundException custom exception class throws exception when the user is trying to access a resource which is not found.
ErrorDetails class defines the structure of the error message that will be sent to end user.
GlobalExceptionHandler class handles three types of exception.
    Handles EmailAlreadyExistsException and sends custom response to end user.
    Handles ResourceNotFoundException and sends custom response to end user.
    Handles general exception and responds the specific error message to end user.
    Overrides handleMethodArgumentNotValid method and responds with the specific error message for validation errors.

All the endpoints are exposed using open api documentation,
Use the below URI to view the swagger documentation.
/swagger-ui/index.html
