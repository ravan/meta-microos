SUMMARY = "Maven Artifact Resolver Instance Supplier Maven3"
DESCRIPTION = "A helper module to provide RepositorySystem instances. \
 \
Apache Maven Artifact Resolver is a library for working with artifact \
repositories and dependency resolution. Maven Artifact Resolver deals with the \
specification of local repository, remote repository, developer workspaces, \
artifact transports and artifact resolution."
LICENSE = "Apache-2.0"

PV = "2.0.22"

RPM_NAME = "maven-resolver-supplier-mvn4-2.0.22-1.1.noarch.rpm"
RPM_HASH = "1a9c594d21ae388bdfa8a6d91647d415e42c840f2838b741ade40ae98f5d6d1df2d42b4494536b89d5d854a966fe783e1c16f80aea7d153f5f326e7239d78d2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver-supplier-mvn4 \
mvn-org.apache.maven.resolver-maven-resolver-supplier-mvn4 \
mvn-org.apache.maven.resolver-maven-resolver-supplier-mvn4-pom- \
osgi-org.apache.maven.resolver.supplier"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-model-builder-4 \
mvn-org.apache.maven-maven-resolver-provider-4 \
mvn-org.apache.maven.resolver-maven-resolver-api \
mvn-org.apache.maven.resolver-maven-resolver-connector-basic \
mvn-org.apache.maven.resolver-maven-resolver-impl \
mvn-org.apache.maven.resolver-maven-resolver-named-locks \
mvn-org.apache.maven.resolver-maven-resolver-spi \
mvn-org.apache.maven.resolver-maven-resolver-transport-apache \
mvn-org.apache.maven.resolver-maven-resolver-transport-file \
mvn-org.apache.maven.resolver-maven-resolver-util \
mvn-org.slf4j-slf4j-api"

inherit rpm
