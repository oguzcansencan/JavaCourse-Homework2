Oguzcan Sencan (7216782) - Master Digital Transformation


# Java Course - Homework 2

    - Development Environment: Eclipse IDE (Java SE 16)

- Car Class is created which contains the following attributes:
    
        - Id (int)
        - brand (String)
        - model (String)
        - year (int)
        - color (String)
        - price (int)
        - registration_number (String)

- Then all the Getters and Setters are created for each of the attributes above.

- Then Test Class is created which has the methods below:

        - getCarsByBrand(Car[] arr, String brand)
        - getCarsByModelAndAge(Car[] arr, String model, int age)
        - getCarsByYearAndPrice(Car[] arr, int year, int price)
   
The three methods above are created to select cars depending on the specific attributes.

        - printCars(List<Car> list)     
        - exportToTXT(String filename, List<Car> list) 

The last two methods above are created to display the filtered lists.

Cars are created by random values and the four TXT files can be found in the project
        
        all_cars.txt
        cars_filtered_by_brand_(Porsche).txt
        cars_filtered_by_model_(Sedan)_and_age_(5).txt
        cars_filtered_by_year_(2014)_and_price_(220000).txt
