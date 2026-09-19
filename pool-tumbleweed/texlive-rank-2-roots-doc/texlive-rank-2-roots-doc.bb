SUMMARY = "Documentation for texlive-rank-2-roots"
DESCRIPTION = "This package includes the documentation for texlive-rank-2-roots"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn75301"

RPM_NAME = "texlive-rank-2-roots-doc-2026.226.1.2svn75301-60.4.noarch.rpm"
RPM_HASH = "4f758222073bd8c5a9f66911c6508d1943d0ea19d5dcfaf7584b72c99f44a5a0c6dd0141170ce536cc6c72b4ca94dee69224c6b336a3cae1d97b6a50cffca8db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rank-2-roots-doc"

RDEPENDS:${PN} += ""

inherit rpm
