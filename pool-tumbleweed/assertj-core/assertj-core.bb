SUMMARY = "Library of assertions similar to fest-assert"
DESCRIPTION = "A set of strongly-typed assertions to use for unit testing \
(either with JUnit or TestNG)."
LICENSE = "Apache-2.0"

PV = "3.27.7"

RPM_NAME = "assertj-core-3.27.7-1.4.noarch.rpm"
RPM_HASH = "3b7d6c33733a6b13b62a46cbd1ec1752366559f7706668c8210a69efbbc8beee71ea3cb452e1c969e35134fc38b76a02c3d781b0c9e42460e80370112f435b1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "assertj-core \
mvn-org.assertj-assertj-bom-pom- \
mvn-org.assertj-assertj-build-pom- \
mvn-org.assertj-assertj-core \
mvn-org.assertj-assertj-core-junit4-with-opentest4j-pom- \
mvn-org.assertj-assertj-core-pom- \
mvn-org.assertj-assertj-core-testng-with-junit4-pom- \
mvn-org.assertj-assertj-core-tests-pom- \
mvn-org.assertj-assertj-guava \
mvn-org.assertj-assertj-guava-pom- \
mvn-org.assertj-assertj-guava-tests-pom- \
mvn-org.assertj-assertj-integration-tests-pom- \
mvn-org.assertj-assertj-parent-pom- \
mvn-org.assertj-assertj-performance-tests-pom- \
mvn-org.assertj-assertj-tests-pom- \
osgi-assertj-core \
osgi-assertj-guava"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-net.bytebuddy-byte-buddy"

inherit rpm
