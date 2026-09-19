SUMMARY = "Tests for maven-scm"
DESCRIPTION = "Tests for maven-scm."
LICENSE = "Apache-2.0"

PV = "2.2.1"

RPM_NAME = "maven-scm-test-2.2.1-1.6.noarch.rpm"
RPM_HASH = "d32d07d2655233fcbaa29ef2abaffbd3e5ddcf4a6a7302e20edce42ada5e56e08b2fdba93c13425b50cc964b151b9961b92a3b77eabe6c00dcffb4155bd1f3b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-scm-test \
mvn-org.apache.maven.scm-maven-scm-provider-gittest \
mvn-org.apache.maven.scm-maven-scm-provider-gittest-pom- \
mvn-org.apache.maven.scm-maven-scm-provider-svntest \
mvn-org.apache.maven.scm-maven-scm-provider-svntest-pom- \
mvn-org.apache.maven.scm-maven-scm-test \
mvn-org.apache.maven.scm-maven-scm-test-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
maven-scm \
mvn-com.google.inject-guice--no-aop- \
mvn-junit-junit \
mvn-org.apache.commons-commons-lang3 \
mvn-org.apache.maven.plugin-testing-maven-plugin-testing-harness \
mvn-org.apache.maven.scm-maven-scm-api \
mvn-org.apache.maven.scm-maven-scm-manager-plexus \
mvn-org.apache.maven.scm-maven-scm-provider-git-commons \
mvn-org.apache.sshd-sshd-git \
mvn-org.bouncycastle-bcpkix-jdk15on \
mvn-org.codehaus.plexus-plexus-sec-dispatcher \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.eclipse.sisu-org.eclipse.sisu.plexus \
mvn-org.hamcrest-hamcrest-core \
mvn-org.slf4j-slf4j-simple"

inherit rpm
