SUMMARY = "XMvn Connector for Apache Ivy"
DESCRIPTION = "This package provides XMvn MOJO, which is a Maven plugin that consists \
of several MOJOs.  Some goals of these MOJOs are intended to be \
attached to default Maven lifecycle when building packages, others can \
be called directly from Maven command line."
LICENSE = "Apache-2.0"

PV = "4.0.0"

RPM_NAME = "xmvn-connector-ivy-4.0.0-1.7.noarch.rpm"
RPM_HASH = "d97e3da344f9c7db40596a2132ecd297462412d5a89db252b515a48124baa88b6df3394671289a9b8172863767a1daf303477a14a39425d78f7a7d51d8a0cda1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.fedoraproject.xmvn-xmvn-connector-ivy \
mvn-org.fedoraproject.xmvn-xmvn-connector-ivy-pom- \
xmvn-connector-ivy"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.fedoraproject.xmvn-xmvn-api \
mvn-org.slf4j-slf4j-api"

inherit rpm
