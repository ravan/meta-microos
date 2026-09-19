SUMMARY = "The javax-websocket-server-impl module for Jetty"
DESCRIPTION = "%{extdesc} The javax-websocket-server-impl module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.58"

RPM_NAME = "jetty-javax-websocket-server-impl-9.4.58-5.1.noarch.rpm"
RPM_HASH = "6549d76c6437b53e24a1deab811fafa99977a2db43c777d5caa6fe86c99e30d9b443b83ae09d9998aaba158508d9d33c5cc1cbd51c6a937368e356a8ec569ea1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-javax-websocket-server-impl \
mvn-org.eclipse.jetty.websocket-javax-websocket-server-impl \
mvn-org.eclipse.jetty.websocket-javax-websocket-server-impl-pom- \
osgi-org.eclipse.jetty.websocket.javax.websocket.server"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.websocket-javax.websocket-api \
mvn-org.eclipse.jetty-jetty-annotations \
mvn-org.eclipse.jetty.websocket-javax-websocket-client-impl \
mvn-org.eclipse.jetty.websocket-websocket-server"

inherit rpm
