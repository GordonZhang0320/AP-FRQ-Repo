## Question 4 Analysis
### puzzel game

This section contains my analysis of Question 4 (2D Arrays):

#### My initial approach during the exam:
#### Part 1
- Initialize the 2D array using a nested for loop

#### Part 2
- Use a nested for loop to check the condition
  - Starting at the row (r) given but col (c) at 0
-Use one if statments to check whether the r and c is pointing at the row and col given.
  - If so then skip to the next one because we do not want the element to pair with itself
-Use another if statments if the object checking is either equal to or add up to 10 with the element at row and col
  - If so then set both of them to zero
  
#### My revised solution after review:
#### Part 1
- Initialize the 2D array using a nested for loop

#### Part 2
- Use a nested for loop to check the condition
  - Starting at the row (r) given but col (c) at 0
-Use one if statments to check whether the r and c is pointing at the row and col given.
  - If so then skip to the next one because we do not want the element to pair with itself
-Use two nested if statments inside the first one check if two element add up to 10 or equal to each other.
  - If either of those two conditions is met set the two elements to 0
  - return true inside the if statments
 
#### Key concepts tested in this question:
- Using random method to correctly initialize the variables
- Using for loop to loop through the elements in a 2D arrays
- Setting and grabbing the element from a 2D array
  
#### What I learned from revisiting this problem:
- There is some cases that are not specifically mentioned in the passage in the question
  - Ex: You can not pair the element with itself
- Check through every test cases they provided in the question, because every case shows you what supposed to include in your program
