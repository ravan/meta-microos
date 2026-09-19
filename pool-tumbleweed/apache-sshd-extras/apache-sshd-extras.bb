SUMMARY = "Apache SSHD"
DESCRIPTION = "Apache SSHD is a 100% pure java library to support the SSH protocols on both \
the client and server side."
LICENSE = "Apache-2.0 & ISC"

PV = "2.19.0"

RPM_NAME = "apache-sshd-extras-2.19.0-2.1.noarch.rpm"
RPM_HASH = "ca72ec4134dc74dd37c4a4e6f9a1b338488caebf344c3e3576661d0bb59d7e659b3c7abc58622fe461b60dd8aec3fded1f6f46799ef703b91961e7e9ab793d9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-sshd-extras \
mvn-org.apache.sshd-sshd-cli \
mvn-org.apache.sshd-sshd-cli-pom- \
mvn-org.apache.sshd-sshd-contrib \
mvn-org.apache.sshd-sshd-contrib-pom- \
mvn-org.apache.sshd-sshd-git \
mvn-org.apache.sshd-sshd-git-pom- \
mvn-org.apache.sshd-sshd-ldap \
mvn-org.apache.sshd-sshd-ldap-pom- \
mvn-org.apache.sshd-sshd-netty \
mvn-org.apache.sshd-sshd-netty-pom- \
mvn-org.apache.sshd-sshd-openpgp \
mvn-org.apache.sshd-sshd-openpgp-pom- \
osgi-org.apache.sshd.cli \
osgi-org.apache.sshd.contrib \
osgi-org.apache.sshd.git \
osgi-org.apache.sshd.ldap \
osgi-org.apache.sshd.netty \
osgi-org.apache.sshd.openpgp"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-io.netty-netty-handler \
mvn-io.netty-netty-transport \
mvn-org.apache.sshd-sshd-common \
mvn-org.apache.sshd-sshd-core \
mvn-org.apache.sshd-sshd-putty \
mvn-org.apache.sshd-sshd-scp \
mvn-org.apache.sshd-sshd-sftp \
mvn-org.bouncycastle-bcpg-jdk18on \
mvn-org.bouncycastle-bcpkix-jdk18on \
mvn-org.bouncycastle-bcprov-jdk18on \
mvn-org.bouncycastle-bcutil-jdk18on \
mvn-org.c02e.jpgpj-jpgpj \
mvn-org.eclipse.jgit-org.eclipse.jgit \
mvn-org.slf4j-jcl-over-slf4j \
mvn-org.slf4j-slf4j-api"

inherit rpm
