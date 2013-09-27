A simple example of using feature toggles in JSP with Togglz. See http://blog.florian-hopf.de/2013/09/feature-toggles-in-jsp-with-togglz.html for the companion blogpost.

The application can be started using gradle jettyRun. The features are configured in /tmp/features.properties which might look like this:

    TEXT=true
    MORE_TEXT=false

