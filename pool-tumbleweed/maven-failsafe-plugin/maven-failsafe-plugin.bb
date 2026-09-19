SUMMARY = "Maven plugin for running integration tests"
DESCRIPTION = "The Failsafe Plugin is designed to run integration tests while the \
Surefire Plugins is designed to run unit. The name (failsafe) was \
chosen both because it is a synonym of surefire and because it implies \
that when it fails, it does so in a safe way. \
 \
If you use the Surefire Plugin for running tests, then when you have a \
test failure, the build will stop at the integration-test phase and \
your integration test environment will not have been torn down \
correctly. \
 \
The Failsafe Plugin is used during the integration-test and verify \
phases of the build lifecycle to execute the integration tests of an \
application. The Failsafe Plugin will not fail the build during the \
integration-test phase thus enabling the post-integration-test phase \
to execute."
LICENSE = "Apache-2.0 & CPL-1.0"

PV = "3.6.0"

RPM_NAME = "maven-failsafe-plugin-3.6.0-1.1.noarch.rpm"
RPM_HASH = "74f98406b1c4db5fc8de75982b395ccb5a6500fe7e97c07637e98bb805ba22a49a6c194a34f2f17d1966f9ddcac58b0863cc5ce36b60923703de6365615d69b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-failsafe-plugin \
mvn-org.apache.maven.plugins-maven-failsafe-plugin \
mvn-org.apache.maven.plugins-maven-failsafe-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.commons-commons-lang3 \
mvn-org.apache.maven.shared-maven-shared-utils \
mvn-org.apache.maven.surefire-maven-surefire-common \
mvn-org.apache.maven.surefire-surefire-api \
mvn-org.apache.maven.surefire-surefire-booter \
mvn-org.apache.maven.surefire-surefire-extensions-api \
mvn-org.slf4j-slf4j-simple"

inherit rpm
