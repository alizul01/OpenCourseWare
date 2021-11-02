# Problem Set 1A - House Hunting

# Take user input
annual_salary = int(input("Enter your annual salary: "))
portion_saved = float(input("Enter the percent of your salary to save, as a decimal : "))
total_cost = int(input("Enter the cost of your dream home: "))

# Variables
counter = 0
current_savings = 0
r = 0.04 # Annual Rate Assume
portion_down_payment = 0.25 * total_cost
monthly_salary = annual_salary/12
portion_saved *= monthly_salary
# Algorithm
while current_savings < portion_down_payment:
    counter += 1
    invest = (current_savings * r)/12 + portion_saved
    current_savings += invest

# Output
print(counter)