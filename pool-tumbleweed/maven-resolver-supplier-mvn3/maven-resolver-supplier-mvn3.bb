SUMMARY = "Maven Artifact Resolver Instance Supplier Maven3"
DESCRIPTION = "A helper module to provide RepositorySystem instances. \
 \
Apache Maven Artifact Resolver is a library for working with artifact \
repositories and dependency resolution. Maven Artifact Resolver deals with the \
specification of local repository, remote repository, developer workspaces, \
artifact transports and artifact resolution."
LICENSE = "Apache-2.0"

PV = "2.0.22"

RPM_NAME = "maven-resolver-supplier-mvn3-2.0.22-1.1.noarch.rpm"
RPM_HASH = "4bda0bed272acc11164c576ae28c666a26ddc1f81cb9b714d4fead25dc7f75fbd584b8b772e60e64c0a419589e6239c120df84f415aefcda21217b45349dbda8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver-supplier-mvn3 \
mvn-org.apache.maven.resolver-maven-resolver-supplier-mvn3 \
mvn-org.apache.maven.resolver-maven-resolver-supplier-mvn3-pom- \
osgi-org.apache.maven.resolver.supplier"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-model-builder \
mvn-org.apache.maven-maven-resolver-provider \
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
