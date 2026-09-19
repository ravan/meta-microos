SUMMARY = "Documentation for texlive-showdim"
DESCRIPTION = "This package includes the documentation for texlive-showdim"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn78101"

RPM_NAME = "texlive-showdim-doc-2026.226.1.2svn78101-60.2.noarch.rpm"
RPM_HASH = "62d33019d30e58c4ade2c6bfcbf5b65f504d4e1f7545d4b2df15a46b9a415d9d1fed00cb1438ff6071355238e064d98bb493aa22ad6f2a3067757f56b0664386"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-showdim-doc"

RDEPENDS:${PN} += ""

inherit rpm
