SUMMARY = "Documentation for texlive-xetexfontinfo"
DESCRIPTION = "This package includes the documentation for texlive-xetexfontinfo"
LICENSE = "Apache-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-xetexfontinfo-doc-2026.226.svn15878-59.4.noarch.rpm"
RPM_HASH = "6f6864b77cc65a3666e5b06c698251c29090450f81d8f81b9faa627b13684a5a9016b8874f74571f00505710e9ee63c0b3547fc593cb13b1d4e10fc4be071edd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xetexfontinfo-doc"

RDEPENDS:${PN} += ""

inherit rpm
