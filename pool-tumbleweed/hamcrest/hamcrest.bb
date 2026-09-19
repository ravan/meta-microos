SUMMARY = "Library of matchers for building test expressions"
DESCRIPTION = "Provides a library of matcher objects (also known as constraints or \
predicates) allowing 'match' rules to be defined declaratively, to be \
used in other frameworks. Typical scenarios include testing frameworks, \
mocking libraries and UI validation rules."
LICENSE = "BSD-3-Clause"

PV = "3.0"

RPM_NAME = "hamcrest-3.0-1.8.noarch.rpm"
RPM_HASH = "c6d8b46038fb0afa74c62f99f033e403c331cf3a1341fb0d4a48954b0448053c28afad09e697d7569224a606248670f13a935f3ac7e9e9f2aeff8e02b8354241"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hamcrest \
hamcrest-core \
mvn-org.hamcrest-hamcrest \
mvn-org.hamcrest-hamcrest-all \
mvn-org.hamcrest-hamcrest-all-pom- \
mvn-org.hamcrest-hamcrest-core \
mvn-org.hamcrest-hamcrest-core-pom- \
mvn-org.hamcrest-hamcrest-library \
mvn-org.hamcrest-hamcrest-library-pom- \
mvn-org.hamcrest-hamcrest-pom- \
osgi-org.hamcrest"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
