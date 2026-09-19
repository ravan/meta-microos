SUMMARY = "Documentation for texlive-hypdvips"
DESCRIPTION = "This package includes the documentation for texlive-hypdvips"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.03svn77682"

RPM_NAME = "texlive-hypdvips-doc-2026.226.3.03svn77682-60.2.noarch.rpm"
RPM_HASH = "e2ed9e2139349ef66864d4e545878088be00805a0d595232d6171c78eaa3d167a34c6923de7917c54f15e230b3cf6b9e3fd73fb50a820a0a72935143f72909d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hypdvips-doc"

RDEPENDS:${PN} += ""

inherit rpm
