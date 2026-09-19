SUMMARY = "The MyBatis parent POM"
DESCRIPTION = "The MyBatis parent POM which has to be inherited by all MyBatis modules."
LICENSE = "Apache-2.0"

PV = "31"

RPM_NAME = "mybatis-parent-31-2.13.noarch.rpm"
RPM_HASH = "397607d66c19405b571ec19aa7b128b5c087eac2d499c3bbc235c2c9ab08840a6e5fd1bdb52e9b8371faa11566aad85f59bad687c12db6859dd7bc735af23f63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.mybatis-mybatis-parent-pom- \
mybatis-parent"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.felix-maven-bundle-plugin \
mvn-org.apache.maven.plugins-maven-jar-plugin \
mvn-org.apache.maven.wagon-wagon-ssh"

inherit rpm
