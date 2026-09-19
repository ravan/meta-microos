SUMMARY = "Documentation for texlive-randomlist"
DESCRIPTION = "This package includes the documentation for texlive-randomlist"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn76924"

RPM_NAME = "texlive-randomlist-doc-2026.226.1.3svn76924-60.4.noarch.rpm"
RPM_HASH = "b45933a89bd9040b715f7e11dcdafb95350a5deff2fca6da1ed79a517144a44bdaf5a21d73be1b43f3d833435939c21fc0258ee640cb1271219597a54dfdbce6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-randomlist-doc"

RDEPENDS:${PN} += ""

inherit rpm
