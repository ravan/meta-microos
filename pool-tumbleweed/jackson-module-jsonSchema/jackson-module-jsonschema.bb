SUMMARY = "Jackson module for JSON Schema 3 generation"
DESCRIPTION = "Add-on module for Jackson to support JSON Schema version 3 generation."
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-module-jsonSchema-2.18.9-1.1.noarch.rpm"
RPM_HASH = "ef4232ac852d0e56b4131df3d65c1e4c67cef70df9ed080082bbd959b9d65d12f378ab2ed3b05cde643db691f032e6c1c19f9aef584fedf0c274d41a168008c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-module-jsonSchema \
mvn-com.fasterxml.jackson.module-jackson-module-jsonSchema \
mvn-com.fasterxml.jackson.module-jackson-module-jsonSchema-pom- \
osgi-com.fasterxml.jackson.module.jackson-module-jsonSchema"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-annotations \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind \
mvn-javax.validation-validation-api"

inherit rpm
