SUMMARY = "Jackson-JAXRS-CBOR"
DESCRIPTION = "Functionality to handle CBOR encoded input/output for JAX-RS implementations \
(like Jersey and RESTeasy) using standard Jackson data binding."
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-jaxrs-cbor-provider-2.18.9-1.1.noarch.rpm"
RPM_HASH = "97e75ffa6827dd8af576a5dadf30eebade43522b04ce7bd54c1be3a72cb01ad8f8cbf1767a9db2f5b509a2b9b50e4d162931de791eb8e10548ebdb2487c41230"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-jaxrs-cbor-provider \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-cbor-provider \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-cbor-provider-pom- \
osgi-com.fasterxml.jackson.jaxrs.jackson-jaxrs-cbor-provider"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformat-cbor \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-base \
mvn-com.fasterxml.jackson.module-jackson-module-jaxb-annotations"

inherit rpm
