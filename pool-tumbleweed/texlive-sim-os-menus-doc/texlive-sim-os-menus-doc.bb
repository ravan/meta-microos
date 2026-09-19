SUMMARY = "Documentation for texlive-sim-os-menus"
DESCRIPTION = "This package includes the documentation for texlive-sim-os-menus"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.9svn75975"

RPM_NAME = "texlive-sim-os-menus-doc-2026.226.0.0.1.9svn75975-60.2.noarch.rpm"
RPM_HASH = "9422bc79a25a5d145c2fc23672c07cbced45e15bfe59f68b66f9d20fb844124eae329a098bf019d3e587ac88d3bbd0cc9bfa278ad84eef932de287226634c12f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sim-os-menus-doc"

RDEPENDS:${PN} += ""

inherit rpm
