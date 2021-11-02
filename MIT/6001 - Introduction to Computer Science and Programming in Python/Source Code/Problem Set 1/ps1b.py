# Problem set 1B - Saving, with a raise
# Made by : Alizul

"""
1. The starting annual salary (annual_salary)
2. The percentage of salary to be saved (portion_saved)
3. The cost of your dream home (total_cost)
4. The semi­annual salary raise (semi_annual_raise)
"""

# Take user input
annual_salary = float(input("Enter your annual salary: "))
portion_saved = float(input("Enter the percent of your salary to save, as a decimal : "))
total_cost = float(input("Enter the cost of your dream home: "))
semi_annual_raise = float(input("Enter the semi­ annual raise, as a decimal: "))

# Variables
month = 0
current_savings = 0
r = 0.04 # Annual Rate Assume
portion_down_payment = 0.25 * total_cost
monthly_salary = annual_salary/12


# Algorithm
while current_savings < portion_down_payment:
    current_savings += (current_savings * r/12) + (portion_saved * (annual_salary/12))
    month += 1

    if month % 6 == 0:
          annual_salary = annual_salary + (semi_annual_raise * annual_salary)
   

# Output
print(month)