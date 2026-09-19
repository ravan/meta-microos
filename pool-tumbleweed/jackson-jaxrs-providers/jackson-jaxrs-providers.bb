SUMMARY = "Jackson JAX-RS providers"
DESCRIPTION = "This is a multi-module project that contains Jackson-based JAX-RS providers for \
following data formats: JSON, Smile (binary JSON), XML, CBOR (another kind of \
binary JSON), YAML."
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-jaxrs-providers-2.18.9-1.1.noarch.rpm"
RPM_HASH = "6a18d343a937e6a8aac498c428d71b15ece6f4582d933f26c7dc9cf48c470943c41ccb72dc3a6746eac38f9c6da2c9edde66a437c60ffb05a4a63fdace7b4939"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-jaxrs-providers \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-base \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-base-pom- \
osgi-com.fasterxml.jackson.jaxrs.jackson-jaxrs-base"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind"

inherit rpm
