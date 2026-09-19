SUMMARY = "XMvn5 Core"
DESCRIPTION = "This package provides XMvn5 Core module, which implements the essential \
functionality of XMvn5 such as resolution of artifacts from system \
repository."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "xmvn5-core-5.1.0-3.1.noarch.rpm"
RPM_HASH = "11c1ece1b9b28b0d0bf37032ac9a54dc98378ada42cd796d5cdc41c0815ec129e28183d4ba27e3b17efd4800cbb1a21d5567bf225575f4541ab5fa4676428550"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.fedoraproject.xmvn-xmvn-core-5 \
mvn-org.fedoraproject.xmvn-xmvn-core-5.1.0 \
mvn-org.fedoraproject.xmvn-xmvn-core-pom-5 \
mvn-org.fedoraproject.xmvn-xmvn-core-pom-5.1.0 \
xmvn5-core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-io.kojan-kojan-xml"

inherit rpm
