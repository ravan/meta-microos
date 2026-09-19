SUMMARY = "The javax-websocket-client-impl module for Jetty"
DESCRIPTION = "%{extdesc} The javax-websocket-client-impl module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.58"

RPM_NAME = "jetty-javax-websocket-client-impl-9.4.58-5.1.noarch.rpm"
RPM_HASH = "140cfe0d06117ccd8b8c8ddf7654895ba8c4d7cf6b24aa4da8f38eff260c4bb43024ec50c9e64708c8b6615a282b5087f697acaca6f13294cb93d2c77f6b4621"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-javax-websocket-client-impl \
mvn-org.eclipse.jetty.websocket-javax-websocket-client-impl \
mvn-org.eclipse.jetty.websocket-javax-websocket-client-impl-pom- \
osgi-org.eclipse.jetty.websocket.javax.websocket"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.websocket-javax.websocket-client-api \
mvn-org.eclipse.jetty.websocket-websocket-client"

inherit rpm
