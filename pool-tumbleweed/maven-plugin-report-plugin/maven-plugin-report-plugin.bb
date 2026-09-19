SUMMARY = "Maven Plugin Plugin"
DESCRIPTION = "The Plugin Plugin is used to create a Maven plugin descriptor for any Mojo's \
found in the source tree, to include in the JAR. It is also used to generate \
Xdoc files for the Mojos as well as for updating the plugin registry, the \
artifact metadata and a generic help goal."
LICENSE = "Apache-2.0"

PV = "4.0.0~beta3"

RPM_NAME = "maven-plugin-report-plugin-4.0.0~beta3-1.1.noarch.rpm"
RPM_HASH = "971d65e34311043af1c31a89bc689faf3a9a3ac583cdab5ddccc016c1e5a76862a3f5a1e2688b560a2831c568b4cea9ff50201f8b4862ce27a6d5257330652ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-report-plugin \
mvn-org.apache.maven.plugins-maven-plugin-report-plugin \
mvn-org.apache.maven.plugins-maven-plugin-report-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.commons-commons-lang3 \
mvn-org.apache.maven.doxia-doxia-core \
mvn-org.apache.maven.doxia-doxia-sink-api \
mvn-org.apache.maven.plugin-tools-maven-plugin-annotations \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-api \
mvn-org.apache.maven.reporting-maven-reporting-api \
mvn-org.apache.maven.reporting-maven-reporting-impl \
mvn-org.codehaus.plexus-plexus-i18n \
mvn-org.codehaus.plexus-plexus-xml"

inherit rpm
