SUMMARY = "Mockito JUnit 5 support"
DESCRIPTION = "Mockito JUnit 5 support."
LICENSE = "MIT"

PV = "5.11.0"

RPM_NAME = "mockito-junit-jupiter-5.11.0-3.2.noarch.rpm"
RPM_HASH = "b29a3c1ae292c9290fda6a0e52598637aa858cec9f0964a65c4022d82163a1f9636b152ee4dfd4590cf5450e04644452d4e27e8f04c55197cfc76f88db62bc8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mockito-junit-jupiter \
mvn-org.mockito-mockito-junit-jupiter \
mvn-org.mockito-mockito-junit-jupiter-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mockito \
mvn-org.junit.jupiter-junit-jupiter-api \
mvn-org.mockito-mockito-core"

inherit rpm
