# Restaurant Order Management System

## Overview
The Restaurant Order Management System is crafted to streamline the process of managing customer orders in a restaurant environment. Utilizing the Decorator design pattern, it provides a dynamic and flexible approach to customizing food items with additional toppings like cheese and bacon, without altering the underlying objects. This setup ensures that the system can adapt to various menu configurations, much like adapting a meal plan to different dietary needs or preferences.

## Contents
- **FoodItem Interface and Concrete Items**: Base framework for items on the menu, such as burgers and fries, each implementing a method to retrieve their price.
- **Topping Decorators**: Enhance base items with additional toppings, illustrating the flexibility of the system to cater to customer preferences.
- **Order Class and Loyalty Discount**: Manages the compilation and pricing of orders, including loyalty-based price adjustments.

This system not only enhances operational efficiency but also caters to a wide array of customer preferences, ensuring a flexible and responsive dining experience.
