SUMMARY = "Ant task for spotbugs"
DESCRIPTION = "SpotBugs is the spiritual successor of FindBugs, carrying on from the point \
where it left off with support of its community. \
 \
This package contains an Ant task for spotbugs."
LICENSE = "LGPL-2.1-only"

PV = "4.9.8"

RPM_NAME = "spotbugs-ant-4.9.8-1.2.noarch.rpm"
RPM_HASH = "e9c6f66eb4da55c426000c335e1fe082e7f0aa9c41d3995b3b83f9ecec375f5af7602e38eda16c6ae0fb92d2875acd620c6a499ac0ee90aed40b2aa0b02837c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-ant-spotbugs \
config-spotbugs-ant \
mvn-com.github.spotbugs-spotbugs-ant \
mvn-com.github.spotbugs-spotbugs-ant-pom- \
spotbugs-ant"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.github.spotbugs-spotbugs \
mvn-org.apache.ant-ant"

inherit rpm
