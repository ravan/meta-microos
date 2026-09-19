SUMMARY = "Geronimo Annotation 1.0 Specification"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-annotation-1_0-api-1.2-41.6.noarch.rpm"
RPM_HASH = "7c6a4860319c82da5b2680d976208d91e0dcdcdb54aa91ba957b17fb3962b169a82746f3c7a1f0ec651466ee1743beec8ecbfe39cfe32ec8f319d1d05ec36e2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-annotation-1-0-api \
mvn-javax.annotation-jsr250-api \
mvn-javax.annotation-jsr250-api-pom- \
mvn-org.apache.geronimo.specs-geronimo-annotation-1.0-spec \
mvn-org.apache.geronimo.specs-geronimo-annotation-1.0-spec-pom- \
mvn-org.eclipse.jetty.orbit-javax.annotation \
mvn-org.eclipse.jetty.orbit-javax.annotation-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
