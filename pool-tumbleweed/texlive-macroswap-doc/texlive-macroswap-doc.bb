SUMMARY = "Documentation for texlive-macroswap"
DESCRIPTION = "This package includes the documentation for texlive-macroswap"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn31498"

RPM_NAME = "texlive-macroswap-doc-2026.226.1.1svn31498-59.2.noarch.rpm"
RPM_HASH = "6b27f058c1d71b3227710fbdb4d4946f38fb7ecc7c4a16fd2e510d1b7d847358c02ac4a1102c14aafa1a8586c96b6f33ef928834add3bc695dc581ee24cf2176"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-macroswap-doc"

RDEPENDS:${PN} += ""

inherit rpm
