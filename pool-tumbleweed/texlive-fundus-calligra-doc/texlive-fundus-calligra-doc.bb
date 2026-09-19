SUMMARY = "Documentation for texlive-fundus-calligra"
DESCRIPTION = "This package includes the documentation for texlive-fundus-calligra"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn77682"

RPM_NAME = "texlive-fundus-calligra-doc-2026.226.1.2svn77682-60.2.noarch.rpm"
RPM_HASH = "da8116831dc3e6bab15cd8ab0897376e4cefda8cc1c7162675be88ee251921d26bba41d28dc8128ae1377fe8fe8686ae277927fc914d62e468ffda08f547b6e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fundus-calligra-doc"

RDEPENDS:${PN} += ""

inherit rpm
