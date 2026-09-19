SUMMARY = "Documentation for texlive-svgcolor"
DESCRIPTION = "This package includes the documentation for texlive-svgcolor"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-svgcolor-doc-2026.226.1.0svn15878-64.2.noarch.rpm"
RPM_HASH = "fea32740e445922b1bb7ca29df5d3360c7ed76980e089059b0f07190e6d8cb1f906d9cd1a1e3899e6f3d50cd9a93840e5fdfde5d58718219ee67b139f0b765d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-svgcolor-doc"

RDEPENDS:${PN} += ""

inherit rpm
