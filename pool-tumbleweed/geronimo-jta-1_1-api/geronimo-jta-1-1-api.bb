SUMMARY = "Geronimo JTA 1.1 Specification"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-jta-1_1-api-1.2-41.6.noarch.rpm"
RPM_HASH = "ef324b4c41259619eec0286c861a492e80d140225f6b1f1166ede626fd366e2ae9070c4107573df868277d09d8d8646610d8c5d75337aa23590a4b57f9f81a0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-jta-1-1-api \
mvn-javax.transaction-jta \
mvn-javax.transaction-jta-pom- \
mvn-org.apache.geronimo.specs-geronimo-jta-1.1-spec \
mvn-org.apache.geronimo.specs-geronimo-jta-1.1-spec-pom- \
mvn-org.eclipse.jetty.orbit-javax.transaction \
mvn-org.eclipse.jetty.orbit-javax.transaction-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
