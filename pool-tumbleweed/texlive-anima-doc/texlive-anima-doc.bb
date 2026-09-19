SUMMARY = "Documentation for texlive-anima"
DESCRIPTION = "This package includes the documentation for texlive-anima"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn73126"

RPM_NAME = "texlive-anima-doc-2026.226.1.1svn73126-61.2.noarch.rpm"
RPM_HASH = "f10cb62c58a7861ff0a3c25d4760ccf5b4737856a9fd98ec9f30fce66f0aca79331df54479c836c54c5fcd16e80c71b2b714a4ff8baff811e6547a3ebde9d441"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-anima-doc"

RDEPENDS:${PN} += ""

inherit rpm
