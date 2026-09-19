SUMMARY = "Documentation for texlive-hep-paper"
DESCRIPTION = "This package includes the documentation for texlive-hep-paper"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.4svn76220"

RPM_NAME = "texlive-hep-paper-doc-2026.226.2.4svn76220-60.4.noarch.rpm"
RPM_HASH = "27b1d31931d390fb6c8d3f6e9563b7de77d9b3b7c3f7e47bc23d00faa828f0c699c682f2569ce74943484f8a31949c919761041c40cfc0e39e2207448ce93e12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-paper-doc"

RDEPENDS:${PN} += ""

inherit rpm
