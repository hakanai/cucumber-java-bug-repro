package com.example.bug

import assertk.assertThat
import assertk.assertions.isEqualTo
import io.cucumber.java8.En

class HtmlSafeStringStepdefs: En {
    var htmlSafeString: HtmlSafeString? = null

    init {
        ParameterType("html_safe_string", "html_safe\\({string}\\)") { string: String ->
            HtmlSafeString(string)
        }
        Given("an HTML-safe string {html_safe_string})") { string: HtmlSafeString ->
            htmlSafeString = string
        }
        Then("it converts to HTML {string}") { string: String ->
            assertThat(htmlSafeString).isEqualTo(string)
        }
    }
}