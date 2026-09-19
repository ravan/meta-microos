SUMMARY = "Mock objects for interfaces in JUnit tests"
DESCRIPTION = "EasyMock provides Mock Objects for interfaces in JUnit tests by generating \
them on the fly using Java's proxy mechanism. Due to EasyMock's unique style \
of recording expectations, most refactorings will not affect the Mock Objects. \
So EasyMock is a perfect fit for Test-Driven Development."
LICENSE = "Apache-2.0"

PV = "3.6"

RPM_NAME = "easymock-3.6-3.7.noarch.rpm"
RPM_HASH = "3a7c06dd87b5943ef47bf520ef37322744dcf39996450c2dbb431301694f677c0fb35823b49f6ffd40922fc30d8b909c4180c5471e6d2d8c0a183daddcd36098"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "easymock \
mvn-org.easymock-easymock \
mvn-org.easymock-easymock-parent-pom- \
mvn-org.easymock-easymock-pom- \
mvn-org.easymock-easymock-test-java8 \
mvn-org.easymock-easymock-test-java8-pom- \
mvn-org.easymock-easymock-test-testng \
mvn-org.easymock-easymock-test-testng-pom- \
osgi-org.easymock"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-cglib-cglib \
mvn-org.objenesis-objenesis \
mvn-org.ow2.asm-asm"

inherit rpm
