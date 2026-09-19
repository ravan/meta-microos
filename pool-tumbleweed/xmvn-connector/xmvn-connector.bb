SUMMARY = "XMvn Connector for Maven Resolver"
DESCRIPTION = "This package provides XMvn Connector for Maven Resolver, which \
provides integration of Maven Resolver with XMvn.  It provides an \
adapter which allows XMvn resolver to be used as Maven workspace \
reader."
LICENSE = "Apache-2.0"

PV = "4.3.0"

RPM_NAME = "xmvn-connector-4.3.0-8.1.noarch.rpm"
RPM_HASH = "0e6a610a90d56e1d1dde4550575731d785214897514abc1025add646a9a6b7877770a60e38a5682beb696d097560febb8f823e0f1823485e9226389e76d54b3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.fedoraproject.xmvn-xmvn-connector \
mvn-org.fedoraproject.xmvn-xmvn-connector-pom- \
xmvn-connector \
xmvn-connector-aether"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.fedoraproject.xmvn-xmvn-api \
mvn-org.fedoraproject.xmvn-xmvn-core"

inherit rpm
