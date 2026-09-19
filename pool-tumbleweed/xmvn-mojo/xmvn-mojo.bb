SUMMARY = "XMvn MOJO"
DESCRIPTION = "This package provides XMvn MOJO, which is a Maven plugin that consists \
of several MOJOs.  Some goals of these MOJOs are intended to be \
attached to default Maven lifecycle when building packages, others can \
be called directly from Maven command line."
LICENSE = "Apache-2.0"

PV = "4.3.0"

RPM_NAME = "xmvn-mojo-4.3.0-8.1.noarch.rpm"
RPM_HASH = "39bd4b68c58c58b2473389baf81b13cca1770d440c03d96a80e7d5994118c33a285360e4f99922f2d7e3bd61fa005b334db2d2a2a104d2d681160dadbdfa3eba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.fedoraproject.xmvn-xmvn-mojo \
mvn-org.fedoraproject.xmvn-xmvn-mojo-pom- \
xmvn-mojo"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.resolver-maven-resolver-util \
mvn-org.fedoraproject.xmvn-xmvn-api \
mvn-org.fedoraproject.xmvn-xmvn-core \
mvn-org.ow2.asm-asm"

inherit rpm
