# School-Management-System-Backend
This is the backend for a School Management System, built with Spring Boot, Java 21, Hibernate, and PostgreSQL. It provides secure authentication, student and staff management, attendance tracking, fee management, and integration with BioTime 8.5 for access control.

Features
✅ User Authentication – Email/phone sign-up, OTP verification, Google Sign-In
✅ Subscription Management – Monthly, annual, and five-year payment plans
✅ Student & Teacher Management – CRUD operations for user data
✅ Attendance & Performance Tracking – Real-time monitoring and reporting
✅ Payment Integration – Planned integration with Pesapal
✅ Excel Import Support – Bulk student uploads
✅ Access Control – Integration with BioTime 8.5 for RFID card-based entry

Installation & Setup
Prerequisites
Ensure you have the following installed:

Java 21
Maven
PostgreSQL
NetBeans (optional)

1. Clone the Repository
bash
Copy
Edit
git clone https://github.com/kasimlyee/School-Management-System-Backend.git
cd school-management-system
2. Configure Database
Create a PostgreSQL database named school_management_system.
Update src/main/resources/application.properties with your PostgreSQL credentials:
properties
Copy
Edit
# Database Configuration
spring.datasource.url=jdbc:postgresql://localhost:5432/school_management_system
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.datasource.driver-class-name=org.postgresql.Driver

# Hibernate Configuration
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
3. Build & Run the Application
bash
Copy
Edit
mvn clean install
mvn spring-boot:run
API Endpoints
Authentication
🔹 User Registration
http
Copy
Edit
POST /api/auth/register
Request Body:

json
Copy
Edit
{
  "email": "user@example.com",
  "password": "securepassword",
  "phone": "+256700000000"
}
Response:

json
Copy
Edit
{
  "message": "User registered successfully"
}
🔹 OTP Verification
http
Copy
Edit
POST /api/auth/verify-otp
Request Body:

json
Copy
Edit
{
  "email": "user@example.com",
  "otp": "123456"
}
Students Management
🔹 Get All Students
http
Copy
Edit
GET /api/students
Response:

json
Copy
Edit
[
  {
    "id": 1,
    "name": "John Doe",
    "class": "Grade 5"
  }
]
🔹 Add New Student
http
Copy
Edit
POST /api/students
Request Body:

json
Copy
Edit
{
  "name": "John Doe",
  "class": "Grade 5",
  "email": "johndoe@example.com"
}
Payments
🔹 Initiate Payment
http
Copy
Edit
POST /api/payments/initiate
Request Body:

json
Copy
Edit
{
  "userId": 1,
  "plan": "monthly"
}
Deploying on Railway
1️⃣ Install Railway CLI (if not installed)

bash
Copy
Edit
curl -fsSL https://railway.app/install.sh | sh
2️⃣ Login to Railway

bash
Copy
Edit
railway login
3️⃣ Initialize Railway Project

bash
Copy
Edit
railway init
4️⃣ Set Up PostgreSQL on Railway

In the Railway Dashboard, add a PostgreSQL database and get the connection URL.
Update application.properties:
properties
Copy
Edit
spring.datasource.url=${DATABASE_URL}
spring.datasource.username=${DATABASE_USER}
spring.datasource.password=${DATABASE_PASSWORD}
5️⃣ Deploy to Railway

bash
Copy
Edit
git add .
git commit -m "Deploying to Railway"
git push origin main
railway up
Upcoming Features
🔹 Pesapal Payment Gateway Integration
🔹 Automated Attendance Reports
🔹 AI-Powered Performance Analytics

Contributing
Contributions are welcome! Fork the repo, create a new branch, and submit a pull request.

License
This project is licensed under MIT License.

Thank You!
Kasim Lyee
