# Problem set 1c - Finding the right amount to save away
# Made by : Alizul

"""
In Part B, you had a chance to explore how both the percentage of your salary that you save each month and your annual raise affect how long it takes you to save for a down payment.  This is nice, butsuppose you want to set a particular goal, e.g. to be able to afford the down payment in three years.How much should you save each month to achieve this?  In this problem, you are going to write a program to answer that question.  To simplify things, assume:3
1.Your semi­annual raise is .07 (7%)
2.Your investments have an annual return of 0.04 (4%)
3.The down payment is 0.25 (25%) of the cost of the house 
4.The cost of the house that you are saving for is $1M.

You are now going to try to find the best rate of savings to 
achieve a down payment on a $1M house in 36 months. 
Since hitting this exactly is a challenge, we simply want your 
savings to be within $100 of the required down payment. 

You should use ​bisection search​ to help you do this efficiently. 
You should keep track of the number of steps it takes your 
bisections search to finish. 
You should be able to reuse some of the code you wrotefor part B in this problem.  
"""

# Take user input
annual_salary = float(input("Enter your annual salary: "))
portion_saved = float(input("Enter the percent of your salary to save, as a decimal : "))
total_cost = 1000000
semi_annual_raise = .07

# Variables
month = 0
current_savings = 0
r = 0.04 # Annual Rate Assume
portion_down_payment = 0.25 * total_cost
monthly_salary = annual_salary/12


# Algorithm
while current_savings <= portion_down_payment:
    current_savings += (current_savings * r/12) + (portion_saved * (annual_salary/12))
    month += 1

    if month % 6 == 0:
          annual_salary = annual_salary + (semi_annual_raise * annual_salary)
   

# Output
print(month)