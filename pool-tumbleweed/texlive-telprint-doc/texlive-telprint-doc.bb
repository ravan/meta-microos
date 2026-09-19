SUMMARY = "Documentation for texlive-telprint"
DESCRIPTION = "This package includes the documentation for texlive-telprint"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.12svn77682"

RPM_NAME = "texlive-telprint-doc-2026.227.1.12svn77682-62.2.noarch.rpm"
RPM_HASH = "9444d64c5fa27abc385449f7ed43ed30c800c46b6671ab6520732c9e4e32f850b9aa25de7b55dcf40e5f4d4f2bb6ccbb0c5493c195ff9feb31d49b6eab4dcc98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-telprint-doc"

RDEPENDS:${PN} += ""

inherit rpm
