SUMMARY = "Apache SSHD"
DESCRIPTION = "Apache SSHD is a 100% pure java library to support the SSH protocols on both \
the client and server side."
LICENSE = "Apache-2.0 & ISC"

PV = "2.19.0"

RPM_NAME = "apache-sshd-2.19.0-2.1.noarch.rpm"
RPM_HASH = "ab6f8c1297c5c5ae496217434c5754d934bd786f2756c047ea352e6ae9d19b9f7e29ee5fdd921e04edfadb3d4ca5b195e96f0bca524729e430de459f986a8cd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-sshd \
mvn-org.apache.sshd-sshd-common \
mvn-org.apache.sshd-sshd-common-pom- \
mvn-org.apache.sshd-sshd-core \
mvn-org.apache.sshd-sshd-core-pom- \
mvn-org.apache.sshd-sshd-osgi \
mvn-org.apache.sshd-sshd-osgi-pom- \
mvn-org.apache.sshd-sshd-putty \
mvn-org.apache.sshd-sshd-putty-pom- \
mvn-org.apache.sshd-sshd-scp \
mvn-org.apache.sshd-sshd-scp-pom- \
mvn-org.apache.sshd-sshd-sftp \
mvn-org.apache.sshd-sshd-sftp-pom- \
osgi-org.apache.sshd.osgi \
osgi-org.apache.sshd.putty \
osgi-org.apache.sshd.scp \
osgi-org.apache.sshd.sftp"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.slf4j-jcl-over-slf4j \
mvn-org.slf4j-slf4j-api"

inherit rpm
