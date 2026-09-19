SUMMARY = "Java JWT"
DESCRIPTION = "Java implementation of JSON Web Token (JWT)"
LICENSE = "MIT"

PV = "4.4.0"

RPM_NAME = "java-jwt-4.4.0-1.8.noarch.rpm"
RPM_HASH = "f0c9227cb625495e6b98e8cbb71c9f8a545f6ad96f3c7d9c6499d47d52a311ef86bec2d65498a48f7ef0402f68d84fec9298908e308f87c8d1d8571376782fbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-jwt \
mvn-com.auth0-java-jwt \
mvn-com.auth0-java-jwt-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-databind"

inherit rpm
