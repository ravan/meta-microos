SUMMARY = "JTS Parent POMs"
DESCRIPTION = "Maven POMs for project inheritance."
LICENSE = "EPL-1.0"

PV = "1.20.0"

RPM_NAME = "jts-parent-1.20.0-1.6.noarch.rpm"
RPM_HASH = "b3d3e636291f2267313c594d66e0c850f9abf411e342ec2af3c1d7af2d66c6eaf105a4e75ee6485a40477f2a54ec6a2516739070acb36d4fdf5885c42ce5c544"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jts-parent \
mvn-org.locationtech.jts-jts-modules-pom- \
mvn-org.locationtech.jts-jts-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.plugins-maven-compiler-plugin \
mvn-org.apache.maven.plugins-maven-surefire-plugin"

inherit rpm
