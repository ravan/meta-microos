SUMMARY = "Standalone installation of apache-sshd"
DESCRIPTION = "This package provides standalone installation of apache-sshd"
LICENSE = "Apache-2.0 & ISC"

PV = "2.19.0"

RPM_NAME = "apache-sshd-standalone-2.19.0-2.1.noarch.rpm"
RPM_HASH = "4fa831d731a1c047fe4b02906a21fda66b65c7f23379e389248ce5ef6ff0e910c43d000d3d407d5bb8b4cd8244115bb5eb9b21bb71bfde641ddde466e2f33275"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-sshd-standalone"

RDEPENDS:${PN} += "/usr/bin/sh \
apache-sshd \
apache-sshd-extras \
assertj-core \
bouncycastle \
bouncycastle-pg \
bouncycastle-pkix \
bouncycastle-util \
byte-buddy \
ed25519-java \
javaewah \
jcl-over-slf4j \
jctools \
jgit \
jpgpj \
netty \
objectweb-asm \
slf4j \
slf4j-jdk14 \
tomcat-lib"

inherit rpm
