# Hotel_Reservation_App


In this project, I will be designing and implementing a Java hotel reservation application. The hotel reservation application will allow customers to find and book a hotel room based on room availability. This project will demonstrate the design of classes using OOP, organize and process data with collections, and use common Java types.

The main components for the  Hotel Reservation Application will consist of the following:

1. CLI for the User Interface. We'll use the Command Line Interface (or CLI for the user interface. For this, we'll need to have Java monitor the CLI for user input, so the user can enter commands to search for available rooms, book rooms, and so on.
2. The second main component is the Java code itself—this is where we add our business logic for the app.
3. Finally, we'll use Java collections for in-memory storage of the data we need for the app, such as the users' names, room availability, and so on.


Application Architecture
The app will be separated into the following layers:

1. User interface (UI), including a main menu for the users who want to book a room, and an admin menu for administrative functions.
2. Resources will act as our Application Programming Interface (API) to our UI.
3. Services will communicate with our resources, and each other, to build the business logic necessary to provide feedback to our UI.
4. Data models will be used to represent the domain that we're using within the system (e.g., rooms, reservations, and customers).
