# Mars Rover

Building an interactive Mars Rover web application for self learning purposes. 
This is the FE part of the repository, which connects to the BE via REST API.

Idea of the application is to:

- enter the starting co-ordinates (X,Y) 
- enter facing direction (N.S.E.W) 
- enter the moving commands (F.B.L.R)
- display final position of the robot on the screen

| **Direction** | **Commands** |
|---------------|:-------------|
|N -> North     | F -> Forward |
|S -> South     | B -> Back    |
|E -> East      | L -> Left    |
|W -> West      | R -> Right   |

### Design Architecture
To follow.....

#### Endpoints:

### Tech stack involved

Yarn

Kotlin Js

React

Gradle

Kotlin Emotion

Kotest 

//? kotlinx-nodejs

### To run the application

`Yarn start`

### Local host

`http://localhost:8080/`

### Testing


### Learnings:

`--continous` argument for the gradle run command helps, however, the desired outcome is usually on the second browser refresh.

Had some problems with test frameworks. 

`React testing library` does not seem to support Kotlin/Js and `kotlin-react-wrapper` that suppose to be a wrapper to test react rendering doesn't seem to be compatible.

`kotest` have different test style, it is an interesting framework, but doesn't seem to support react component rendering.

`kotlin.test` seems mainly for junit testing.



