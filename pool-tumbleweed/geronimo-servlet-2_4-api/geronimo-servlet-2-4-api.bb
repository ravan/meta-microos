SUMMARY = "Geronimo Servlet 2.4 Specification"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: J2EE Servlet v2.4 API"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-servlet-2_4-api-1.2-41.6.noarch.rpm"
RPM_HASH = "d51e4682933fbad3dffd32cd47ff69a0a56907dd5d93a1669693e10825835b8f9afc57e4256d73d106bed9653fb4f2410c4d832352532a78661e11540910232a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-servlet-2-4-api \
mvn-org.apache.geronimo.specs-geronimo-servlet-2.4-spec \
mvn-org.apache.geronimo.specs-geronimo-servlet-2.4-spec-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
