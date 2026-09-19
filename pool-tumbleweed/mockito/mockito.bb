SUMMARY = "A Java mocking framework"
DESCRIPTION = "Mockito is a mocking framework. It lets you write tests. Tests \
produce clean verification errors."
LICENSE = "MIT"

PV = "5.11.0"

RPM_NAME = "mockito-5.11.0-3.2.noarch.rpm"
RPM_HASH = "668bb7af493fd1007872e6f45493349f9510f0e8ef72377dcc7129cbbe51946413d49702cc24653077283ea24926393819f9a5a5aa0cbc967145dd114ae64158"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mockito \
mvn-org.mockito-mockito-all \
mvn-org.mockito-mockito-all-pom- \
mvn-org.mockito-mockito-core \
mvn-org.mockito-mockito-core-pom- \
osgi-org.mockito.mockito-core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-junit-junit \
mvn-net.bytebuddy-byte-buddy \
mvn-net.bytebuddy-byte-buddy-agent \
mvn-net.bytebuddy-byte-buddy-dep \
mvn-org.objenesis-objenesis \
mvn-org.opentest4j-opentest4j"

inherit rpm
