# DistributedSystemPlayground

## Contents
1. All projects are managed by maven, see ```provision.sh``` for setup
2. ```helloworld``` and ```pingpong``` are from the [Kompics tutorial page](http://kompics.sics.se/current/introduction/helloworld.html)
3. ```helloworld-enhanced``` is from [the video lecture](
https://www.youtube.com/watch?v=_E18mTGeCUY&list=PL700757A5D4B3F368&index=2)

## Notes
### Lecture 1
1. Distributed System: A set of nodes, connected by network, which appear to its users as a single coherent system
2. Challanges
    * Partial Failure
    * Cocurrency
3. Core Problems:
    * Consensus Problem
    * Atomic Braodcast Problem
  * Note: They are logically equivalent
4. Models:
    * **Asynchronous System**
      * Consensus not solvable
    * **Synchronous System**
      * Consensus solvable up to N-1 crashes
    * **Partial Synchronous System**
      * Consensus solvable up to N/2 crashes
    * Consensus Problem and Atomic Broadcast Problem are solvable with Failure Detector. 
5. Failures:
      * node crashes/stops
      * byzantine problem
      * self-stablizing algorithm
6. Self-stablizing algorithm
      * States: Illegitimate, Legitimate
      * Property: 
        * Convergence (Illegit -> Legit) 
        * Closure (Legit -> Legit)



