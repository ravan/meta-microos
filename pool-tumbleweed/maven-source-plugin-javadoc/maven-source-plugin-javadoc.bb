SUMMARY = "Javadoc for maven-source-plugin"
DESCRIPTION = "API documentation for maven-source-plugin."
LICENSE = "Apache-2.0"

PV = "3.4.0"

RPM_NAME = "maven-source-plugin-javadoc-3.4.0-1.3.noarch.rpm"
RPM_HASH = "95108d8c7296d037b0027a1aba487e22628789f76d6588ea567bf8bfc9caebc7e66c4afbe65aebe9bc77e82e16fdcc0e90f4983c99cd028e0978075dc11a36ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-source-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
