SUMMARY = "Geronimo JPA 1.0 Specification"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-jpa-3_0-api-1.2-41.6.noarch.rpm"
RPM_HASH = "7bbc8cd57c362ecd169f8ba0ac05f4b2453f62c77aacdb62f263b07af5e1e912fb60baedefa7eb97bf97e092d025590a9362959f46a238461bfd7d2926061e93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-jpa-3-0-api \
mvn-javax.persistence-persistence-api \
mvn-javax.persistence-persistence-api-pom- \
mvn-org.apache.geronimo.specs-geronimo-jpa-3.0-spec \
mvn-org.apache.geronimo.specs-geronimo-jpa-3.0-spec-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
