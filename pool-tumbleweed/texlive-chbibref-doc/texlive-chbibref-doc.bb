SUMMARY = "Documentation for texlive-chbibref"
DESCRIPTION = "This package includes the documentation for texlive-chbibref"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn17120"

RPM_NAME = "texlive-chbibref-doc-2026.226.1.0svn17120-60.2.noarch.rpm"
RPM_HASH = "15e0ad82d7b5f22d315cca4d3194f7382c5da177ec134a9e717d4fbdbd849a4755d9b59db0f3326b2107ae60829fc30b0a1e271d761ec20def8294e9267e49d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chbibref-doc"

RDEPENDS:${PN} += ""

inherit rpm
