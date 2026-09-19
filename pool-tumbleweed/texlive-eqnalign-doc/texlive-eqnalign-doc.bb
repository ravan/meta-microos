SUMMARY = "Documentation for texlive-eqnalign"
DESCRIPTION = "This package includes the documentation for texlive-eqnalign"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0asvn43278"

RPM_NAME = "texlive-eqnalign-doc-2026.226.1.0asvn43278-61.4.noarch.rpm"
RPM_HASH = "2696079acedc098d4fd4f9ba8fa720383b10a7b40bf6c21b3f04bbfde4cbe0799edf5a9f892528e2a5b0c70ea46def937aff5651023bcb2adaacc1fcb65dddcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eqnalign-doc"

RDEPENDS:${PN} += ""

inherit rpm
