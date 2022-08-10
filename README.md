<!--
*** Thanks for checking out the poweRScape. If you have a suggestion
*** that would make this better, please fork the repo and create a pull request
*** or simply open an issue with the tag "enhancement".
*** Thanks again! Now go create something AMAZING! :D
-->



<!-- PROJECT SHIELDS -->
<!--
*** I'm using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
-->


<!-- PROJECT LOGO -->
<br />
<p align="center">
  <a href="https://github.com/cassie365/powerscape">
    <img src="https://user-images.githubusercontent.com/63379551/184011804-d186ee3c-801c-42bc-8002-563cd9b4eda1.png" alt="Logo">
  </a>

  <h3 align="center">poweRScape</h3>

  <p align="center">
    <br />
    <a href="https://github.com/cassie365/powerscape"><strong>Explore the docs »</strong></a>
    <br />
    <br />
    <a href="https://github.com/cassie365/powerscape">View Demo</a>
    ·
    <a href="https://github.com/cassie365/powerscape/issues">Report Bug</a>
    ·
    <a href="https://github.com/cassie365/powerscape/issues">Request Feature</a>
  </p>
</p>



<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#contact">Contact</a></li>
    <li><a href="#acknowledgements">Acknowledgements</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project

PoweRScape is an application empowering OSRS players to manage and track GE transactions and XP gains

This project uses a Java backend which serves as the REST API which the React.js frontend will consume. Data is pulled from Jagex's website and then transformed to be consume by the backend, since the result of api calls to Jagex are non-standard plain text responses.

Note: Ultimately this tool will be a packaged container which can then be run by the user. This container runs a cron job at midnight every night to query account data for tracked accounts. This data is then persisted in a local database running on the same server. This design may change as I optimize the project, but for now this is where we are headed.

### Built With

* [Maven]()
* [Java 18]()
* [Spring Boot]()
* [Spring Data JPA]()
* [Postgres]()
* [Project Lombok]()
* [React.js]()

<!-- GETTING STARTED -->
## Getting Started
This project is not fully designed and I am still working on implemeting certain best practices to the front end. As such, I have not yet documented dev environment setup as it may change.

If you would like to contribute, please reach out to me!


### Prerequisites
### Installation




<!-- USAGE EXAMPLES -->
## Usage
This project is intended to be hosted within Docker. When images are released, information on how to import images and host them yourself will be available here.


<!-- CONTRIBUTING -->
## Contributing
If you are interested in contributing to the project, feel free to fork your changes and I will review your suggestions.
Or if you want to chat about my progress feel free to reach out!

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request


<!-- CONTACT -->
## Contact

Cassie - [@cassiedoescode](https://twitter.com/cassiedoescode)


<!-- ACKNOWLEDGEMENTS -->
## Acknowledgements
* [README Template](https://github.com/othneildrew/Best-README-Template)
