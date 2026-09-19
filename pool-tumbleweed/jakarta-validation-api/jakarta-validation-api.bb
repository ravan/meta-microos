SUMMARY = "Jakarta Validation API"
DESCRIPTION = "Jakarta Validation defines a metadata model and API for JavaBean and method validation."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "jakarta-validation-api-3.1.0-1.8.noarch.rpm"
RPM_HASH = "999cb3316c7b56500d229e4a954b037a9257733342f1b41dcdeb22b607fdd9dbd1c57ef898862e5b71ff2e879947bc3bf94b04998d7dfbd5919cc8d3decc003f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-validation-api \
mvn-jakarta.validation-jakarta.validation-api \
mvn-jakarta.validation-jakarta.validation-api-pom- \
osgi-jakarta.validation.jakarta.validation-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
