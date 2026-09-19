SUMMARY = "Bill of Materials for Guice"
DESCRIPTION = "Guice is a dependency injection framework for Java 5 \
and above. This package provides Bill of Materials module for Guice."
LICENSE = "Apache-2.0"

PV = "6.0.0"

RPM_NAME = "guice-bom-6.0.0-3.6.noarch.rpm"
RPM_HASH = "fbe2b167eb4e8e206890fb3bcb9f0e39ef0ccb848216b6e86f7d89e8b75d4eb7befcb4223c849407843efb44718adad98dc153c7aa8292d5b7b8e09570f9b0b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guice-bom \
mvn-com.google.inject-guice-bom-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
