SUMMARY = "Documentation for texlive-facture-belge-simple-sans-tva"
DESCRIPTION = "This package includes the documentation for texlive-facture-belge-simple-sans-tva"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn67573"

RPM_NAME = "texlive-facture-belge-simple-sans-tva-doc-2026.226.2.1svn67573-59.2.noarch.rpm"
RPM_HASH = "f3b231fa3c634c36ec02f1380b459882040fda569522baf503cd5f17a9139b474bdef47672a9bad001d3ada69525b78fb53407c38186a21f841cbae5fc0d1921"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-facture-belge-simple-sans-tva-doc"

RDEPENDS:${PN} += ""

inherit rpm
