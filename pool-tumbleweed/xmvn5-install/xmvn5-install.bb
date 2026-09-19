SUMMARY = "XMvn5 Install"
DESCRIPTION = "This package provides XMvn5 Install, which is a command-line interface \
to XMvn5 installer.  The installer reads reactor metadata and performs \
artifact installation according to specified configuration."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "xmvn5-install-5.1.0-3.1.noarch.rpm"
RPM_HASH = "1965ad0e4d8088a1c6ba604326893826170bc7a2b8d843a09a37f272e91b26834abc54c7f6ee3f786449fda28f25cb7c8cf47f612c24e1c9eb7d67c2c75a999b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.fedoraproject.xmvn-xmvn-install-5 \
mvn-org.fedoraproject.xmvn-xmvn-install-5.1.0 \
mvn-org.fedoraproject.xmvn-xmvn-install-pom-5 \
mvn-org.fedoraproject.xmvn-xmvn-install-pom-5.1.0 \
xmvn5-install"

RDEPENDS:${PN} += "/usr/bin/bash \
apache-commons-compress \
apache-commons-io \
apache-commons-lang3 \
java \
java-headless \
javapackages-filesystem \
javapackages-tools \
kojan-xml \
mvn-commons-io-commons-io \
mvn-info.picocli-picocli \
mvn-io.kojan-kojan-xml \
mvn-org.apache.commons-commons-compress \
mvn-org.fedoraproject.xmvn-xmvn-api-5.1.0 \
mvn-org.fedoraproject.xmvn-xmvn-core-5.1.0 \
mvn-org.ow2.asm-asm \
mvn-org.slf4j-slf4j-api \
mvn-org.slf4j-slf4j-simple \
objectweb-asm \
picocli \
slf4j \
xmvn5-api \
xmvn5-core"

inherit rpm
