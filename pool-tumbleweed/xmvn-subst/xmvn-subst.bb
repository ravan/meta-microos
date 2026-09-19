SUMMARY = "XMvn Subst"
DESCRIPTION = "This package provides XMvn Subst, which is a tool that can substitute \
Maven artifact files with symbolic links to corresponding files in \
artifact repository."
LICENSE = "Apache-2.0"

PV = "4.3.0"

RPM_NAME = "xmvn-subst-4.3.0-8.1.noarch.rpm"
RPM_HASH = "d5762c71461c6ed70b11ed491caac89728f0ac232e05e21e03ab63eb93c2b6b33f7e13ce6668f1ec1c104eceaa9e097ccc09f94af6c7cf5bf95b3727aa4e4fcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.fedoraproject.xmvn-xmvn-subst \
mvn-org.fedoraproject.xmvn-xmvn-subst-pom- \
xmvn-subst"

RDEPENDS:${PN} += "/usr/bin/bash \
beust-jcommander \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-com.beust-jcommander \
mvn-org.fedoraproject.xmvn-xmvn-api \
mvn-org.fedoraproject.xmvn-xmvn-core \
xmvn-api \
xmvn-core"

inherit rpm
