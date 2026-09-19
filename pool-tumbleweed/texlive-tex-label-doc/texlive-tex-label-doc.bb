SUMMARY = "Documentation for texlive-tex-label"
DESCRIPTION = "This package includes the documentation for texlive-tex-label"
LICENSE = "LPPL-1.0"

PV = "2026.227.svn16372"

RPM_NAME = "texlive-tex-label-doc-2026.227.svn16372-62.2.noarch.rpm"
RPM_HASH = "908d162819a36a158d33856079e81c3445407d3374d06d73a047a2c71baeef378aaba8a6e578bce427434046b6ad73322457fb6918b6ab3a43e82e6654a9f04f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex-label-doc"

RDEPENDS:${PN} += ""

inherit rpm
