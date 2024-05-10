# Digital Clock Application in Java Swing

## Overview
<p align="justify">This project is a simple digital clock built using Java Swing. It displays the current time, day of the week, and date in a user-friendly interface. The clock updates every second to ensure accuracy.</p>

## Features
- **Current Time**: Displays time in hh:mm:ss AM/PM format.
- **Day of the Week**: Shows the current day.
- **Date**: Displays the date in "dd MMMMM, yyyy" format.
- **Responsive GUI**: The size of the window can be adjusted, and the contents scale accordingly.

## Requirements
- Java Development Kit (JDK) 1.8 or above.
- Any Java IDE like IntelliJ IDEA, Eclipse, or simple text editors for code edits.

## Running the Program
To run this digital clock application, follow these steps:

1. **Clone/Download the Code**
   - If you have git installed, clone this repository using:
     ```
     git clone [repository-url]
     ```
   - Alternatively, you can download the source code as a ZIP file and extract it.

2. **Compile the Java Program**
   - Navigate to the source code directory.
   - Compile the Java file using the following command:
     ```
     javac Clock.java
     ```

3. **Run the Compiled Java Program**
   - Run the compiled program using Java:
     ```
     java Clock
     ```

## Components Used
- `JFrame`: The main window where components of the clock are added.
- `FlowLayout`: Helps in arranging components in a left-aligned manner.
- `JLabel`: Used for displaying time, day, and date.
- `SimpleDateFormat`: For formatting the time, day, and date strings.
- `Calendar`: Used to get the real-time clock updates.
- `Font`: To customize the font style and size of the clock's display.

## Future Enhancements
- Implementing more features like alarms and timers.
- Adding support for different time zones.
- Improving the visual aesthetics with custom themes or colors.

## Conclusion
<p align="justify">This simple Java application serves as an excellent starting point for those looking to learn more about Java Swing and its capabilities in building GUI applications. It provides a practical example of how to use various Swing components effectively.</p>

