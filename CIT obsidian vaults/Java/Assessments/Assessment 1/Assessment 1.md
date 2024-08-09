This assessment is a work simulation task.

Distributed Services has hired you to create a program for its client, a local rescue shelter. The shelter needs a program to help it manage the animals it cares for. The system will focus on dogs for now but could be expanded to cover more animals later.

Your supervisor has already gone through the requirements-gathering phase.
## Program Specifications

1.       Depending on the developer's preference, the system can be either a GUI or a CLI.
2.       The system needs to track all the animals the shelter cares for and the vets who can work with them.
3.       All Vets recorded in the system must have the following attributes:
	1. The vet’s name,
	2. The name of the organisation the vet works for,
	3. A phone number,
4.       The Vet class will need **two constructors**. One constructor will set the name of the organisation the vet works for (used for vets partnered with the shelter), while the other will leave the organisation name blank (used for vets employed by the shelter).
5.       The system should have a function that prepares the data used by the system. This function should accept an ArrayList of Vet objects and an ArrayList of Animal objects. The system should automatically read the data for each vet from a text file called vets.txt. The shelter will also use this function to create the Animals being sheltered manually.
6.       All Animals recorded in the system must have the following attributes:
	1. An ID (a string),
	2. A name,
	3. An age (a number),
	4. A gender (a string),
	5. Their family (eg: Cat, Dog, Bird),
7.       Dogs are a type of Animal that must have the following **additional** attributes:
	1. Their vet (will be an instance of the Vet class)
	2. If they’re desexed yet (either true or false),
	3. If they have been cat-friendly (either true or false),
	4. Care fees (in dollars and cents).
8. All animals should have a function called reportDetails that writes the following information on the screen:
```
{**name**} (ID: {**ID**}) is a {**gender**} {**family**}.
**For example:** Felicity (ID: C12) is a female cat.
```
9.       reportDetails for **Dogs** should be overloaded to write the following information on the screen:
```
{**name**} (microchip: {**ID**}) is a {**gender**} dog.
**For example:** Rex (microchip: 000000000000099) is a male dog.
```
This assessment is a work simulation task.

Distributed Services has hired you to create a program for its client, a local rescue shelter. The shelter needs a program to help it manage the animals it cares for. The system will focus on dogs for now but could be expanded to cover more animals later.

Your supervisor has already gone through the requirements-gathering phase.
10.   The shelter should be able to change the ID for any animal. This should be written as a function.
11.   The shelter should be able to change the dog’s vet and their care fees. This should be written as a function.
12.   The shelter should be able to add vets that they employ/partner with to the system. This should be written as a function.
13.   The shelter should be able to remove vets that it no longer employs or partners with from the system. This should be written as a function.
14.   The shelter needs to see the following reports on their screens. All reports should be written with different functions.
a.       A list of all animals being sheltered. This list should call the reportDetails function for each animal.
b.       A list of all dogs whose care fees exceed $110.
c.       A count of how many sheltered dogs are cat-friendly.
d.       A list of vets and their contact details for vets employed by the shelter.
15.   The shelter should be able to save vet details to the same file from which the vets are read. This should be written as a function.
## Task 1

You must review the program specifications and email your client at least one question that will help you better understand the program's requirements.

Please complete the email template below. Remember, you are communicating with a client, so you should be clear, and your language and tone should be respectful. You should also communicate as plainly as possible just in case the client doesn’t have the same knowledge of IT that you do.

The program specifications must not already address your question. For example, you cannot ask the client if they want a count of cat-friendly dogs (they’ve already communicated that they do), but you could ask how that count is presented to them.


| **To**                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        | Client @ Rescue Shelter                              |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------- |
| **From**                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      | **Enter First and Last Name** @ Distributed Services |
| **Subject**                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   | Program Requirement Review                           |
| To whom it may concern,<br><br>Replace this text with your question.<br><br>---<br><br>Enter First and Last Name<br><br>Developer<br><br>ICT Operations \| Software Development Branch<br><br>Distributed Services<br><br>In the spirit of reconciliation, Distributed Services acknowledges the traditional custodians of country throughout Australia and their connections to land, sea and community. We pay our respects to their Elders past, present, and emerging.<br><br>Please consider the environment before printing this email. |                                                      |

## Task 2

You will create class diagrams for an application that could meet the client’s requirements. Your diagrams should follow Distributed Services coding standards on naming conventions and encapsulation. Your attributes, methods, and parameters should have a **datatype**.  You should use the correct notation to connect each class.