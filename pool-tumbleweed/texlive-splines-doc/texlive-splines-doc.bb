SUMMARY = "Documentation for texlive-splines"
DESCRIPTION = "This package includes the documentation for texlive-splines"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn15878"

RPM_NAME = "texlive-splines-doc-2026.226.0.0.2svn15878-64.2.noarch.rpm"
RPM_HASH = "33f2f9b3503433ab6d31ab11604ba04df8fd7cfc8d3afb3d104e43225c04b4be472ef63ef5b604354cf7c9cbaa9e5b13d9336bde744e67be81be6eda5401deba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-splines-doc"

RDEPENDS:${PN} += ""

inherit rpm
