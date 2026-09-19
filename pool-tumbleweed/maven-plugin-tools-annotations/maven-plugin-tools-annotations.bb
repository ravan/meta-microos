SUMMARY = "Maven Plugin Tool for Annotations"
DESCRIPTION = "This package provides Java 5 annotation tools for use with Apache Maven."
LICENSE = "Apache-2.0"

PV = "4.0.0~beta3"

RPM_NAME = "maven-plugin-tools-annotations-4.0.0~beta3-1.1.noarch.rpm"
RPM_HASH = "3fa5c658d632cff9f3094de9675668bf22d2bb8816515b82c32674331a4d97a7d2cb327d85776853a1f8d021f56a3abe53e4624f593da77ba0ff5245ba12eb62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-tools-annotations \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-annotations \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-annotations-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.github.javaparser-javaparser-core \
mvn-com.github.javaparser-javaparser-symbol-solver-core \
mvn-org.apache.maven.plugin-tools-maven-plugin-annotations \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-api \
mvn-org.codehaus.plexus-plexus-archiver \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.jsoup-jsoup \
mvn-org.ow2.asm-asm \
mvn-org.ow2.asm-asm-util"

inherit rpm
