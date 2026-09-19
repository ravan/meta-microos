SUMMARY = "Documentation for texlive-pdfoverlay"
DESCRIPTION = "This package includes the documentation for texlive-pdfoverlay"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-pdfoverlay-doc-2026.226.1.3svn77682-58.2.noarch.rpm"
RPM_HASH = "3a29abc65cf28a7f7c2f49967dc89cb955490d9fc65a51aa7d1c4c8483200874a79ac90182c2f8065e9e093383298f8c88dc2db249036f8cac2ef72830f78e3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfoverlay-doc"

RDEPENDS:${PN} += ""

inherit rpm
