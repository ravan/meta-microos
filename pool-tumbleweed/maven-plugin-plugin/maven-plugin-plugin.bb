SUMMARY = "Maven Plugin Plugin"
DESCRIPTION = "The Plugin Plugin is used to create a Maven plugin descriptor for any Mojo's \
found in the source tree, to include in the JAR. It is also used to generate \
Xdoc files for the Mojos as well as for updating the plugin registry, the \
artifact metadata and a generic help goal."
LICENSE = "Apache-2.0"

PV = "4.0.0~beta3"

RPM_NAME = "maven-plugin-plugin-4.0.0~beta3-1.1.noarch.rpm"
RPM_HASH = "844f14eed15d0e6af81b22ca3f675d5631d3969bc8a7c0c3c9d338c065185b1e5eb362072c5cd20d555eda67088539888c59cbfe73a21b4f566178999108372f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-plugin \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-pom- \
mvn-org.apache.maven.plugins-maven-plugin-plugin \
mvn-org.apache.maven.plugins-maven-plugin-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.plugin-tools-maven-plugin-annotations \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-annotations \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-api \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-generators \
mvn-org.apache.maven.resolver-maven-resolver-util \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.codehaus.plexus-plexus-velocity \
mvn-org.ow2.asm-asm \
mvn-org.sonatype.plexus-plexus-build-api"

inherit rpm
