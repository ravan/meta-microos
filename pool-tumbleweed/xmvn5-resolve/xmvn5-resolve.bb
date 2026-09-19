SUMMARY = "XMvn5 Resolver"
DESCRIPTION = "This package provides XMvn5 Resolver, which is a very simple \
command-line tool to resolve Maven artifacts from system repositories. \
Basically it's just an interface to artifact resolution mechanism \
implemented by XMvn5 Core.  The primary intended use case of XMvn \
Resolver is debugging local artifact repositories."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "xmvn5-resolve-5.1.0-3.1.noarch.rpm"
RPM_HASH = "6a8b7736135e5c7572cef53e99c1ad276770147d3439b781f06659828d039734f4f3a1dda5ba35126d3a1ca36bd5e549043a2d0924386e6a0a5e12cf8ff4745a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.fedoraproject.xmvn-xmvn-resolve-5 \
mvn-org.fedoraproject.xmvn-xmvn-resolve-5.1.0 \
mvn-org.fedoraproject.xmvn-xmvn-resolve-pom-5 \
mvn-org.fedoraproject.xmvn-xmvn-resolve-pom-5.1.0 \
xmvn5-resolve"

RDEPENDS:${PN} += "/usr/bin/bash \
java \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-info.picocli-picocli \
mvn-io.kojan-kojan-xml \
mvn-org.fedoraproject.xmvn-xmvn-api-5.1.0 \
mvn-org.fedoraproject.xmvn-xmvn-core-5.1.0 \
xmvn5-api \
xmvn5-core"

inherit rpm
