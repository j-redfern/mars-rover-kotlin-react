import csstype.*
import emotion.react.css
import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h1

val App = FC<Props> {
    div {
        div {

            div {
                css {
                    textAlign = TextAlign.center
                    color = NamedColor.pink
                    fontFamily = FontFamily.fantasy
                    fontWeight = FontWeight.bold
                    fontSize = 25.px
                }
                h1 {
                    +"Mars Rover"
                }
            }

            div {
                css {
                    position = Position.absolute
                    width = 100.pct
                    paddingTop = 12.px
                    paddingRight = 20.px
                    marginTop = 8.px
                    marginRight = 0.px
                }

            div {
                css {
                    float = Float.left
                    paddingLeft = 150.px
                }
                Robot()
            }

            div {
                Form {
                    formContents = initiateRobotContents
                }
            }
        }
        }
    }
}
