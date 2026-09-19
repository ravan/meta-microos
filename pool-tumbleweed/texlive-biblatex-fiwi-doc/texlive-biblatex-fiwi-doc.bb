SUMMARY = "Documentation for texlive-biblatex-fiwi"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-fiwi"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7svn45876"

RPM_NAME = "texlive-biblatex-fiwi-doc-2026.226.1.7svn45876-61.2.noarch.rpm"
RPM_HASH = "ce0bf31c4e394918b795673151dd5663374ae4ac6469db2c05c9c5e97719e819df0c2ec3449d8c9d4ad1521aea38694be08e474cbfe8899d791ae0757bdf43e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-biblatex-fiwi-doc-de \
texlive-biblatex-fiwi-doc"

RDEPENDS:${PN} += ""

inherit rpm
