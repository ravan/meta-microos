SUMMARY = "Doxia content generation framework"
DESCRIPTION = "Doxia is a content generation framework which aims to provide its \
users with powerful techniques for generating static and dynamic \
content. Doxia can be used to generate static sites in addition to \
being incorporated into dynamic content generation systems like blogs, \
wikis and content management systems."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "maven-doxia-sitetools-2.1.0-2.1.noarch.rpm"
RPM_HASH = "41703c1569c6f1d3d796d6f19790f83b347a28ea90607a8da84dcb3625dbe4aa8c0d5b098d616be462a720a7f177c082552533042f19aab09ef11ea1501b349a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-doxia-sitetools \
mvn-org.apache.maven.doxia-doxia-integration-tools \
mvn-org.apache.maven.doxia-doxia-integration-tools-pom- \
mvn-org.apache.maven.doxia-doxia-site-model \
mvn-org.apache.maven.doxia-doxia-site-model-pom- \
mvn-org.apache.maven.doxia-doxia-site-renderer \
mvn-org.apache.maven.doxia-doxia-site-renderer-pom- \
mvn-org.apache.maven.doxia-doxia-skin-model \
mvn-org.apache.maven.doxia-doxia-skin-model-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-javax.inject-javax.inject \
mvn-org.apache.commons-commons-lang3 \
mvn-org.apache.maven.doxia-doxia-core \
mvn-org.apache.maven.doxia-doxia-module-xhtml5 \
mvn-org.apache.maven.doxia-doxia-sink-api \
mvn-org.apache.maven.reporting-maven-reporting-api \
mvn-org.apache.velocity-velocity-engine-core \
mvn-org.apache.velocity.tools-velocity-tools-generic \
mvn-org.codehaus.plexus-plexus-i18n \
mvn-org.codehaus.plexus-plexus-interpolation \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.codehaus.plexus-plexus-velocity \
mvn-org.codehaus.plexus-plexus-xml \
mvn-org.eclipse.sisu-org.eclipse.sisu.plexus \
mvn-org.slf4j-slf4j-api"

inherit rpm
