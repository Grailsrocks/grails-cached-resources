class CachedResourcesGrailsPlugin {
    def version = "1.0"

    def grailsVersion = "1.2 > *"
    // the other plugins this plugin depends on
    def dependsOn = [resources:'1.0.RC3 > *', cacheHeaders:'1.0.4 > *']
    def loadAfter = ['resources']
    
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
            "grails-app/views/error.gsp",
            "web-app/css/**/*.*",
            "web-app/js/**/*.*"
    ]

    def author = "Marc Palmer"
    def authorEmail = "marc@grailsrocks.com"
    def title = "Cached Resources"
    def description = '''\\
Makes static resources browser-cacheable with unique filenames based on their content
'''

    def documentation = "http://grails.org/plugin/cached-resources"

    def doWithWebDescriptor = { xml ->
    }

    def doWithSpring = {
    }

    def doWithDynamicMethods = { ctx ->
    }
    
    def doWithApplicationContext = { applicationContext ->
    }

    def onChange = { event ->
    }

    def onConfigChange = { event ->
    }
}
