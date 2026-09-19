SUMMARY = "Maven plugin for creating javadocs"
DESCRIPTION = "The Maven Javadoc Plugin is a plugin that uses the javadoc tool for \
generating javadocs for the specified project."
LICENSE = "Apache-2.0"

PV = "3.12.0"

RPM_NAME = "maven-javadoc-plugin-3.12.0-3.1.noarch.rpm"
RPM_HASH = "4b314990eec3515250605feb0b07b9ddbf2c0840a436850ee2bb89bd26ae48648b2729e467acad7f3d6185f648c3749e688c73a8a23fe5ee6bde3262e75e9ea8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-javadoc-plugin \
mvn-org.apache.maven.plugins-maven-javadoc-plugin \
mvn-org.apache.maven.plugins-maven-javadoc-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.thoughtworks.qdox-qdox \
mvn-commons-io-commons-io \
mvn-javax.inject-javax.inject \
mvn-org.apache.commons-commons-lang3 \
mvn-org.apache.commons-commons-text \
mvn-org.apache.httpcomponents-httpclient \
mvn-org.apache.httpcomponents-httpcore \
mvn-org.apache.maven-maven-archiver \
mvn-org.apache.maven.doxia-doxia-integration-tools \
mvn-org.apache.maven.doxia-doxia-sink-api \
mvn-org.apache.maven.doxia-doxia-site-renderer \
mvn-org.apache.maven.reporting-maven-reporting-api \
mvn-org.apache.maven.resolver-maven-resolver-util \
mvn-org.apache.maven.shared-maven-common-artifact-filters \
mvn-org.apache.maven.shared-maven-invoker \
mvn-org.apache.maven.shared-maven-shared-utils \
mvn-org.apache.maven.wagon-wagon-provider-api \
mvn-org.codehaus.plexus-plexus-archiver \
mvn-org.codehaus.plexus-plexus-interactivity-api \
mvn-org.codehaus.plexus-plexus-io \
mvn-org.codehaus.plexus-plexus-java \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.codehaus.plexus-plexus-xml \
mvn-org.slf4j-slf4j-api"

inherit rpm
