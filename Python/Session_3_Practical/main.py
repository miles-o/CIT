"""
This program will be used to perform unit conversions from kilojoules to calories, Celsius to Fahrenheit,
and from megabytes to gigabytes.

Created by: Miles O'Hara-Dewhurst
Created on: 5/8/2024
Last edited: 5/8/2024
"""

while True:
    print('=' * 21 + "\nConversion Categories\n" + '=' * 21 + "\n1. Energy\n2. Temperature\n3. Storage\nQ/q. Quit")
    menu_option = input("> ").casefold()
    match menu_option:
        case "1":
            print('=' * 21 + "\nEnergy conversion\n" + '=' * 21 + "\n1. Kilojoules to Calories\n2. Calories to "
                                                                  "Kilojoules\nQ/q. Back")
            conversion_option = input("> ").casefold()
            match conversion_option:
                case "1":
                    print("Converting Kilojoules to Calories")
                    kj = input("Enter Kilojoules> ")
                    try:
                        cal = float(kj) / 4.184
                        print(f"{kj} Kilojoules is {cal} Calories")
                    except ValueError:
                        print("Value not a number, please input a number")
                case "2":
                    print("Converting Calories to Kilojoules")
                    cal = input("Enter Calories> ")
                    try:
                        kj = float(cal) * 4.184
                        print(f"{cal} Calories is {kj} Kilojoules")
                    except ValueError:
                        print("Value not a number, please input a number")
                case "q":
                    continue
                case _:
                    print("Option invalid, returning to main menu.")
        case "2":
            print('=' * 21 + "\nTemperature Conversion\n" + '=' * 21 + "\n1. Celsius to Fahrenheit\n2. Fahrenheit to "
                                                                       "Celsius\nQ/q. Back")
            conversion_option = input("> ").casefold()
            match conversion_option:
                case "1":
                    print("Converting Celsius to Fahrenheit")
                    celsius = input("Enter Celsius> ")
                    try:
                        fahrenheit = (float(celsius) * (9/5)) + 32
                        print(f"{celsius} Celsius is {fahrenheit} Fahrenheit")
                    except ValueError:
                        print("Value not a number, please input a number")
                case "2":
                    print("Converting Fahrenheit to Celsius")
                    fahrenheit = input("Enter Fahrenheit> ")
                    try:
                        celsius = (float(fahrenheit) - 32) * (5/9)
                        print(f"{fahrenheit} Fahrenheit is {celsius} Celsius")
                    except ValueError:
                        print("Value not a number, please input a number")
                case "q":
                    continue
                case _:
                    print("Option invalid, returning to main menu.")
        case "3":
            print('=' * 21 + "\nStorage Conversion\n" + '=' * 21 + "\n1. Megabytes to Gigabytes\n2. Gigabytes to "
                                                                 "Megabytes\nQ/q. Back")
            conversion_option = input("> ").casefold()
            match conversion_option:
                case "1":
                    print("Converting Megabytes to Gigabytes")
                    megabytes = input("Enter Megabytes> ")
                    try:
                        gigabytes = float(megabytes)/1024
                        print(f"{megabytes} Megabytes is {gigabytes} Gigabytes")
                    except ValueError:
                        print("Value not a number, please input a number")
                case "2":
                    print("Converting Gigabytes to Megabytes")
                    gigabytes = input("Enter Gigabytes> ")
                    try:
                        megabytes = float(gigabytes) * 1024
                        print(f"{gigabytes} Gigabytes is {megabytes} Megabytes")
                    except ValueError:
                        print("Value not a number, please input a number")
                case "q":
                    continue
                case _:
                    print("Option invalid, returning to main menu")
        case "q":
            break
        case _:
            print("Option invalid")
