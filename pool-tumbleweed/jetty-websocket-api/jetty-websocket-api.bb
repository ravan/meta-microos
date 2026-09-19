SUMMARY = "The websocket-api module for Jetty"
DESCRIPTION = "%{extdesc} The websocket-api module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.58"

RPM_NAME = "jetty-websocket-api-9.4.58-5.1.noarch.rpm"
RPM_HASH = "931b453f1830270bf2aeb2487160ff3922019a30370d1d0df3855f060c99313b8359d2ac9b703685e78a69aa1ad2b43e2ea5e927571844dccb134b62def8737f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-websocket-api \
mvn-org.eclipse.jetty.websocket-websocket-api \
mvn-org.eclipse.jetty.websocket-websocket-api-pom- \
osgi-org.eclipse.jetty.websocket.api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
