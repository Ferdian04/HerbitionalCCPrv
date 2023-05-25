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
  - `user_email_address` : string, `NOT NULL`
  - `user_password`: string, `NOT NULL`
  ```
  {
    fullname: "Big bob",
    user_email_address: "email@email.com",
    user_password: "examplepass123"
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
  - `user_email_address` : string, email need to be valid
  - `user_password`: string, email and password need to be match

```
{
    user_email_address : "example@email.com",
    user_password: "exmaplepassword123"
}
```

- Response:

```
{
status: true,
code: 200,
message: "logged in successfully",
Token
}
```

- Err Response:
  - `400` : EMAIL_REQUIRED, PASS_REQUIRED
  - `401` : USER_NOT_FOUND, EMAIL_NOT_REGISTERED, PASSWORD_INVALID
