SUMMARY = "Parent for Jackson JAX-RS providers"
DESCRIPTION = "Parent POM for Jackson JAX-RS providers."
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-jaxrs-providers-parent-2.18.9-1.1.noarch.rpm"
RPM_HASH = "96cea76fa63eeded84bda2b88b45ffc698a719bb8b5bb690268a9e4f4d39859b106510681f6c78a388e655b8f58f0f5ced16108469ce773839d8827a4c6b3667"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-jaxrs-providers-parent \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-providers-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson-jackson-base-pom-"

inherit rpm
