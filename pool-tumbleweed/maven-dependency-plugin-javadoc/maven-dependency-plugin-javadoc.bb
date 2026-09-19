SUMMARY = "API documentation for maven-dependency-plugin"
DESCRIPTION = "API documentation for maven-dependency-plugin."
LICENSE = "Apache-2.0"

PV = "3.11.0"

RPM_NAME = "maven-dependency-plugin-javadoc-3.11.0-1.2.noarch.rpm"
RPM_HASH = "4fff9d2ee19acde2ea1ae6718b04a13a99bda7c9cb94acf60e7d50324b38e8ddc9543ed9cf0cb7914a94f23ea32a8bbea41a7dd2d39f67ce6622c136d7172d01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-dependency-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
