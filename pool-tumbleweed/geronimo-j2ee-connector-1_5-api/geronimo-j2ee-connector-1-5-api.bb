SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: J2EE Connector Architecture Specification"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-j2ee-connector-1_5-api-1.2-41.6.noarch.rpm"
RPM_HASH = "55f46877b378c91f849dd4a1f4143c5f6f1985e7039ed5ec0c741f45709498aa20fa30805a5409d58c3fbd46dd185aa9722130ca669397f19c3c394c78262645"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-j2ee-connector-1-5-api \
mvn-org.apache.geronimo.specs-geronimo-j2ee-connector-1.5-spec \
mvn-org.apache.geronimo.specs-geronimo-j2ee-connector-1.5-spec-pom-"

RDEPENDS:${PN} += "geronimo-jta-1-0-1B-api \
java-headless \
javapackages-filesystem"

inherit rpm
