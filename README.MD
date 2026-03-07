# Scientific Calculator – DevOps CI/CD Project

## Project Description
This project implements a **Scientific Calculator application** along with a **complete DevOps pipeline**.  
The goal is to automate the **build, test, containerization, deployment, and monitoring workflow** using modern DevOps tools.

The calculator is implemented in **Java** and built using **Maven**, while the deployment pipeline is handled through **Jenkins, Docker, DockerHub, Ansible, and ngrok**.

---

# Scientific Calculator Features

The calculator supports the following operations:

• Square Root → √x  
• Factorial → x!  
• Natural Logarithm → ln(x)  
• Power Function → x^b

The application runs through a **command-line interface**.

---

# DevOps Pipeline Overview

The project demonstrates the following DevOps stages:

1. **Source Code Management**
    - Code is maintained in **GitHub**
    - Repository stores source code and DevOps configuration files.

2. **Build Automation**
    - **Maven** compiles and packages the Java application.

3. **Testing**
    - **JUnit** is used for unit testing of calculator functions.

4. **Continuous Integration**
    - **Jenkins Pipeline** automatically triggers build and testing whenever code is pushed to GitHub.

5. **Containerization**
    - **Docker** packages the calculator application into a container image.

6. **DockerHub Integration**
    - Docker image is pushed to **DockerHub** for remote deployment.

7. **Deployment**
    - **Ansible** pulls the Docker image and runs the container automatically.

8. **External Access**
    - **ngrok** is used to expose the Jenkins server to the internet.

9. **Email Notification**
    - Jenkins sends an email notification after every pipeline execution.

---

# Tools & Technologies Used Here

• Java  
• Maven  
• Git & GitHub  
• Jenkins  
• Docker  
• DockerHub  
• Ansible  
• ngrok

---
