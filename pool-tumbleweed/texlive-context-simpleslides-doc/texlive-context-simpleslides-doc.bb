SUMMARY = "Documentation for texlive-context-simpleslides"
DESCRIPTION = "This package includes the documentation for texlive-context-simpleslides"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn67070"

RPM_NAME = "texlive-context-simpleslides-doc-2026.226.svn67070-61.2.noarch.rpm"
RPM_HASH = "d288464e2fffc3c400a4aa8ab7fa8780a831e1a4b3c2336d25bb6e8da460b235319b1c696455cbb152ac64bb900a9907fec9c38a1194f34058a13ec0b56ffa0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-simpleslides-doc"

RDEPENDS:${PN} += ""

inherit rpm
