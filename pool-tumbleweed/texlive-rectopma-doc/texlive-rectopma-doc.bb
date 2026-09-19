SUMMARY = "Documentation for texlive-rectopma"
DESCRIPTION = "This package includes the documentation for texlive-rectopma"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn70885"

RPM_NAME = "texlive-rectopma-doc-2026.226.svn70885-60.4.noarch.rpm"
RPM_HASH = "b4acf5377dd429df5e53fa27d9af0fbaa24fd0c0174542cd1b5ed1d212f67cdf8f084d3d5436e0909d0d3ad721a67737a5501d20b22ff2c24a7a61271a075644"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rectopma-doc"

RDEPENDS:${PN} += ""

inherit rpm
