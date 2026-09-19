SUMMARY = "Library for Maven-OSGi integration"
DESCRIPTION = "Library for Maven-OSGi integration. \
 \
This is a replacement package for maven-shared-osgi"
LICENSE = "Apache-2.0"

PV = "0.3.0"

RPM_NAME = "maven-osgi-0.3.0-1.11.noarch.rpm"
RPM_HASH = "291f9041f2c01c30d12d717b29921fd2cf2fd492e2b987f3ce55df39c625e81423b0a9bce410c032a54a35ceaf322d6698d7ca8b8000586b9b6fc7eb322c9918"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-osgi \
mvn-org.apache.maven.shared-maven-osgi \
mvn-org.apache.maven.shared-maven-osgi-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-biz.aQute-bndlib"

inherit rpm
