SUMMARY = "Documentation for texlive-invoice-class"
DESCRIPTION = "This package includes the documentation for texlive-invoice-class"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn49749"

RPM_NAME = "texlive-invoice-class-doc-2026.226.1.0svn49749-60.2.noarch.rpm"
RPM_HASH = "c3b9e10f9073b3c651ce5fe79086fa2cf88394def5db876fcbfa690630b6befc6c014791c8c5d638a52d61821fe9ac758122d1fd149e7433804c5bd83c07dcd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-invoice-class-doc"

RDEPENDS:${PN} += ""

inherit rpm
