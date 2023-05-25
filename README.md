# Herbitional API

This is API Service for Capstone Project on Bangkit 2022. For Api Documentation you can visit this link:
link

## Built with

- Express 4.18.2

# Herbitional API Planning & Documentation

URL: http://herbitional-api.com/api/{version}/{Group}/{endpoint}

---

## Group: Auth

### [1] - Register

- URL:
  - http://url-api.com/api/v1/auth/register
- Endpoint:
  - `/register`
- Method:
  - `POST`
- Request Body:
  - `fullname` : string, `NOT NULL`,
  - `email` : string, `NOT NULL`
  - `password`: string, `NOT NULL`
  ```
  {
    name: "Big bob",
    email: "email@email.com",
    password: "examplepass123"
  }
  ```
- Response:
  ```
  status: "Success",
  code: 201,
  ```
- Error Response:
  - `400` : EMAIL_REQUIRED, PASSWORD_REQUIRED,
  - `409` : EMAIL_ALREADY_EXIST,

### [2] - Login

- URL:
  - http://wwww.url-api.com/api/v1/auth/login
- Endpoint:
  - `/login`
- Method:
  - `POST`
- Request Body:
  - `email` : string, email need to be valid
  - `password`: string, email and password need to be match

```
{
    email : "example@email.com",
    password: "exmaplepassword123"
}
```

- Response:

```
{
status: true,
code: 200,
message: "LOGIN_SUCCESS",
Token
}
```

- Err Response:
  - `400` : EMAIL_REQUIRED, PASS_REQUIRED
  - `401` : USER_NOT_FOUND, EMAIL_NOT_REGISTERED, PASSWORD_INVALID
