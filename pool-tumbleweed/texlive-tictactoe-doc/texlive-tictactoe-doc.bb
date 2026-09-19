SUMMARY = "Documentation for texlive-tictactoe"
DESCRIPTION = "This package includes the documentation for texlive-tictactoe"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.0svn75712"

RPM_NAME = "texlive-tictactoe-doc-2026.227.1.0svn75712-62.2.noarch.rpm"
RPM_HASH = "634527607dd64ef05ea76d0ce5ef64ac1cbdf3420a4e85a50be7b45ac06edb2fad8a3956d8a640dea73f992ca3b868b5a6db67d9f87ea2c44c49dd180169c454"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tictactoe-doc"

RDEPENDS:${PN} += ""

inherit rpm
