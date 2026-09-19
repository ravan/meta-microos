SUMMARY = "Geronimo JTA 1.0.1B Specification"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: Java Transaction API Specification"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-jta-1_0_1B-api-1.2-41.6.noarch.rpm"
RPM_HASH = "97312c731077f6730106c0dd61376e88622898c59d2857cea96d3510c660502b9df19d53a46fc9b6c96359826e3b5f1d7e1611164ae246ec482d51be3c12fe9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-jta-1-0-1B-api \
mvn-org.apache.geronimo.specs-geronimo-jta-1.0.1B-spec \
mvn-org.apache.geronimo.specs-geronimo-jta-1.0.1B-spec-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
