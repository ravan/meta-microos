SUMMARY = "API documentation for jackson-module-jsonSchema"
DESCRIPTION = "API documentation for jackson-module-jsonSchema."
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-module-jsonSchema-javadoc-2.18.9-1.1.noarch.rpm"
RPM_HASH = "6d82110221c69fac106375b52c2641ac124c34436ff4dbf5031b4dc84d431a53194c56b52cec99d6b296619fae1ec44cd2e19de512a927af539efba7faa843ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-module-jsonSchema-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
