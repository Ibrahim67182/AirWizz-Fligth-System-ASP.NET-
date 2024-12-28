# AirWizz-Fligth-System-ASP.NET-
The ultimate flight management system website where you can manage flights bookings, track 100 real time flights , search flights , access admin panel to add new flight , update or delete flights and managing currency. Google Dialog Flow navigating chatbot is also used . You can also cancel your booking or download your booking ticket.


PROJECT INSTRUCTIONS :

1- firstly go to the program.cs and appsettings.json to change your server connection string


2- then in sql server management studio create data base and in package manager console run the command Update-Database to get tables 


3- you can also use your aviation stack api key and change it in /services/FlightTrackingService


4- for currencies you need to add them manually in database for the fisrt time and make sure to write each currency code in CurrencyConversions ENUM e.g PKR=3 , etc 


5- for admin access goto user and add user with email : admin@airwizz.com    pass: 123


6- once adding all currency now you can change values using admin panel


7- if you want to add flights data admin can add it or you can just use sql insertion script without deleting query to add random flights data (also change the date accordingly to current month)

-------------Enjoy-------------

