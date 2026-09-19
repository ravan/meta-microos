SUMMARY = "Jetty ALPN API"
DESCRIPTION = "Jetty API for Application-Layer Protocol Negotiation."
LICENSE = "Apache-2.0 & EPL-1.0"

PV = "1.1.3.v20160715"

RPM_NAME = "jetty-alpn-api-1.1.3.v20160715-1.9.noarch.rpm"
RPM_HASH = "6efa06bd40d09d3824b46fc9ca5fc96d151402c0428a502b1079dddccd4a51f35dd7d73099f0a2962f3886912c33af875c743874b53c4afd712c3d4b065f301e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-alpn-api \
mvn-org.eclipse.jetty.alpn-alpn-api \
mvn-org.eclipse.jetty.alpn-alpn-api-pom- \
osgi-org.eclipse.jetty.alpn.api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
