SUMMARY = "Documentation for texlive-minim-mp"
DESCRIPTION = "This package includes the documentation for texlive-minim-mp"
LICENSE = "LPPL-1.0"

PV = "2026.226.2025_1.7svn73816"

RPM_NAME = "texlive-minim-mp-doc-2026.226.2025_1.7svn73816-61.2.noarch.rpm"
RPM_HASH = "d6e62787cec4e0049e11c532d1282fe3c588e00068735818e086a790daa988dbb2184a09819e9f37c0bae87313c6048b43605dc9cc730bca0f8bcbcc764bb88d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-minim-mp-doc"

RDEPENDS:${PN} += ""

inherit rpm
