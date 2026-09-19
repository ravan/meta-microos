SUMMARY = "Jackson-JAXRS-YAML"
DESCRIPTION = "Functionality to handle YAML input/output for JAX-RS implementations \
(like Jersey and RESTeasy) using standard Jackson data binding."
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-jaxrs-yaml-provider-2.18.9-1.1.noarch.rpm"
RPM_HASH = "2f71bf2f43e3ec75688bf05101b51a4f161c85248b52c8a41a83f0f172a5b0adfc510a0a54cfde1add49760b7cf1486a59b3f9e0a87b1cf380e10a93fd1fe455"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-jaxrs-yaml-provider \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-yaml-provider \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-yaml-provider-pom- \
osgi-com.fasterxml.jackson.jaxrs.jackson-jaxrs-yaml-provider"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformat-yaml \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-base \
mvn-com.fasterxml.jackson.module-jackson-module-jaxb-annotations"

inherit rpm
