SUMMARY = "Documentation for texlive-numberedblock"
DESCRIPTION = "This package includes the documentation for texlive-numberedblock"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.10svn33109"

RPM_NAME = "texlive-numberedblock-doc-2026.226.1.10svn33109-61.2.noarch.rpm"
RPM_HASH = "87169833498b3a65d10af0e2fa3192f33a4120f6a353d4200678bffab9ef8e4c39f14d59f775c2b7f43cfd086f464c8950b02b9a0fc7f145dc8bd19556017bf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-numberedblock-doc"

RDEPENDS:${PN} += ""

inherit rpm
