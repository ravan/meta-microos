SUMMARY = "The websocket-server module for Jetty"
DESCRIPTION = "%{extdesc} The websocket-server module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.58"

RPM_NAME = "jetty-websocket-server-9.4.58-5.1.noarch.rpm"
RPM_HASH = "3e8ef17e98cceb39f2fed3841f568589d587d2c2209869897fd9784cf6f49b3bf72cfd7d0d188d63a228082b527528df3b8f235f1314ec00967714807fcffdac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-websocket-server \
mvn-org.eclipse.jetty.websocket-websocket-server \
mvn-org.eclipse.jetty.websocket-websocket-server-pom- \
osgi-org.eclipse.jetty.websocket.server"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.eclipse.jetty-jetty-http \
mvn-org.eclipse.jetty-jetty-servlet \
mvn-org.eclipse.jetty.websocket-websocket-client \
mvn-org.eclipse.jetty.websocket-websocket-common \
mvn-org.eclipse.jetty.websocket-websocket-servlet"

inherit rpm
