SUMMARY = "The websocket-servlet module for Jetty"
DESCRIPTION = "%{extdesc} The websocket-servlet module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.58"

RPM_NAME = "jetty-websocket-servlet-9.4.58-5.1.noarch.rpm"
RPM_HASH = "8a1707b003f94fb0fcfc2e33d40b75c930291f11ed4723181aa1cc899ff75f12921569a92fa15b82757beed8a081cec35428872ababeca05501d04d2948423b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-websocket-servlet \
mvn-org.eclipse.jetty.websocket-websocket-servlet \
mvn-org.eclipse.jetty.websocket-websocket-servlet-pom- \
osgi-org.eclipse.jetty.websocket.servlet"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.servlet-javax.servlet-api \
mvn-org.eclipse.jetty.websocket-websocket-api"

inherit rpm
