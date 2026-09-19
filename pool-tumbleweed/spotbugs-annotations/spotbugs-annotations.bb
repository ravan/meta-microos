SUMMARY = "Annotations the SpotBugs tool supports"
DESCRIPTION = "SpotBugs is the spiritual successor of FindBugs, carrying on from the point \
where it left off with support of its community. \
 \
This package contains the annotations the SpotBugs tool supports."
LICENSE = "LGPL-2.1-only"

PV = "4.9.8"

RPM_NAME = "spotbugs-annotations-4.9.8-1.2.noarch.rpm"
RPM_HASH = "1494713e32508f3c15d97e7a9bf6681502ba3ec79a9bb8a54d887d08f6eb6d140704f1953f942cae42f9c28ee3e5e75ace30938c2e639eab92c25115f4adfb0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-ant-spotbugs \
mvn-com.github.spotbugs-spotbugs-annotations \
mvn-com.github.spotbugs-spotbugs-annotations-pom- \
osgi-spotbugs-annotations \
spotbugs-annotations"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.code.findbugs-jsr305"

inherit rpm
