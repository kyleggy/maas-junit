package com.github.kyleggy.maasjunit.services

import com.github.kyleggy.maasjunit.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
