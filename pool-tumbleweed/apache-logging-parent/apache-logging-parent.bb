SUMMARY = "Parent pom for Apache Logging Services projects"
DESCRIPTION = "Parent pom for Apache Logging Services projects."
LICENSE = "Apache-2.0"

PV = "12.1.1"

RPM_NAME = "apache-logging-parent-12.1.1-1.1.noarch.rpm"
RPM_HASH = "a8e0f19628701d02f925a68cbbdb50a872ca1cc52a52822df5641f4f95b41cee81f92d6e01ed36ea0714af962f403bf5a012cd9107444f088bc152a16310fa3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-logging-parent \
mvn-org.apache.logging-logging-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-biz.aQute.bnd-bnd-baseline-maven-plugin \
mvn-biz.aQute.bnd-bnd-maven-plugin \
mvn-org.apache-apache-pom- \
mvn-org.apache.maven.plugins-maven-compiler-plugin \
mvn-org.apache.maven.plugins-maven-failsafe-plugin \
mvn-org.apache.maven.plugins-maven-jar-plugin \
mvn-org.apache.maven.plugins-maven-surefire-plugin \
mvn-org.codehaus.mojo-build-helper-maven-plugin"

inherit rpm
