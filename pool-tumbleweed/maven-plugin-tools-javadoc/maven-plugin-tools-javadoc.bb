SUMMARY = "Javadoc for maven-plugin-tools"
DESCRIPTION = "API documentation for maven-plugin-tools."
LICENSE = "Apache-2.0"

PV = "4.0.0~beta3"

RPM_NAME = "maven-plugin-tools-javadoc-4.0.0~beta3-1.1.noarch.rpm"
RPM_HASH = "6ee92106fe1284b67d2ffd671f0559948c4f75de7642d7a09cfc0950561df940b5c4ba16f098267b3e8a68d5636d8a89b08b63c651d758874302c8c63f9620a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-tools-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
