SUMMARY = "Documentation for texlive-numerica"
DESCRIPTION = "This package includes the documentation for texlive-numerica"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0.0svn77682"

RPM_NAME = "texlive-numerica-doc-2026.226.3.0.0svn77682-61.2.noarch.rpm"
RPM_HASH = "ab38d3e8a4910007bd584d4efdce8dfa581d00ac98783369582b8972e9f0740a82644cfda09a8f5d0d9467993f8a879315cfb0e0c1cac020444e552b2a8022f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-numerica-doc"

RDEPENDS:${PN} += ""

inherit rpm
