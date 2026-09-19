SUMMARY = "Documentation for texlive-pgf-soroban"
DESCRIPTION = "This package includes the documentation for texlive-pgf-soroban"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn32269"

RPM_NAME = "texlive-pgf-soroban-doc-2026.226.1.1svn32269-58.2.noarch.rpm"
RPM_HASH = "89ee3eaf1565b465f9bfc70bfd95501757ac8dae17d84346b4e916e2a09752e56f2f0ecb30a052f0cf30905e0c31c9b22693c230b2c4da9957e63b072f537f26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgf-soroban-doc"

RDEPENDS:${PN} += ""

inherit rpm
