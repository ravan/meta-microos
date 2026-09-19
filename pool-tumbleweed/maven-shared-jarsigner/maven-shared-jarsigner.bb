SUMMARY = "Component to assist in signing Java archives"
DESCRIPTION = "Apache Maven Jarsigner is a component which provides utilities to sign \
and verify Java archive and other files in your Maven MOJOs."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "maven-shared-jarsigner-3.0.0-4.8.noarch.rpm"
RPM_HASH = "8cb956c806d9952b10d6cf52816fd01fbbc46e70877e25c1d7bb9937c9f3ebe8b8e3158e9f7f601d1180b7824561441488a60e7fc06bc774a6bc928ccd759c22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-shared-jarsigner \
mvn-org.apache.maven.shared-maven-jarsigner \
mvn-org.apache.maven.shared-maven-jarsigner-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven.shared-maven-shared-utils \
mvn-org.codehaus.plexus-plexus-component-annotations"

inherit rpm
