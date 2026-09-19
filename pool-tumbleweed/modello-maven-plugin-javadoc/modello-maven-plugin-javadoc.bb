SUMMARY = "Javadoc for modello-maven-plugin"
DESCRIPTION = "API documentation for modello-maven-plugin."
LICENSE = "Apache-2.0 & MIT"

PV = "2.8.1"

RPM_NAME = "modello-maven-plugin-javadoc-2.8.1-1.1.noarch.rpm"
RPM_HASH = "31ca140e9ce545154ce2465e4ef1ba9cb07500361a1d30471ca2fedebf10e717fd7dda9bb41d8fbf9ec7986d2229c2216a3e51f39dbcaf972b4b805d48acbbb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "modello-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
