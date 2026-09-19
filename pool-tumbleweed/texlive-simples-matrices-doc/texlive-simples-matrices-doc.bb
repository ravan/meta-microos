SUMMARY = "Documentation for texlive-simples-matrices"
DESCRIPTION = "This package includes the documentation for texlive-simples-matrices"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn76924"

RPM_NAME = "texlive-simples-matrices-doc-2026.226.1.0.1svn76924-60.2.noarch.rpm"
RPM_HASH = "3f902ef0e3b62644a97f60cee48a6e34fedb6fcfa61a91254d6ad5ff1c2f33704bda592d34807c98343eaf9047f5c80dbe1643f45899f1786029f77fbbe6ab54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-simples-matrices-doc-fr;en \
texlive-simples-matrices-doc"

RDEPENDS:${PN} += ""

inherit rpm
