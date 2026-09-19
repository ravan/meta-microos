SUMMARY = "Maven plugin to remove generated files"
DESCRIPTION = "The Maven Clean Plugin is a plugin that removes files generated \
at build-time in a project's directory."
LICENSE = "Apache-2.0"

PV = "3.5.0"

RPM_NAME = "maven-clean-plugin-3.5.0-1.6.noarch.rpm"
RPM_HASH = "450c440d581f531713adef0e996b350b155e2cd7664567f661394ee99c3bbecd2e24b1a42f143758701a4c93f14da232660f43efb2b9b066da1e121ce9c17f49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-clean-plugin \
mvn-org.apache.maven.plugins-maven-clean-plugin \
mvn-org.apache.maven.plugins-maven-clean-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
