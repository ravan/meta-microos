SUMMARY = "Documentation for texlive-biblatex-philosophy"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-philosophy"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9.8gsvn64414"

RPM_NAME = "texlive-biblatex-philosophy-doc-2026.226.1.9.8gsvn64414-61.2.noarch.rpm"
RPM_HASH = "37a124466f04df8b9b4aa003f1973ad23a47c5055056a34082cff3638304aa6d24c2fc594b99722c913775b8f57cbf6510d04f71e1fa2286a0d9f60331798596"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-philosophy-doc"

RDEPENDS:${PN} += ""

inherit rpm
