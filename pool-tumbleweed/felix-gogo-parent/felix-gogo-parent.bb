SUMMARY = "Parent pom for Apache Felix Gogo"
DESCRIPTION = "Apache Felix Gogo is a subproject of Apache Felix implementing a command \
line shell for OSGi. It is used in many OSGi runtimes and servers."
LICENSE = "Apache-2.0"

PV = "5"

RPM_NAME = "felix-gogo-parent-5-1.5.noarch.rpm"
RPM_HASH = "113f4d53b625a2356900a83f026f17795d808718224a0cd3d23c4f461132e43aa92c2bda50a4dec1c2d2834925db27c296318dbeaaa2fd46d7932c51d067ef02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-gogo-parent \
mvn-org.apache.felix-gogo-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.felix-felix-parent-pom-"

inherit rpm
