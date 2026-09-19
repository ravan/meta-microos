SUMMARY = "Documentation for texlive-turkmen"
DESCRIPTION = "This package includes the documentation for texlive-turkmen"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn77682"

RPM_NAME = "texlive-turkmen-doc-2026.226.0.0.2svn77682-59.2.noarch.rpm"
RPM_HASH = "d21cce5a6cedd85836e972e5d3260bb5f73a1d32fb5d940a9caa805987d416abaa9d04a883d01cdd8d5d7602b5858d01de076ed887b4313106fd7592444ab26f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-turkmen-doc"

RDEPENDS:${PN} += ""

inherit rpm
