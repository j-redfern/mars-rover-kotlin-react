import csstype.*
import emotion.react.css
import react.FC
import react.Props
import react.dom.html.InputType
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.form
import react.dom.html.ReactHTML.input
import react.dom.html.ReactHTML.label

val InitiateRobotForm = FC<Props> {
            form {
                div {
                    css {
                        textAlign = TextAlign.left
                        paddingTop = 150.px
                    }

                    div {
                        label {
                            +"Enter starting point co-ordinates "
                        }
                        input {
                            css {
                                width = 60.pct
                                marginBottom = 30.px
                            }

                            type = InputType.text
                            id = "coordinates"
                            name = "coordinates"
                            placeholder = "For example x,y... "
                        }
                    }

                    div {
                        label {
                            +"Enter moving commands"
                        }
                        input {
                            css {
                                width = 60.pct
                            }

                            type = InputType.text
                            id = "direction"
                            name = "direction"
                            placeholder = "For example F,B,L,R (forward, back, left, right)"
                        }

                        input {
                            css {
                                backgroundColor = NamedColor.pink
                                color = NamedColor.white
                                marginTop = 5.px
                                marginBottom = 15.px
                            }
                            type = InputType.submit
                            value = "submit..."
                        }
                    }

                    div {
                        label {
                            +"Robot position:"
                        }

                    }
                }
            }
        }
