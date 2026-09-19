SUMMARY = "API documentation for antlr4"
DESCRIPTION = "This package contains API documentation for antlr4."
LICENSE = "BSD-3-Clause"

PV = "4.13.0"

RPM_NAME = "antlr4-javadoc-4.13.0-7.5.noarch.rpm"
RPM_HASH = "839022d4ec35681febb2635cb82a03b200e394191d23308499abd0528197a2d35a7b65518c500f32c577be3cd5c99f41bc7eae011dd7ea5a545fd43563b0c936"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "antlr4-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
