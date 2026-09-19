SUMMARY = "Maven Plugin Testing Mechanism"
DESCRIPTION = "The Maven Plugin Testing Harness provides mechanisms to manage tests on Mojo."
LICENSE = "Apache-2.0"

PV = "3.5.1"

RPM_NAME = "maven-plugin-testing-harness-3.5.1-1.4.noarch.rpm"
RPM_HASH = "093726b784f4ff22b7d33107f66132f0e3a464618d67492aeb6d70f4a1416223f2da4118278af25c066b9cabeb06f49b496976425c956aa9ebd2f4dc2ceab183"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-testing-harness \
mvn-org.apache.maven.plugin-testing-maven-plugin-testing-harness \
mvn-org.apache.maven.plugin-testing-maven-plugin-testing-harness-pom- \
mvn-org.apache.maven.shared-maven-plugin-testing-harness \
mvn-org.apache.maven.shared-maven-plugin-testing-harness-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.plexus-plexus-testing \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.codehaus.plexus-plexus-xml \
mvn-org.mockito-mockito-core"

inherit rpm
