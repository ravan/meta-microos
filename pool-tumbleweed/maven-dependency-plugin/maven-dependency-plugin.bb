SUMMARY = "Plugin to manipulate, copy and unpack local and remote artifacts"
DESCRIPTION = " \
The dependency plugin provides the capability to manipulate \
artifacts. It can copy and/or unpack artifacts from local or remote \
repositories to a specified location."
LICENSE = "Apache-2.0"

PV = "3.11.0"

RPM_NAME = "maven-dependency-plugin-3.11.0-1.2.noarch.rpm"
RPM_HASH = "c79a381154969b91265d129b6f21e3f9124469a5b516f3ee3312bbf17b2edde86f856fb549577a96d90435cd653dd7d5bdca03a97d19d047fe577f0b8f470934"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-dependency-plugin \
mvn-org.apache.maven.plugins-maven-dependency-plugin \
mvn-org.apache.maven.plugins-maven-dependency-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-eu.maveniverse.maven.domtrip-domtrip-core \
mvn-eu.maveniverse.maven.domtrip-domtrip-maven \
mvn-org.apache.commons-commons-lang3 \
mvn-org.apache.maven.doxia-doxia-sink-api \
mvn-org.apache.maven.reporting-maven-reporting-api \
mvn-org.apache.maven.reporting-maven-reporting-impl \
mvn-org.apache.maven.resolver-maven-resolver-util \
mvn-org.apache.maven.shared-maven-artifact-transfer \
mvn-org.apache.maven.shared-maven-common-artifact-filters \
mvn-org.apache.maven.shared-maven-dependency-analyzer \
mvn-org.apache.maven.shared-maven-dependency-tree \
mvn-org.apache.maven.shared-maven-shared-utils \
mvn-org.apache.velocity-velocity-engine-core \
mvn-org.apache.velocity.tools-velocity-tools-generic \
mvn-org.codehaus.plexus-plexus-archiver \
mvn-org.codehaus.plexus-plexus-i18n \
mvn-org.codehaus.plexus-plexus-io \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.codehaus.plexus-plexus-xml \
mvn-org.slf4j-slf4j-api \
mvn-org.sonatype.plexus-plexus-build-api"

inherit rpm
