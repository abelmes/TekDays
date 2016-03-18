package com.tekdays



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(TekEvent)
class TekEventTests {

    void "test toString"() {
        when: "a tekEvent has a name and a city"
        def tekEvent = new TekEvent(name:'Groovy One',
                city: 'San Francisco',
                organizer: 'John Doe')
        then: "the toString method will combine them."
        tekEvent.toString() == 'Groovy One, San Francisco'
    }
}
