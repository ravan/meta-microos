SUMMARY = "XMvn API"
DESCRIPTION = "This package provides XMvn API module which contains public interface \
for functionality implemented by XMvn Core."
LICENSE = "Apache-2.0"

PV = "4.3.0"

RPM_NAME = "xmvn-api-4.3.0-8.1.noarch.rpm"
RPM_HASH = "b3f3ca047d3b627e8f39802d26f5586965db0dc91aec6f8cc372ba17815c842513cbb203553dc4aeac1713260c07197b45d6afd867943d22d5f491582a4fca26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.fedoraproject.xmvn-xmvn-api \
mvn-org.fedoraproject.xmvn-xmvn-api-pom- \
xmvn-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
