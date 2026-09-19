SUMMARY = "Documentation for texlive-nnext"
DESCRIPTION = "This package includes the documentation for texlive-nnext"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0svn56575"

RPM_NAME = "texlive-nnext-doc-2026.226.0.0.0svn56575-61.2.noarch.rpm"
RPM_HASH = "5d19b9cf09e6c83b60140f1cddc58d72f2e01b9ba681c89a3225bcf1051e8c877ddc5cc9d8b730bc35f793cc0e6f084d59f2362b9e2038dedbed0b78cdbe1b01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nnext-doc"

RDEPENDS:${PN} += ""

inherit rpm
