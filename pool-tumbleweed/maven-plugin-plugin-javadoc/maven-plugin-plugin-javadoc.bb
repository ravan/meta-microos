SUMMARY = "Javadoc for maven-plugin-plugin"
DESCRIPTION = "API documentation for maven-plugin-plugin."
LICENSE = "Apache-2.0"

PV = "4.0.0~beta3"

RPM_NAME = "maven-plugin-plugin-javadoc-4.0.0~beta3-1.1.noarch.rpm"
RPM_HASH = "b99a4214cd25712019792ab2816aebe1d8a31b18acdc62cf543c1be41d6859644079fbaf4b8cd242bbbe03f10f03cf49dbeb25cbcf4571a70abb9639426dfc8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
