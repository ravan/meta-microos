SUMMARY = "Documentation for texlive-cfr-initials"
DESCRIPTION = "This package includes the documentation for texlive-cfr-initials"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.01svn75712"

RPM_NAME = "texlive-cfr-initials-doc-2026.226.1.01svn75712-59.2.noarch.rpm"
RPM_HASH = "67404d724dfcfc6b9e4af011e3a690ed7415138a8321fa6d3ad59284eac2f508e08c98e3daa80636d0b926b668355696ad3d1e2f59006df62dfbf2a9a050270f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cfr-initials-doc"

RDEPENDS:${PN} += ""

inherit rpm
