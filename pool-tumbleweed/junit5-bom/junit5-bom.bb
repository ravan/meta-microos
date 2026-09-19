SUMMARY = "JUnit 5 (Bill of Materials)"
DESCRIPTION = "This Bill of Materials POM can be used to ease dependency management \
when referencing multiple JUnit artifacts using Gradle or Maven."
LICENSE = "EPL-2.0"

PV = "5.14.4"

RPM_NAME = "junit5-bom-5.14.4-2.2.noarch.rpm"
RPM_HASH = "727b7442ccd26d4ab2e6400d302550df916565f3c07ebe00005c7d03bf199f4db27566dd6ef7349bef8827222088550b5c232012e8700c0265ea28f5356abf23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "junit5-bom \
mvn-org.junit-junit-bom-pom-"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
