SUMMARY = "Documentation for texlive-ucsmonograph"
DESCRIPTION = "This package includes the documentation for texlive-ucsmonograph"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3.0svn52698"

RPM_NAME = "texlive-ucsmonograph-doc-2026.226.1.3.0svn52698-60.2.noarch.rpm"
RPM_HASH = "a156b3b00d84a4f8ea9f9847036efbe33c2c5816d75c98173c1ae108c3ff765c254552e9bcfd88cc35207f6a7d2c13df69a30f37559c87161f895ee1320fa889"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ucsmonograph-doc-pt-BR \
texlive-ucsmonograph-doc"

RDEPENDS:${PN} += ""

inherit rpm
