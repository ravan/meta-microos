SUMMARY = "API documentation for jdependency"
DESCRIPTION = "API documentation for jdependency."
LICENSE = "Apache-2.0"

PV = "1.4"

RPM_NAME = "jdependency-javadoc-1.4-1.7.noarch.rpm"
RPM_HASH = "bffce3f3dc6ab0d0375da06683b69ce6235052b3d79fb14a0b72183942c53f021ccacbbdb6191a063bd6dcb57a54ef4c67cf3e2712093238f2b2047c1f1df9fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jdependency-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
