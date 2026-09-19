SUMMARY = "Documentation for texlive-scrwfile"
DESCRIPTION = "This package includes the documentation for texlive-scrwfile"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.99svn77682"

RPM_NAME = "texlive-scrwfile-doc-2026.226.0.0.1.99svn77682-60.2.noarch.rpm"
RPM_HASH = "121f8813c8f4345ee2a43eb8ea5061979a02d0c278b077d970b3e80fbd789df798f2cd50ca076b7fddcf935df8e72dcd8328485ae8b61fc9de033dbf9a9f6f0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scrwfile-doc"

RDEPENDS:${PN} += ""

inherit rpm
