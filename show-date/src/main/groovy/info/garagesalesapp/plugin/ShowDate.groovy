package info.garagesalesapp.plugin

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class ShowDate extends DefaultTask {

    String dateMessage = 'PLUGIN show-date : Current date is '

    @TaskAction
    def showDatePluginMethod() {
        println "Called from show-date PLUGIN, this is @TaskAction def showDate()"
        println dateMessage + new Date()
        println ""
    }
}