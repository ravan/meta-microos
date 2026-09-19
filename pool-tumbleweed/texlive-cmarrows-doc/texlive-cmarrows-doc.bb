SUMMARY = "Documentation for texlive-cmarrows"
DESCRIPTION = "This package includes the documentation for texlive-cmarrows"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9svn24378"

RPM_NAME = "texlive-cmarrows-doc-2026.226.0.0.9svn24378-60.2.noarch.rpm"
RPM_HASH = "04537fdf1fc3362481f0982cc2b850d661a55987dc72f4d261930c1e12ed7ae237c2a624dacc2d5d25e431b1ebb5975cf52c4dea8e47c5943a5b67210fba1491"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmarrows-doc"

RDEPENDS:${PN} += ""

inherit rpm
