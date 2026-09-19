SUMMARY = "JBoss Parent POM"
DESCRIPTION = "The Project Object Model files for JBoss packages."
LICENSE = "CC0-1.0"

PV = "20"

RPM_NAME = "jboss-parent-20-1.29.noarch.rpm"
RPM_HASH = "1f2b3cea069d875ecbdc9d7a28561d0ea0af7ad7e741a5d0fccc07337cf747b6b0bc23a4a191d2dd46d4d86b5d3a996e723e296e9f102b05633f0eb253748882"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-parent \
mvn-org.jboss-jboss-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.plugins-maven-source-plugin"

inherit rpm
