SUMMARY = "Jackson-JAXRS-JSON"
DESCRIPTION = "Functionality to handle JSON input/output for JAX-RS implementations \
(like Jersey and RESTeasy) using standard Jackson data binding."
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-jaxrs-json-provider-2.18.9-1.1.noarch.rpm"
RPM_HASH = "73fb7c0559b9a8bcd3589ba87144f9b5fe2d59a88cc3f2ab1a972c4cd93cbf3bb53e440e423d23d99e271880595a2d9589f296e6f64ea18d47cb36418af654c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-jaxrs-json-provider \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-json-provider \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-json-provider-pom- \
osgi-com.fasterxml.jackson.jaxrs.jackson-jaxrs-json-provider"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-base \
mvn-com.fasterxml.jackson.module-jackson-module-jaxb-annotations"

inherit rpm
