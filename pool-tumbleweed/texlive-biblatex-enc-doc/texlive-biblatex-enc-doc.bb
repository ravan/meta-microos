SUMMARY = "Documentation for texlive-biblatex-enc"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-enc"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn73019"

RPM_NAME = "texlive-biblatex-enc-doc-2026.226.1.1svn73019-61.2.noarch.rpm"
RPM_HASH = "634395cdc66dada95d0b9b7c909e945b5a30d86675337ba2f9676e7c9393bbba5ee52f3728c28810cf8f58bda712f66328588597f51515a5a2c7130980e995fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-enc-doc"

RDEPENDS:${PN} += ""

inherit rpm
