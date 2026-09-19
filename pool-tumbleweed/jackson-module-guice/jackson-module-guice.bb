SUMMARY = "Jackson module to make integration with Guice a bit easier"
DESCRIPTION = "This extension allows Jackson to delegate ObjectMapper creation and value \
injection to Guice when handling data bindings."
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-module-guice-2.18.9-1.1.noarch.rpm"
RPM_HASH = "35919440121151cc53b41e95cbb356f3dd6df71e569f3936e9445b12062c4aa4b640d34eefe9c7f5371807dd349676f21a55543234edf6b07b6c6880ad9e89b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-module-guice \
mvn-com.fasterxml.jackson.module-jackson-module-guice \
mvn-com.fasterxml.jackson.module-jackson-module-guice-pom- \
osgi-com.fasterxml.jackson.module.jackson-module-guice"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-annotations \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind \
mvn-com.google.inject-guice"

inherit rpm
