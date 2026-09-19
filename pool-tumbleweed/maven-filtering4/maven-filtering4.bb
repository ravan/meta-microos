SUMMARY = "Shared component providing resource filtering"
DESCRIPTION = "These Plexus components have been built from the filtering process/code in \
Maven Resources Plugin. The goal is to provide a shared component for all \
plugins that needs to filter resources."
LICENSE = "Apache-2.0"

PV = "4.0.0~20260707.git2d20dde"

RPM_NAME = "maven-filtering4-4.0.0~20260707.git2d20dde-1.1.noarch.rpm"
RPM_HASH = "5db7528b880b53cd2e77e72404bde00599fde8cd53dc4831ed9386992c5a9014438405f95a800b1b3b021c6d775fcba37d9cc2b83d8819f0825c26964f702a47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-filtering4 \
mvn-org.apache.maven.shared-maven-filtering-4 \
mvn-org.apache.maven.shared-maven-filtering-4.0.0-beta-2-SNAPSHOT \
mvn-org.apache.maven.shared-maven-filtering-pom-4 \
mvn-org.apache.maven.shared-maven-filtering-pom-4.0.0-beta-2-SNAPSHOT"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-api-annotations \
mvn-org.apache.maven-maven-api-core \
mvn-org.apache.maven-maven-api-di \
mvn-org.apache.maven-maven-api-model \
mvn-org.apache.maven-maven-api-settings \
mvn-org.codehaus.plexus-plexus-interpolation \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.slf4j-slf4j-api \
mvn-org.sonatype.plexus-plexus-build-api"

inherit rpm
