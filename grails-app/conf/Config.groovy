
// The following properties have been added by the Upgrade process...
grails.views.default.codec="none" // none, html, base64
grails.views.gsp.encoding="UTF-8"


log4j = {
    root {
        info 'stdout'
    }
    
    error  'org.codehaus.groovy.grails.web.servlet',  //  controllers
	       'org.codehaus.groovy.grails.web.pages' //  GSP
    info   'grails.app'

    debug   'grails.app.controller',
            'grails.app.service',
            'grails.app.task',
            'grails.app.domain',
            'org.grails.plugin.resource'
    
}

grails.resources.adhoc.patterns = ["/images/*", "*.css", "*.js"].asImmutable()
grails.cached.resources.flatten = false
grails.cached.resources.shortlinks = false

environments {
    development {
        grails.serverURL = "http://localhost:8080/CachedResources"
    }
}
