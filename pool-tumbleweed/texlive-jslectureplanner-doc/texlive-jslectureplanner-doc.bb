SUMMARY = "Documentation for texlive-jslectureplanner"
DESCRIPTION = "This package includes the documentation for texlive-jslectureplanner"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.15svn77682"

RPM_NAME = "texlive-jslectureplanner-doc-2026.226.1.15svn77682-63.2.noarch.rpm"
RPM_HASH = "279493aa8d313c43e8475e0115620a1fdec66a0ea4c4ae1bc31c01437ee4353fe3b9d6c4c50efc9a60de22c58c6a7390237ce122e751f359cc476e2d41ae327d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jslectureplanner-doc"

RDEPENDS:${PN} += ""

inherit rpm
