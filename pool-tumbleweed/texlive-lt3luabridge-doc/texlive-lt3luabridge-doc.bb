SUMMARY = "Documentation for texlive-lt3luabridge"
DESCRIPTION = "This package includes the documentation for texlive-lt3luabridge"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2.2svn76924"

RPM_NAME = "texlive-lt3luabridge-doc-2026.226.2.2.2svn76924-59.2.noarch.rpm"
RPM_HASH = "135a6d3f20a956936ab921b3ade26f027643af0c5942f474417b67c29a3cce015ef2218a09f5b9e6885930feee2adf2b310ea9290a248cd460b117e619a1a8ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lt3luabridge-doc"

RDEPENDS:${PN} += ""

inherit rpm
