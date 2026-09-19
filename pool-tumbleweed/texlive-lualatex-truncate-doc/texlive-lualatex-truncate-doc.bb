SUMMARY = "Documentation for texlive-lualatex-truncate"
DESCRIPTION = "This package includes the documentation for texlive-lualatex-truncate"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn67201"

RPM_NAME = "texlive-lualatex-truncate-doc-2026.226.1.1svn67201-59.2.noarch.rpm"
RPM_HASH = "cf32a896e5d4a4f70d06375a28f30253bd64dc38e579e121f4e0cd2bae0692f1961791858b1772669fa142c590dd553a03988f65ead95314261ac4ad9278b0a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lualatex-truncate-doc"

RDEPENDS:${PN} += ""

inherit rpm
