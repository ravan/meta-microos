SUMMARY = "Documentation for texlive-fullwidth"
DESCRIPTION = "This package includes the documentation for texlive-fullwidth"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn24684"

RPM_NAME = "texlive-fullwidth-doc-2026.226.0.0.1svn24684-60.2.noarch.rpm"
RPM_HASH = "4a9333b73a8571f4e6686672101623a6673c9d71f2ae190dfbb4761865aafe20eec13be2019e57b7e5bed78ae233379180957b5bba7d646a38b8fbbaf5ceabea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fullwidth-doc"

RDEPENDS:${PN} += ""

inherit rpm
