SUMMARY = "Documentation for texlive-ghab"
DESCRIPTION = "This package includes the documentation for texlive-ghab"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn29803"

RPM_NAME = "texlive-ghab-doc-2026.226.0.0.5svn29803-60.2.noarch.rpm"
RPM_HASH = "bf9fa5c478151e74b584f67587af39f22b72809239c6c25cf8275d060187dae256397ae58b79ada041ede348e977ccfe140be160a222360cdde4cb6d8785bc49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ghab-doc"

RDEPENDS:${PN} += ""

inherit rpm
