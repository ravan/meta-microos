SUMMARY = "Bean Validation API (JSR 349)"
DESCRIPTION = "This package contains Bean Validation (JSR-349) API."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "bean-validation-api-2.0.1-2.11.noarch.rpm"
RPM_HASH = "df793593cf68d5400db7e38502246063af620567d2a5126d324e6bdddd7594ca750c826dccb406a2eedbdcab77dddfc0be8ee132346ed45abcbaeba8dd9e34b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bean-validation-api \
mvn-javax.validation-validation-api \
mvn-javax.validation-validation-api-pom- \
osgi-javax.validation.api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
