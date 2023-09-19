# Car Care Application

## Introduction

- In this project, you will design and implement a non-trivial software system. You will practice the concepts you learned during the course.
- The project will consist of one phase, where all requirements must be designed and implemented in one submission.

## Project Logistics

- Team Size: 3-4 members.

## Project Overview

### Description

Apply the Object-Oriented concepts that you’ve learned (Abstraction, Encapsulation, SOLID principles, and Design Patterns, …etc.) to design a Car Care Application and implement it using the Java programming language. This application mainly manages providing various services, including car-cleaning as an obligatory service, plus the ability to maintain cars, change car oil, or change tires.

- Each vehicle shall be identified by a model name, unique identification number, car dimensions (width and length), Model year, and passenger types (could be regular-only, include-kids, include-elderly).
- Clean-in function that marks the arrival time of a vehicle if there is an available worker to provide the needed services. The application shall capture such time automatically from the system.
- During the Clean-in function, the application shall pick a worker to work on that car. There are two configurations for allocating workers to cars:
  1. First come first served, i.e., the clean-in function will allocate workers to cars based on the car’s arrival time if the car includes only regular passengers.
  2. Special-passengers-fit, i.e., the clean-in function will allocate workers to cars that include kids/elderly passengers first before cars that regular passengers, if various cars are in a waiting line.
- Clean-out function that would mark the end of the cleaning process.
- Calculate the cleaning fees during the clean-out function based on the car dimensions, where the car’s area in meters squared is multiplied by 20 EGP for each meter-squared.
- The admin can add services to the car care center and can add offers for doing specific services together as well (See the admin section below).
- Enrich your application with the capability to handle a set of exceptions that can happen during user interaction and through any other calculations. The displayed error message for exceptional behavior should be descriptive.
- The application has two main users: User and Admin.

### Requirements

#### User

1. The user can clean-in or clean-out his vehicle.
2. If all the workers are occupied, the user will be asked if he wants to subscribe to a waiting list. The system shall notify the user when a worker is available. This means that the system can handle multiple client requests at the same time.
3. The user can ask for any other service in the system. The available services will be discussed in the admin section.
4. The user can pay for any service in the system. The system should prompt the user to the payment form when the user asks to pay for any service. The default way is to pay via credit card. But the system should allow the user to pay cash.
5. When the user requests additional services, the payment calculation will differ based on the application as follows:
   - If the user asks to change oil, the calculation will be based on the selected oil type.
   - If the user asks to maintain the car, the calculation will be based on the accumulative prices of the service(s) applied to the car.
   - If the user asks to change tires, the calculation will be based on the number of changed tires and their sizes.
6. The user should be able to check any discount for any service in the system. Discounts could be added by the admin (this will be discussed later).

#### Admin

1. Calculate the total income as well as the total number of vehicles that used the Car Care application at any given point in time.
2. The admin should be able to enforce service packages. For example, if the user is maintaining his car, changing oil, and changing tires, he can take the package of Hyundai-maintenance, along with Shell-oil with Bridgestone tires specifically. Other packages can be added by the admin, including three services within the service package.
3. The admin should be able to add discounts to the system. There are two types of discounts.
   a. Membership discounts. For example, the user should have a 10% discount if they are subscribed members of that Car care application.
   b. Promocode discount. For example, the admin can apply a 15% discount for customers who have valid promocodes.
   c. Combined discounts from both membership and promocodes can be applied on the overall fees that the user can pay for any given service. All overall discounts and specific discounts for this service should apply.
4. The admin should be able to list all user used services. The used services types are:
   a. Car Cleaning Service.
   b. Changing oil.
   c. Changing tires.
   d. Car Maintenance Service.
