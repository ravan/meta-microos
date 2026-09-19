SUMMARY = "Documentation for texlive-glossaries-nynorsk"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-nynorsk"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn67201"

RPM_NAME = "texlive-glossaries-nynorsk-doc-2026.226.1.0svn67201-60.4.noarch.rpm"
RPM_HASH = "b04212ca62e2dc5a81f352a7d6a5267073e38076140557dafc8b5480ba301ace65b9ba8c235e5dbb4854e396e17c410ed88594521d23ad374b4905ed72abb2a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-nynorsk-doc"

RDEPENDS:${PN} += ""

inherit rpm
