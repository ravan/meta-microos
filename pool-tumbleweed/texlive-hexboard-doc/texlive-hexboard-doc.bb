SUMMARY = "Documentation for texlive-hexboard"
DESCRIPTION = "This package includes the documentation for texlive-hexboard"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn62102"

RPM_NAME = "texlive-hexboard-doc-2026.226.1.0svn62102-60.4.noarch.rpm"
RPM_HASH = "1020a38ff3d866a54d8c061e9daaad1a3bb19c589ccea7853dd55c4f292460d7c661524d18d15e9edcf9ede9fee61209fb6cc3b54e9d654b38d26fcd921bdefb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hexboard-doc"

RDEPENDS:${PN} += ""

inherit rpm
