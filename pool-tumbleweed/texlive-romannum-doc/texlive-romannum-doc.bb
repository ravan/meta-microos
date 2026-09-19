SUMMARY = "Documentation for texlive-romannum"
DESCRIPTION = "This package includes the documentation for texlive-romannum"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0bsvn77682"

RPM_NAME = "texlive-romannum-doc-2026.226.1.0bsvn77682-60.2.noarch.rpm"
RPM_HASH = "d77e7c458f80cb3f39c412218253b0828331a88995512f66c1899becf43f033e2e2a9ebfd294a8a9f2e87ea8373003ae80d6f4dc8273a7005bc073655894169f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-romannum-doc"

RDEPENDS:${PN} += ""

inherit rpm
