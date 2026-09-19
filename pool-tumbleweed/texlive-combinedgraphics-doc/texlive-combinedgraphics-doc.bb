SUMMARY = "Documentation for texlive-combinedgraphics"
DESCRIPTION = "This package includes the documentation for texlive-combinedgraphics"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.2.2svn27198"

RPM_NAME = "texlive-combinedgraphics-doc-2026.226.0.0.2.2svn27198-60.2.noarch.rpm"
RPM_HASH = "c1b1e6b13d83514033a830d6cf74f542cd668591af4050e4a6e2d9af49e5ad757100d7bdb3cbdab391a1c680bbc3565e4d2b09c2194aa6bc34db435726918e4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-combinedgraphics-doc"

RDEPENDS:${PN} += ""

inherit rpm
