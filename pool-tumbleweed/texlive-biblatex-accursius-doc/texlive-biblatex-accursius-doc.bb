SUMMARY = "Documentation for texlive-biblatex-accursius"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-accursius"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn72942"

RPM_NAME = "texlive-biblatex-accursius-doc-2026.226.1.0svn72942-61.2.noarch.rpm"
RPM_HASH = "cac88e5428b602f059a00b4e85b00d19b6b57848b06bce8bc57de33e9c0b291f8b9d225ae5453c493511d1792d7294a63b76fd60c3d0b4d4b34474e8dae9979e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-accursius-doc"

RDEPENDS:${PN} += ""

inherit rpm
