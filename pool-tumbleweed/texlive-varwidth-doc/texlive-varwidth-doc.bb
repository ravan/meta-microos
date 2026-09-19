SUMMARY = "Documentation for texlive-varwidth"
DESCRIPTION = "This package includes the documentation for texlive-varwidth"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.92svn77682"

RPM_NAME = "texlive-varwidth-doc-2026.226.0.0.92svn77682-60.2.noarch.rpm"
RPM_HASH = "56fa28514c2d8fdf9b3673ae6fb20739ca0e56d434f4882522a9213886bea607e232970df0b6bb593bcbe89ebb0273958a5038cd575ac823e436acb7ba1892f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-varwidth-doc"

RDEPENDS:${PN} += ""

inherit rpm
