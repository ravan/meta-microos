SUMMARY = "Documentation for texlive-makebarcode"
DESCRIPTION = "This package includes the documentation for texlive-makebarcode"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-makebarcode-doc-2026.226.1.0svn15878-59.2.noarch.rpm"
RPM_HASH = "4138cd532aaad7ae4cdbe4f4d00a0c5eee7916784303f23833135acf3e163ee798b48fca32cbb99b9e1e019258f538496d7a00512183b8c877122b02a5733ade"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-makebarcode-doc"

RDEPENDS:${PN} += ""

inherit rpm
