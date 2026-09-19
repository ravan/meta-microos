SUMMARY = "Documentation for texlive-pst-geometrictools"
DESCRIPTION = "This package includes the documentation for texlive-pst-geometrictools"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn70953"

RPM_NAME = "texlive-pst-geometrictools-doc-2026.226.1.4svn70953-59.2.noarch.rpm"
RPM_HASH = "802ce72621beab4851b02cdc6b13e5cad7c392aff7a74e7e0fd9b88bbaae6b6ba4a57d3a679c015c22036aeff66a7b0580708599129987ae4a726cef6e4a557a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-geometrictools-doc"

RDEPENDS:${PN} += ""

inherit rpm
