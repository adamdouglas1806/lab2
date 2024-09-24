# F27SA Software Development 1 Lab 2


In this week's lab, we want to build a small application based on last week's lectures to practice some programming skills.
We want to create a health application that calculates the user's BMI (Body Mass Index).

## Program Description
An individual's Body Mass Index (BMI) measures a person's weight relative to their height. It is calculated as follows.
- Divide a person's weight (in kg) by the square of their height (in meters)

## Required Specification:
Design and implement a program with the below specifications:
1.	Allow the user to enter their weight in KG and height in meters.
2.	Calculate the BMI and print out the result. 
3.	Reports on whether the BMI is in a healthy range or if it indicates the person is underweight or overweight, using the following table:

|BMI|Classification|
|---|----------------|
|<18.5| Underweight|
|18.5—24.9|Healthy|
|>24.9|Overweight|

4.	Display the weight and height in the imperial format using the below conversation rate:
    - 1 kg is 2.2 pounds (70 kg  = 154 lbs)
    - 1 m is 3.28 feet (1.7 m =   5.577 feet)
	
### Optional Specification:

5.	Ask the user which unit system they want to enter (Imperial or metric (i/m)). If the user selects imperial, then convert the data into metric, then display the result.

```
Sample Output:
Welcome to the HW-BMI calculator
============================
Please enter your height(m)> 1.7
Please enter your weight(kg)> 70
Your BMI is -> 24.221453287197235
Your height in (meter) 1.7
Your weight in (kilograms) 70.0
Your height in (feet) 5.576
Your weight in (pound) 154.0
You are Healthy!



Sample Output with optional specifications:
Welcome to the HW-BMI calculator
============================
What system of units do you want to use? metric or imperial (m/i) > m
Please enter your height(m)> 1.7
Please enter your weight(kg)> 70
Your BMI is -> 24.221453287197235
Your height in (meter) 1.7
Your weight in (kilograms) 70.0
Your height in (feet) 5.576
Your weight in (pound) 154.0
You are Healthy!

Welcome to the HW-BMI calculator
============================
What system of units do you want to use? metric or imperial (m/i) > i
Please enter your height(feet)> 5.57
Please enter your weight(pound)> 154
Your BMI is -> 24.273664056934905
Your height in (meter) 1.6981707317073174
Your weight in (kilograms) 70.0
Your height in (feet) 5.57
Your weight in (pound) 154.0
You are Healthy!

```