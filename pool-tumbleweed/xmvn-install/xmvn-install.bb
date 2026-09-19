SUMMARY = "XMvn Install"
DESCRIPTION = "This package provides XMvn Install, which is a command-line interface \
to XMvn installer.  The installer reads reactor metadata and performs \
artifact installation according to specified configuration."
LICENSE = "Apache-2.0"

PV = "4.3.0"

RPM_NAME = "xmvn-install-4.3.0-8.1.noarch.rpm"
RPM_HASH = "bca1abacb8c99a4cdd4bea98328282adc617f56a2aef1b2c82f69e2a6e5bdeaca0d2b00377b7858e4f8f4804380c4247ed6f8ce2d0f61f6be35da698ecd7c0cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.fedoraproject.xmvn-xmvn-install \
mvn-org.fedoraproject.xmvn-xmvn-install-pom- \
xmvn-install"

RDEPENDS:${PN} += "/usr/bin/bash \
apache-commons-compress \
apache-commons-io \
beust-jcommander \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-com.beust-jcommander \
mvn-org.apache.commons-commons-compress \
mvn-org.fedoraproject.xmvn-xmvn-api \
mvn-org.fedoraproject.xmvn-xmvn-core \
mvn-org.ow2.asm-asm \
mvn-org.slf4j-slf4j-api \
mvn-org.slf4j-slf4j-simple \
objectweb-asm \
slf4j \
xmvn-api \
xmvn-core"

inherit rpm
