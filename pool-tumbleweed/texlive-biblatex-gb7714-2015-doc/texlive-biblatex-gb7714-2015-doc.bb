SUMMARY = "Documentation for texlive-biblatex-gb7714-2015"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-gb7714-2015"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1vsvn75481"

RPM_NAME = "texlive-biblatex-gb7714-2015-doc-2026.226.1.1vsvn75481-61.2.noarch.rpm"
RPM_HASH = "804d826580f3fb4fbdb202625e042182e1248c1a56693631144f61a2de402065b424fd83c77ca9bd228cdd1be830703eb7596c5c343d74bbd8c03a13fb08b527"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-biblatex-gb7714-2015-doc-zh \
texlive-biblatex-gb7714-2015-doc"

RDEPENDS:${PN} += ""

inherit rpm
