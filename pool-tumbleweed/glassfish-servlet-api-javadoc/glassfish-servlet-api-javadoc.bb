SUMMARY = "Javadoc for glassfish-servlet-api"
DESCRIPTION = "API documentation for glassfish-servlet-api."
LICENSE = "Apache-2.0 & (CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0)"

PV = "4.0.1"

RPM_NAME = "glassfish-servlet-api-javadoc-4.0.1-1.7.noarch.rpm"
RPM_HASH = "e54f14b96f46067050e5cb2b5a500f2a3aa187bf7e768ba2f8dea43307d0953aa085b6a10ea3309725831e87dd0dfd67bf7674697997c78ef543fde695f68aa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-servlet-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
