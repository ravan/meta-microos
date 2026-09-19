SUMMARY = "Maven Plugin for processing JavaCC grammar files"
DESCRIPTION = "Maven Plugin for processing JavaCC grammar files."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "javacc-maven-plugin-3.1.0-1.7.noarch.rpm"
RPM_HASH = "fd593dcf370c2b58076411bead0be70137a858bbe78ed908c9b11f15ae90f88ce653cbc43e83418f6114d50a1717d6b9b6ea34c77f4f86a0fce06b7545fac04a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javacc-maven-plugin \
mvn-org.codehaus.mojo-javacc-maven-plugin \
mvn-org.codehaus.mojo-javacc-maven-plugin-pom- \
mvn-org.javacc.plugin-javacc-maven-plugin \
mvn-org.javacc.plugin-javacc-maven-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-edu.ucla.cs.compilers-jtb \
mvn-net.java.dev.javacc-javacc \
mvn-org.apache.maven.doxia-doxia-sink-api \
mvn-org.apache.maven.doxia-doxia-site-renderer \
mvn-org.apache.maven.reporting-maven-reporting-api \
mvn-org.apache.maven.reporting-maven-reporting-impl \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.codehaus.plexus-plexus-xml"

inherit rpm
