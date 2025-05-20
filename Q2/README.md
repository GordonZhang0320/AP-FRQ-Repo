## Question 2 Analysis
### Signature

This section contains my analysis of Question 2 (Class Design):

#### My initial approach during the exam:
- Construct the object by accepting the parameters
- Create getSignature method
  -if statment to check whether there is a first name or not
  -return the signature base on the value in the fName variable
- Create addSignature method
  -two if statment using indexOf to check if the signature is not in the parameter
  -return the output using substring if the if statment evaluates to false
  -return the output either using concatenation or just return the original parameter if the if statment evaluates to true
  
#### My revised solution after review:
- Construct the object by accepting the parameters
- Create getSignature method
  -if statment to check whether there is a first name or not
  -return the signature base on the value in the fName variable
- Create addSignature method
  -one if and one else if statment using indexOf to check if the signature exists in the parameter
  -return the output using substring if the if statment evaluates to true
  -return the output either using concatenation or just return the original parameter if the if statment evaluates to false
  
  
#### Key concepts tested in this question:
- Create and instantiate an object with proper declaration of the instance variables
- Calling and familiarizing string methods
- Use if statment to check the input and analyze what should be the output
  
#### What I learned from revisiting this problem:
- Sometime an if and else if statment can takes over the job for two if statment
  - While making sure that you return something inside the if statment
