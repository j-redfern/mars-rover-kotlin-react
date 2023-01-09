data class FormContents(
    val title: String,
    val placeholder: String,
    val id: String
)

val initiateRobotContents = listOf(
    FormContents("Enter size of plateau ", "For example min,max -> 0,10 ", "plateau"),
    FormContents("Enter starting point co-ordinates ", "For example x,y -> 0,0 ", "start-point"),
    FormContents("Enter a facing direction ", "For example N,S,E or W (North, South, East, West)", "direction"),
    FormContents("Enter a list of moving commands ", "For example F,B,L,R (forward, back, left, right) ", "commands"),
)