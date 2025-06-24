# LinkedIn Application (Microservices-Based System)

This project is a scalable **LinkedIn-like application** developed using **Spring Boot** and based on a **microservices architecture**. The system is designed to be cloud-native, containerized using **Docker**, and orchestrated using **Kubernetes**.

---

## 🧹 Architecture Overview

The application is divided into **6 core microservices**, each handling a specific domain:

### 1. **User Service**

* **Responsibilities**: User registration, login, and authentication.
* **Security**: JWT (JSON Web Token) based authentication.
* **Database**: PostgreSQL.

### 2. **Post Service**

* **Responsibilities**: Creating and managing user posts.
* **Database**: PostgreSQL.

### 3. **Connection Service**

* **Responsibilities**: Sending and managing connection requests.
* **Graph DB**: Neo4j is used to handle **first-degree connections**, ensuring efficient relationship traversal and reduced query latency.

### 4. **Notification Service**

* **Responsibilities**: Sending real-time notifications (e.g., when a connection request is received).
* **Message Queue**: Kafka is used for asynchronous communication to avoid overwhelming the database.

### 5. **API Gateway**

* **Responsibilities**: Acts as a **single point of entry** for all client requests.
* **Features**: Routing, logging, security, and rate limiting.

### 6. **Eureka Discovery Server**

* **Responsibilities**: Handles dynamic service registration and discovery.
* **Library**: Netflix Eureka.

---

## 🧱 Technologies Used

| Technology    | Description                                  |
| ------------- | -------------------------------------------- |
| Spring Boot   | Core framework for building microservices    |
| PostgreSQL    | Relational database for user and post data   |
| Neo4j         | Graph database for modeling user connections |
| Apache Kafka  | Message broker for handling notifications    |
| JWT           | Secure user authentication                   |
| Eureka Server | Service discovery mechanism                  |
| Docker        | Containerization of services                 |
| Kubernetes    | Orchestration and deployment                 |

---

## 🚀 Deployment Architecture

All services and databases are **Dockerized**, and deployed to a **Kubernetes cluster**. This ensures:

* Horizontal scalability
* Fault tolerance
* Service isolation
* Load balancing

---

## 📦 How to Run (Locally)

### Prerequisites:

* Docker & Docker Compose
* Kubernetes (e.g., Minikube or local cluster)
* Java 17+
* Maven
* Neo4j Desktop / AuraDB
* Kafka Broker (e.g., using Confluent Platform)

### General Steps:

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/linkedin-microservices.git
   cd linkedin-microservices
   ```

2. Build all services:

   ```bash
   mvn clean package -DskipTests
   ```

3. Dockerize each service:

   ```bash
   docker build -t your-image-name ./service-folder
   ```

4. Deploy on Kubernetes:

   ```bash
   kubectl apply -f k8s/
   ```

5. Access the application via API Gateway:

   ```
   http://localhost:{gateway-port}
   ```

---

## 📚 Future Improvements

* Integrate WebSocket for real-time updates
* Add Email verification for user registration
* Use Prometheus + Grafana for observability
* Implement Circuit Breaker (e.g., Resilience4j)

---

