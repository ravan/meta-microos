SUMMARY = "API documentation for antlr3"
DESCRIPTION = "API documentation for antlr3."
LICENSE = "BSD-3-Clause"

PV = "3.5.3"

RPM_NAME = "antlr3-javadoc-3.5.3-8.4.noarch.rpm"
RPM_HASH = "e0f9c510214930c8c80082b40e5811cb6728577d5d55403f90cd860b48e2def948d4dd1012457cbcba11f16a8fad27fcdee632ce9584ed24c3e2933ff2d4c61c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "antlr3-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
