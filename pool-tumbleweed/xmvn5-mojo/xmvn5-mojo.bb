SUMMARY = "XMvn MOJO"
DESCRIPTION = "This package provides XMvn MOJO, which is a Maven plugin that consists \
of several MOJOs.  Some goals of these MOJOs are intended to be \
attached to default Maven lifecycle when building packages, others can \
be called directly from Maven command line."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "xmvn5-mojo-5.1.0-3.1.noarch.rpm"
RPM_HASH = "d7f4f241d1c3ab66a7260f44a93d50c739e2a06bba188525930a83df8a1167dcd45a1122011f09d113b969cb02361f7d32c9b0dd4125a96d79c3b8c643e50294"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.fedoraproject.xmvn-xmvn-mojo-5 \
mvn-org.fedoraproject.xmvn-xmvn-mojo-5.1.0 \
mvn-org.fedoraproject.xmvn-xmvn-mojo-pom-5 \
mvn-org.fedoraproject.xmvn-xmvn-mojo-pom-5.1.0 \
xmvn5-mojo"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-io.kojan-kojan-xml \
mvn-org.fedoraproject.xmvn-xmvn-api-5.1.0 \
mvn-org.fedoraproject.xmvn-xmvn-core-5.1.0"

inherit rpm
