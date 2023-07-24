# HttpServletRequestAttribute

### Problem Statement

Create a microservice to strore and throw errorDetails in HttpServletRequest Attribute.

### Curl Commands

```
curl --location --request POST 'http://localhost:8080/validateTicket' \
--header 'ticketNumber: ABC345' \
--data ''
```
<u>Success Response</u>
```
Ticket Number Validation Successful : ABC345
```

</details>

<u>Error Response</u>
1. Missing ticket number
```json
{
  "errors": [
    {
      "errorCode": "101",
      "errorMessage": "Ticket number is missing"
    }
  ]
}
```
2. Invalid ticket number : ABC345645678
```json
{
  "errors": [
    {
      "errorCode": "102",
      "errorMessage": "Invalid Ticket Number : Size must be less than 9"
    }
  ]
}
```
3. Invalid ticket number : 3456
```json
{
    "errors": [
        {
            "errorCode": "103",
            "errorMessage": "Invalid Ticket Number : Must start with ABC"
        }
    ]
}
```
4. Invalid ticket number : 345645678234
```json
{
  "errors": [
    {
      "errorCode": "102",
      "errorMessage": "Invalid Ticket Number : Size must be less than 9"
    },
    {
      "errorCode": "103",
      "errorMessage": "Invalid Ticket Number : Must start with ABC"
    }
  ]
}
```
</details>
