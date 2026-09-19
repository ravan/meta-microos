SUMMARY = "Documentation for texlive-mathtools"
DESCRIPTION = "This package includes the documentation for texlive-mathtools"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.31svn77682"

RPM_NAME = "texlive-mathtools-doc-2026.226.1.31svn77682-59.2.noarch.rpm"
RPM_HASH = "7c0ec3720226d55efd2542e490bae7729409d3a8b5cbf79abb0699877d1ba9fcb0bb9985fadc713129baef12885b863ddcbc5e8dd787ded9a8d51c8e97748c48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathtools-doc"

RDEPENDS:${PN} += ""

inherit rpm
