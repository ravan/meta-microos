SUMMARY = "Jackson-JAXRS-XML"
DESCRIPTION = "Functionality to handle Smile XML input/output for JAX-RS implementations \
(like Jersey and RESTeasy) using standard Jackson data binding."
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-jaxrs-xml-provider-2.18.9-1.1.noarch.rpm"
RPM_HASH = "98474937eec110e1df83bdebbdbd1795dc245e81045ce358928a8ba1850a1b905fc0585a4a1e6d5eaf2fc638eabf2d4fc8c6ee887a3939f03b6e3e520dab3a9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-jaxrs-xml-provider \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-xml-provider \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-xml-provider-pom- \
osgi-com.fasterxml.jackson.jaxrs.jackson-jaxrs-xml-provider"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformat-xml \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-base \
mvn-com.fasterxml.jackson.module-jackson-module-jaxb-annotations \
mvn-com.fasterxml.woodstox-woodstox-core \
mvn-org.codehaus.woodstox-stax2-api"

inherit rpm
