SUMMARY = "Documentation for texlive-huaz"
DESCRIPTION = "This package includes the documentation for texlive-huaz"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0svn77576"

RPM_NAME = "texlive-huaz-doc-2026.226.3.0svn77576-60.2.noarch.rpm"
RPM_HASH = "805320d0ab0f0b83f88c6508ae5b25a6a1c517255063adbc188cb6d350d80a3e8b9280eb6addb5cb21fa925b4747a76b45015686f41b7f416f7788141c2896be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-huaz-doc-hu \
texlive-huaz-doc"

RDEPENDS:${PN} += ""

inherit rpm
