SUMMARY = "XMvn Connector for Maven Resolver"
DESCRIPTION = "This package provides XMvn Connector for Maven Resolver, which \
provides integration of Maven Resolver with XMvn.  It provides an \
adapter which allows XMvn resolver to be used as Maven workspace \
reader."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "xmvn5-connector-5.1.0-3.1.noarch.rpm"
RPM_HASH = "861d58ad2e28813fe7069144d955f88557150efa97b177903061cc101ac61b65b5d6e9156b27939bff126b87916563a9aadac709aefedae4e755c38148911bee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.fedoraproject.xmvn-xmvn-connector-5 \
mvn-org.fedoraproject.xmvn-xmvn-connector-5.1.0 \
mvn-org.fedoraproject.xmvn-xmvn-connector-pom-5 \
mvn-org.fedoraproject.xmvn-xmvn-connector-pom-5.1.0 \
xmvn5-connector"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.fedoraproject.xmvn-xmvn-api-5.1.0 \
mvn-org.fedoraproject.xmvn-xmvn-core-5.1.0"

inherit rpm
