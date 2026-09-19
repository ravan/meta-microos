SUMMARY = "Documentation for texlive-jadetex"
DESCRIPTION = "This package includes the documentation for texlive-jadetex"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.13svn71409"

RPM_NAME = "texlive-jadetex-doc-2026.226.3.13svn71409-63.2.noarch.rpm"
RPM_HASH = "76a1ddf677e56029181345209c206ffcbec724d9a0a671e6619a74af3a927d01f90e58d286e1d323153e8911547d71e20ee92ed54e9c5c371c2b30795ec886d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-jadetex.1 \
man-pdfjadetex.1 \
texlive-jadetex-doc"

RDEPENDS:${PN} += ""

inherit rpm
