## Tax Calculation System for Individual Entrepreneurs

Welcome to the Tax Calculation System for Individual Entrepreneurs project! This system provides a flexible and extensible way to calculate taxes for individual entrepreneurs based on different patterns and status.

### Project Overview

The project implements several design patterns to calculate taxes for individual entrepreneurs. The main patterns used in this project are:

1. **Pattern Strategy**: This pattern allows us to define different tax calculation strategies for individual entrepreneurs. In our system, we have defined three types of taxes:
   - Mandatory pension contributions - 10% (Maximum: 350,000 tenge, Minimum: none)
   - Contributions to compulsory social health insurance - 2% (Maximum: 4,900 tenge, Minimum: none)
   - Social contributions - 3.5% (Maximum: 17,150 tenge, Minimum: 2,450 tenge)

2. **Pattern Decorator**: We have introduced four types of people status, and each of these status types can have their own tax calculation strategy:
   - Pensioner: Does not pay any tax.
   - Disabled person: Pays only Social contributions - 3.5% (Maximum: 17,150 tenge, Minimum: 2,450 tenge).
   - Mother of many children: Pays Mandatory pension contributions - 10% (Maximum: 350,000 tenge, Minimum: none) and Social contributions - 3.5% (Maximum: 17,150 tenge, Minimum: 2,450 tenge).
   - Ordinary entrepreneur: Pays Mandatory pension contributions - 10% (Maximum: 350,000 tenge, Minimum: none), Contributions for compulsory social health insurance - 2% (Maximum: 4,900 tenge, Minimum: none), and Social contributions - 3.5% (Maximum: 17,150 tenge, Minimum: 2,450 tenge).

3. **Pattern Adapter**: Taxes may change every year. In our project, we took last year's tax rates for entrepreneurs and calculated last year's tax. This pattern helps to adapt to changes in the tax calculation rules easily.

4. **Pattern Observer**: To notify a tax change, each person's status has subscribed to the notification. This ensures that when tax rules change, the affected individuals are notified and can update their tax calculations accordingly.

5. **Singleton Pattern**: We used a Singleton pattern for the user's application, ensuring there is only one instance of the application throughout its lifecycle.

6. **Factory Method Pattern**: In order to simplify the creation of taxes, we use the factory method pattern to create different tax objects based on the user's status.

### Usage

To use this tax calculation system, follow these steps:

1. Set up the project in your development environment.

2. Create an instance of the user's application using the Singleton pattern.

3. Define the user's status (Pensioner, Disabled person, Mother of many children, or Ordinary entrepreneur).

4. Create an instance of the corresponding tax object using the Factory Method pattern.

5. Subscribe to tax change notifications if necessary using the Observer pattern.

6. Calculate taxes based on the chosen pattern and status.

7. Handle tax changes using the Adapter pattern for future years.

### Reference 
https://mybuh.kz/useful/calc_uproshenka/
