**🌦️ Weather Forecast App**

A simple and efficient Weather Forecast Application built using Java Spring Boot for the backend and HTML, CSS, JavaScript for the frontend.
The application displays current weather details and upto 3-day weather forecast for a selected city using an external Weather API.

**🚀 Features**

🔍 Search weather by city name

🌡️ Displays current temperature and weather condition

📅 Provides up to 3-day forecast with max & min temperatures

🔄 Real-time data fetching via REST APIs

🌐 Backend–frontend separation for clean architecture

**🛠️ Tech Stack**

**Backend**

Java

Spring Boot

RESTful APIs

Maven

**Frontend**

HTML

CSS

JavaScript

**📂 Project Structure**

```Weather-App
├── .mvn
│   └── wrapper
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── cfs
│   │   │           └── Weather_App
│   │   │               ├── Controller
│   │   │               │   └── WeatherController.java
│   │   │               ├── service
│   │   │               │   └── WeatherService.java
│   │   │               ├── dto
│   │   │               │   └── datatransferpackage
│   │   │               │       ├── WeatherResponse.java
│   │   │               │       ├── ForecastResponse.java
│   │   │               │       └── DayWeather.java
│   │   │               └── WeatherAppApplication.java
│   │   └── resources
│   │       └── application.properties
│   └── test
│       └── java
│           └── com
│               └── cfs
│                   └── Weather_App
├── .gitattributes
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md 
```


**⚙️ How It Works**

**1.** The frontend sends a request with the city name.

**2.** Spring Boot backend handles the request using REST controllers.

**3.** Backend fetches data from the external Weather API.

**4.** Processed weather data is returned to the frontend.

**5.** UI displays current weather and maximum of 3-day forecast.

**External Service**

Weather API (for live and forecast data)

**⭐ If you like this project, consider giving it a star on GitHub!**
