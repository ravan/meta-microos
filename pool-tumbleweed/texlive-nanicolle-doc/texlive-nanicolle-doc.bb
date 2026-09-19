SUMMARY = "Documentation for texlive-nanicolle"
DESCRIPTION = "This package includes the documentation for texlive-nanicolle"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.03ysvn56224"

RPM_NAME = "texlive-nanicolle-doc-2026.226.2.03ysvn56224-61.2.noarch.rpm"
RPM_HASH = "26b905f1c97005723aea515467f22146efe8df79201157381da3b5cc74a85fdeed1ce288e9f97cd86776a418f0d3014a2213acb97b32b22352d737c7c5c79fa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-nanicolle-doc-zh \
texlive-nanicolle-doc"

RDEPENDS:${PN} += ""

inherit rpm
