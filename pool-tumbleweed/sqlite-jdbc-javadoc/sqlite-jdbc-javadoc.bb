SUMMARY = "API documentation for sqlite-jdbc"
DESCRIPTION = "API documentation for sqlite-jdbc."
LICENSE = "Apache-2.0"

PV = "3.53.4.0"

RPM_NAME = "sqlite-jdbc-javadoc-3.53.4.0-1.1.noarch.rpm"
RPM_HASH = "151e86bb2855b995d574082741e5c75ab1201cb6be50509ea0b300bdee579af403b347e6382c19f22e8e5a0744cb7770342b3d9a0ce6082d33f3c8b66fbd5431"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sqlite-jdbc-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
