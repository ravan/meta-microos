SUMMARY = "Geronimo SAAJ 1.1 Specification"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: SOAP with Attachments API for Java (SAAJ)"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-saaj-1_1-api-1.2-41.6.noarch.rpm"
RPM_HASH = "95af7c07cbe9e31e0b2634e6735098502e578ca52cb70964b5b7360a447ecd645fa082d3e6d972ff83e6ed5bf92552179fab61efb002d6b2288d6b351c99284c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-saaj-1-1-api \
mvn-org.apache.geronimo.specs-geronimo-saaj-1.1-spec \
mvn-org.apache.geronimo.specs-geronimo-saaj-1.1-spec-pom-"

RDEPENDS:${PN} += "geronimo-jaf-1-0-2-api \
java-headless \
javapackages-filesystem"

inherit rpm
