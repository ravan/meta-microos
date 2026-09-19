SUMMARY = "Documentation for texlive-calculator"
DESCRIPTION = "This package includes the documentation for texlive-calculator"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn77682"

RPM_NAME = "texlive-calculator-doc-2026.226.2.1svn77682-59.2.noarch.rpm"
RPM_HASH = "1ca19046c852d747867f33a8930b0aab5843695092da6f79d5e4b62154ef49b884dc27dc9581a436581312cd9fb7805749bb0912dcad647f705eeb7b41a91600"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-calculator-doc"

RDEPENDS:${PN} += ""

inherit rpm
