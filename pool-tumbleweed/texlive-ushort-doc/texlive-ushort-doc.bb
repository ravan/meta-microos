SUMMARY = "Documentation for texlive-ushort"
DESCRIPTION = "This package includes the documentation for texlive-ushort"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn32261"

RPM_NAME = "texlive-ushort-doc-2026.226.2.2svn32261-60.2.noarch.rpm"
RPM_HASH = "9a2e245e7159ee77b0d7a54ccc71a831f69f440a0379e9f0702fe59ce0bc77d734ca60326e52f1cba02220667662a28b493bd38a5204ab4be60d845ea5d3798e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ushort-doc"

RDEPENDS:${PN} += ""

inherit rpm
