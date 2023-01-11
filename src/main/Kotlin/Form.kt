import csstype.*
import emotion.react.css
import react.*
import react.dom.html.InputType
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.form
import react.dom.html.ReactHTML.h2
import react.dom.html.ReactHTML.input
import react.dom.html.ReactHTML.label

external interface FormContentsProps : Props {
    var formContents: List<FormContents>
}

val Form = FC<FormContentsProps> { props ->
        form {
            for (content in props.formContents) {
                    css {
                        textAlign = TextAlign.left
                        paddingTop = 50.px
                        fontFamily = FontFamily.monospace

                    }
                    div {
                        css {
                            marginTop = 30.px
                            fontSize = 14.px
                        }
                        label {
                            +"${content.title}"
                        }

                        input {
                            css {
                                width = 60.pct
                                fontStyle = FontStyle.italic
                                fontSize = 10.px
                            }
                            type = InputType.text
                            id = "${content.id}"
                            name = "${content.id}"
                            placeholder = "${content.placeholder}"
                        }

                        if (content.id === "commands") {
                            div {
                                input {
                                    css {
                                        backgroundColor = NamedColor.pink
                                        color = NamedColor.white
                                        marginBottom = 15.px
                                        marginTop = 5.px
                                    }
                                    type = InputType.submit
                                    value = "Submit"
                                }
                            }

                        }
                    }
                }
            div {
                css {
                    color = NamedColor.cornflowerblue
                    fontFamily = FontFamily.fantasy
                    fontWeight = FontWeight.bold
                }
                h2 {
                    +"getRobot position:"
                }
            }
        }
}
