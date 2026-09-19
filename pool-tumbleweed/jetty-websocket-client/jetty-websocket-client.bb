SUMMARY = "The The websocket-client module for Jetty"
DESCRIPTION = "%{extdesc} The The websocket-client module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.58"

RPM_NAME = "jetty-websocket-client-9.4.58-5.1.noarch.rpm"
RPM_HASH = "975f2b5da7eabc4ac24d5a38c45af8ce505b606cb52018b833f357a3e74b2656ac19c1913dbad67e594778e5420b30ad54e2ef802e8f776a398a319800ff1376"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-websocket-client \
mvn-org.eclipse.jetty.websocket-websocket-client \
mvn-org.eclipse.jetty.websocket-websocket-client-pom- \
osgi-org.eclipse.jetty.websocket.client"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.eclipse.jetty-jetty-client \
mvn-org.eclipse.jetty-jetty-io \
mvn-org.eclipse.jetty-jetty-util \
mvn-org.eclipse.jetty.websocket-websocket-common"

inherit rpm
