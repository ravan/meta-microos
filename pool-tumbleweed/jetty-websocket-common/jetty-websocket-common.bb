SUMMARY = "The websocket-common module for Jetty"
DESCRIPTION = "%{extdesc} The websocket-common module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.58"

RPM_NAME = "jetty-websocket-common-9.4.58-5.1.noarch.rpm"
RPM_HASH = "86c774e1f235c4f253fdc533dbbbb09dcaf7f852be038515f8d88fc8f02589f22159576cf05bd4e310bd2331ef4efc2df644b3c352205d829f387cf8b6a44105"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-websocket-common \
mvn-org.eclipse.jetty.websocket-websocket-common \
mvn-org.eclipse.jetty.websocket-websocket-common-pom- \
osgi-org.eclipse.jetty.websocket.common"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.eclipse.jetty-jetty-io \
mvn-org.eclipse.jetty-jetty-util \
mvn-org.eclipse.jetty.websocket-websocket-api"

inherit rpm
