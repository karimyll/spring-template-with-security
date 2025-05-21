# Spring Boot Security Template

This repository provides a **ready-to-use Spring Security structure** for Spring Boot projects. You can copy and use this template as a starter for projects that require authentication, authorization, and security best practices.

---

## Features

- **JWT Authentication:** Secure endpoints using JSON Web Tokens.
- **Custom `UserDetailsService`:** Load users from your own data source.
- **Stateless Session Management:** Perfect for RESTful APIs.
- **Custom Exception Handling:** Returns proper responses for unauthorized or forbidden requests.
- **Strong Password Encoding:** Uses BCrypt for password hashing.
- **Easily Extendable:** Add custom endpoints, roles, or permissions as needed.

---

## How to Use

1. **Clone or Download this Repository:**
   ```
   git clone https://github.com/karimyll/spring-template-with-security.git
   ```

2. **Copy the Structure or Use as a Template:**
   - Use the repository as a GitHub template, or
   - Copy the following files/folders into your own project:
     - `config/ApplicationConfig.java`
     - `config/WebSecurityConfig.java`
     - `config/JwtAuthenticationFilter.java`
     - `dao/repository/UserRepository.java`
     - `model/UserEntity.java`
     - `service/auth/JwtService.java`

3. **Update Package Names:**  
   Change package names to match your project's structure.

4. **Configure Endpoints:**  
   Adjust the endpoint matchers and security rules in `WebSecurityConfig.java` for your application.

5. **Set Your JWT Secret:**  
   In your `application.properties`:
   ```
   jwt.secret=your_jwt_secret_key
   ```

6. **Implement Registration & Login:**  
   Create endpoints for user registration and authentication if needed.

---

## Example Project Structure

```
src/main/java/your/package/
 └── config/
      ├── ApplicationConfig.java
      ├── WebSecurityConfig.java
      └── JwtAuthenticationFilter.java
 └── service/auth/
      └── JwtService.java
 └── dao/repository/
      └── UserRepository.java
 └── model/
      └── UserEntity.java
```

---

## Basic Authentication Flow

1. **Login:**  
   User logs in and receives a JWT token.
2. **Send JWT:**  
   User includes the token in the `Authorization: Bearer <token>` header for protected endpoints.
3. **Token Validation:**  
   `JwtAuthenticationFilter` validates the token and authenticates the user.

---

## Customization

- **Add Public Endpoints:**  
  In `WebSecurityConfig`, add more `.requestMatchers(...).permitAll()` lines as needed.

- **Add Roles/Authorities:**  
  Extend the `UserEntity` and adjust authorization logic.

- **Change Password Encoder:**  
  Modify the bean in `ApplicationConfig` if you prefer a different encoder.

---

## License

This template is free to use and modify for your own projects.
