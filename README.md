# carimus-challenge
A solution for the carimus coding challenge

#### Running the function
Start a REPL with `clj` or your preferred project management tool  
Then load the file with `(load-file "challenge.clj")` and switch to the namespace with `(use 'challenge.clj)`  
Call the function like  
`(stairClimb 10) => 89N`

**Explanation**  
Let P(n) denote the number of possible paths for a set of n steps. For any set of n steps, P(n) = P(n - 1) + P(n - 2), i.e. the Fibonacci Sequence

**Proof**  
Climbing either 1 or 2 steps at a time is equivalent to either skipping a step or not skipping a step. So for a set of steps with 2 steps, the possible paths are:  
1. Skip the first step (+2)
2. Don't skip the first step (+1, +1)  

Note that it is impossible to skip two steps in a row, which is equivalent to a step size of 3.  
For a set of n steps, consider the second to last step, n - 1. For every possible path, this step is either skipped or not skipped.  
In the case that it is not skipped, the number of paths that land on the n - 1 step are given by P(n - 1).  
In the case that it is skipped, the number of paths that land on the step before n - 1 are given by P(n - 2).  
Thus the total number of paths is the sum of P(n - 1) and P(n - 2).
