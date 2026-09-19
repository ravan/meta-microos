SUMMARY = "Geronimo Activation 1.1 Specification"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-jaf-1_1-api-1.2-41.6.noarch.rpm"
RPM_HASH = "15ca86a7db68859098aece25f1d01190bc446f69263f08fde72cc963e9e2bf50a887d3d9d64af9a087d7cdf14c595b8b4b0b0e6d64d1a3fcd3ea672eeaa11cba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-jaf-1-1-api \
mvn-org.apache.geronimo.specs-geronimo-activation-1.1-spec \
mvn-org.apache.geronimo.specs-geronimo-activation-1.1-spec-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
