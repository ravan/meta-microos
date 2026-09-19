SUMMARY = "Documentation for texlive-lineno"
DESCRIPTION = "This package includes the documentation for texlive-lineno"
LICENSE = "LPPL-1.0"

PV = "2026.226.5.7svn77875"

RPM_NAME = "texlive-lineno-doc-2026.226.5.7svn77875-61.2.noarch.rpm"
RPM_HASH = "9254188f3195475de8758ee19dd66bc58190fc6fcbc48527d86c4e1563863989003a93b97bb98aba6e9accf64725b704a3033dee2161ef707a97acfa3e15eab3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lineno-doc"

RDEPENDS:${PN} += ""

inherit rpm
