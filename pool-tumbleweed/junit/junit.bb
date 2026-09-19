SUMMARY = "Java regression test package"
DESCRIPTION = "JUnit is a regression testing framework written by Erich Gamma and Kent Beck. \
It is used by the developer who implements unit tests in Java."
LICENSE = "EPL-1.0"

PV = "4.13.2"

RPM_NAME = "junit-4.13.2-8.9.noarch.rpm"
RPM_HASH = "a126294921f8cd64ea716397936e8f6f3931da334b0c6da5dc1481d4ece400f0f415a25b99f2b60d9906b6779bc0e261da93284a489ebc4c8cce2422340b0bff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "junit \
junit-demo \
junit4 \
junit4-demo \
mvn-junit-junit \
mvn-junit-junit-pom- \
osgi-org.junit"

RDEPENDS:${PN} += "hamcrest \
java-headless \
javapackages-filesystem \
mvn-org.hamcrest-hamcrest-core"

inherit rpm
