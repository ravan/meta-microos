SUMMARY = "Jackson module for JSON Schema 3 generation (Jakarta APIs)"
DESCRIPTION = "Add-on module for Jackson to support JSON Schema version 3 generation. \
This module contains the newer 'jakarta' APIs"
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-module-jsonSchema-jakarta-2.18.9-1.1.noarch.rpm"
RPM_HASH = "584ccd88f86879ed8d810185c909cd7ba5868aa3622a499730f4618e51d3db5a8dd380e6e7a596b06e4aea62f6d7e63074b23471fea15affb87ea86c65cb33f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-module-jsonSchema-jakarta \
mvn-com.fasterxml.jackson.module-jackson-module-jsonSchema-jakarta \
mvn-com.fasterxml.jackson.module-jackson-module-jsonSchema-jakarta-pom- \
osgi-com.fasterxml.jackson.module.jackson-module-jsonSchema-jakarta"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-annotations \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind \
mvn-jakarta.validation-jakarta.validation-api"

inherit rpm
