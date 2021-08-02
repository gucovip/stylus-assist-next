package com.github.gucovip.stylusassistnext.services

import com.github.gucovip.stylusassistnext.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
