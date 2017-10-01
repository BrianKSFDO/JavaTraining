package info.garagesalesapp.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created
 */
class ShowDatePlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.task('showDatePluginMethod', type: ShowDate)
    }
}

