# HttpServletRequestAttribute

### Problem Statement

Create a microservice to strore and throw errorDetails in HttpServletRequest Attribute.

### Curl Commands

```
curl --location --request POST 'http://localhost:8080/validateFirstScreen' \
--header 'Content-Type: application/json' \
--header 'flag: true' \
--header 'Cookie: JSESSIONID=5465B0BB022F81E4DAAADA5599DD0589' \
--data-raw ''
```
<I>Success Response</I>
```json
{
  "message": "SUCCESS"
}
```

</details>

<I>Error Response</I>
```json
{
    "multipleErrors": [
        {
            "errorCode": "101",
            "errorMessage": "First Screen Error Message for First Validation Check"
        },
        {
            "errorCode": "102",
            "errorMessage": "First Screen Error Message for Second Validation Check"
        }
    ]
}
```

</details>
