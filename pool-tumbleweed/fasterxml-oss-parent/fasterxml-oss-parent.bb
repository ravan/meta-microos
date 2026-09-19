SUMMARY = "FasterXML parent pom"
DESCRIPTION = "FasterXML is the business behind the Woodstox streaming XML parser, \
Jackson streaming JSON parser, the Aalto non-blocking XML parser, and \
a growing family of utility libraries and extensions. \
 \
FasterXML offers consulting services for adoption, performance tuning, \
and extension. \
 \
This package contains the parent pom file for FasterXML.com projects."
LICENSE = "Apache-2.0"

PV = "79"

RPM_NAME = "fasterxml-oss-parent-79-1.1.noarch.rpm"
RPM_HASH = "890bb645ec0402c9f5d338ad72683fda908e794ac7ab1f5b23a6408c063479b3c285b911be2ef6b44094fa64daa178ad4b8c833b8a9b9ccb46f4857f6857e4f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fasterxml-oss-parent \
mvn-com.fasterxml-oss-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.felix-maven-bundle-plugin \
mvn-org.apache.maven.plugins-maven-compiler-plugin \
mvn-org.apache.maven.plugins-maven-jar-plugin \
mvn-org.apache.maven.plugins-maven-surefire-plugin \
mvn-org.codehaus.mojo-build-helper-maven-plugin"

inherit rpm
