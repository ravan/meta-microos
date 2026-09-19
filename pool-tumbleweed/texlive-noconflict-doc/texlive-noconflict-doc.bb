SUMMARY = "Documentation for texlive-noconflict"
DESCRIPTION = "This package includes the documentation for texlive-noconflict"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn30140"

RPM_NAME = "texlive-noconflict-doc-2026.226.1.0svn30140-61.2.noarch.rpm"
RPM_HASH = "13c376603e6dacbebfcf5a0daedbdd5744a37b26c0515e950dd4e5eaa735ba7c3c39526d569cf4a7e24235293e8cd80255f0ddbf1f41574f6abb5470a16e67ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-noconflict-doc"

RDEPENDS:${PN} += ""

inherit rpm
