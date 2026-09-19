SUMMARY = "XML processor"
DESCRIPTION = "Woodstox is a validating namespace-aware StAX-compliant (JSR-173) XML \
processor written in Java. XML processor means that it handles both \
input (= parsing) and output (= writing, serialization)), as well as \
supporting tasks such as validation."
LICENSE = "Apache-2.0"

PV = "7.2.1"

RPM_NAME = "woodstox-core-7.2.1-3.2.noarch.rpm"
RPM_HASH = "c065f912db0bf8f4b0238a2fcec0186e4fec667f7cdc320c97793b6464a77c44ebb2ba157e3d7d21ac70557d47e0a0edaddb5e05a628bcbefc7a2ae71a70a28d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.fasterxml.woodstox-woodstox-core \
mvn-com.fasterxml.woodstox-woodstox-core-pom- \
mvn-org.codehaus.woodstox-woodstox-core-asl \
mvn-org.codehaus.woodstox-woodstox-core-asl-pom- \
mvn-org.codehaus.woodstox-woodstox-core-lgpl \
mvn-org.codehaus.woodstox-woodstox-core-lgpl-pom- \
osgi-com.fasterxml.woodstox.woodstox-core \
woodstox \
woodstox-core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.woodstox-stax2-api"

inherit rpm
