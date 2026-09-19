SUMMARY = "AutoService Processor"
DESCRIPTION = "Provider-configuration files for ServiceLoader."
LICENSE = "Apache-2.0"

PV = "1.6.1"

RPM_NAME = "auto-service-1.6.1-3.4.noarch.rpm"
RPM_HASH = "70b48f148192cfa06e94a1f677262cb25499014c27edddb04864c42cf533145553bb6b40f9c600766a5e6b96a6e0842c8bd1a15c2bdc2c27a112e0b8faa2091b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "auto-service \
mvn-com.google.auto.service-auto-service \
mvn-com.google.auto.service-auto-service-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.auto-auto-common \
mvn-com.google.auto.service-auto-service-annotations \
mvn-com.google.guava-guava"

inherit rpm
