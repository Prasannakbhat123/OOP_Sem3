# Manipal Hackathon 2024 - Official Hackathon Repository

## 📜 Introduction

Welcome to **Manipal Hackathon 2024**!

The event runs from **8:00 AM on 16th October** to **5:00 PM on 18th October** at **Manipal Institute of Technology**. This repository serves as the central hub for projects.

### Important Guidelines:

- **Disclosure of your college/university** leads to **disqualification**.
- **Participants cannot leave** before the event ends.
- **Teams must push code updates every hour** for transparency.


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

1. **1.Ensure the Docker container is running:**

   ```bash
   docker-compose up -d

2. **Push the changes to your repository:**

   ```bash
   git add .
   git commit -m "Deploying to production"
   git push origin main

3. **Monitor the deployment:**

Ensure your Docker container is running on the production server.


## ❌ Uninstallation

To stop the Docker container and remove all related resources:

1. **Stop the Docker container:**

   ```bash
   docker-compose down

1. **2. Remove all Docker resources:**

   ```bash
   docker system prune -a
