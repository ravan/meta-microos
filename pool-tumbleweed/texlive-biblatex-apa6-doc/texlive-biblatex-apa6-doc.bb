SUMMARY = "Documentation for texlive-biblatex-apa6"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-apa6"
LICENSE = "LPPL-1.0"

PV = "2026.226.8.5svn56209"

RPM_NAME = "texlive-biblatex-apa6-doc-2026.226.8.5svn56209-61.2.noarch.rpm"
RPM_HASH = "f84dac788f1942dd868473aa37ae805d20b27c9810557ef8fe80d8a25a59eb7213c766bf8f531098bf056f1b0640576029a0180610443b913331f4d1ceb6d64e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-apa6-doc"

RDEPENDS:${PN} += ""

inherit rpm
