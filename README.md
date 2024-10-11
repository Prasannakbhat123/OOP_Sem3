# Manipal Hackathon 2024 - Official Hackathon Repository

## 📜 Introduction

Welcome to the **Manipal Hackathon 2024**!

The hackathon will begin at **8:00 AM on 16th October 2024** and will conclude at **5:00 PM on 18th October 2024**. It will be hosted at **Manipal Institute of Technology, Manipal**. This repository serves as the central hub for all the projects developed during the event.

### Important Guidelines:

- **Disclosure of your college or university** will lead to **immediate disqualification**.
- **Participants cannot leave the venue** before the hackathon is officially completed.
- **Teams must push their code updates at least once every hour** to this repository to ensure continuous progress and transparency.

## 🚀 Requirements

Before starting, ensure you have the following tools installed (based on your preferred setup):

- **Git** (for version control)
- **Docker** (optional, for containerized setup)
- **Node.js**, **npm**, or any specific project dependencies based on your stack
- Alternatively, any **local server** setup like **XAMPP, WAMP, etc.**

## ⚙️ Local Installation

To get the project running locally, follow these steps:

1. **Clone the repository:**

   ```bash
   git clone https://github.com/your-team-repo/manipal-hackathon-2024.git
   cd manipal-hackathon-2024

2. **If you're using Docker (optional):**

Ensure Docker is installed on your machine. If not, download and install Docker from [here](https://docs.docker.com/get-docker/).

3. **Build and Run the Docker container:**

```bash
   docker-compose up --build

4. **Access the Application:**

```bash
   http://localhost:3000

or the port defined in your Docker configuration.

## 📦 Deployment Instructions for Docker

To deploy the application, follow these steps:

      ```bash
      docker-compose up -d


**2. Push the changes to your repository:**

      ```bash
      git add .
      git commit -m "Deploying to production"
      git push origin main

**3. Monitor the deployment:**

Ensure your Docker container is running on the production server.

## ❌ Uninstallation

To stop the Docker container and remove all related resources:

**1. Stop the Docker container:**

docker-compose down

