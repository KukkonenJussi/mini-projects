'''
A program that calculates the price of a taxi ride for a certain length of trip.
The price is determined as follows:
- The starting fee is 4.50 euros
- The basic fare is 0.70 euros per kilometer
- Based on the number of passengers, EUR 0.10 / person / km is added to the basic fare if there are 1 or 2 passengers.
If there are 3 or more passengers, the additional price is 0.07 euros / person / km.
- On weekends, an additional charge of 8% will be added to the base price (= here base price + passenger surcharge).
- A 10% discount is always given on the total price of the trip

Made by: Jussi Kukkonen
Date: 22.09.2021
'''
startingPrice = 4.5
pricePerKm = 0.7

kilometers = 0
while kilometers <= 0:    # If input given by user is smaller than zero
    kilometers = float(input("How many kilometers: "))    # Ask kilometers again

passengers = 0
while passengers <= 0:    # If input given by user is smaller than zero
    passengers = int(input("How many passengers: "))    # Ask how many passengers
    if passengers == 1 or passengers == 2:    # If there are only one or two passengers
        extraPrice = 0.1 * passengers + pricePerKm
    else:
        extraPrice = 0.07 * passengers + pricePerKm

weekend = 2
while weekend < 0 or weekend > 1:    # If weekend is not either zero or one
    weekend = int(input("Is it weekend? (1 = yes, 0 = no): "))
    if (weekend == 1):
        extraPrice *= 1.08    # Add multiplier of 0.08 to extra price. Otherwise there is no multiplier

subtotal = round(startingPrice + extraPrice * kilometers, 2)
total = str(round(((startingPrice + extraPrice * kilometers) * 0.9), 2))    # Total price (including the 10% discount) and rounding with two decimals

print("Receipt: " + 
"\n------------------" +
"\nStarting price: " + str(startingPrice) + "€" +
"\nPassengers: " + str(passengers) +
"\nKilometers: " + str(kilometers) +
"\nSubtotal: " + str(subtotal) + "€" +
"\nTotal: " + total + "€")