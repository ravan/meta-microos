SUMMARY = "XMvn5 API"
DESCRIPTION = "This package provides XMvn5 API module which contains public interface \
for functionality implemented by XMvn5 Core."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "xmvn5-api-5.1.0-3.1.noarch.rpm"
RPM_HASH = "abecc1f8dd1e161c503861d0604289fdff429dd67bcc3c6041e62d02456e9ea116c86ea1d8418947d6f2c163cbc93b53a079b8e2d4adcecd0cdab0b2db410355"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.fedoraproject.xmvn-xmvn-api-5 \
mvn-org.fedoraproject.xmvn-xmvn-api-5.1.0 \
mvn-org.fedoraproject.xmvn-xmvn-api-pom-5 \
mvn-org.fedoraproject.xmvn-xmvn-api-pom-5.1.0 \
xmvn5-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-io.kojan-kojan-xml"

inherit rpm
