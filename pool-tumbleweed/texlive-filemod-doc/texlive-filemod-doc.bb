SUMMARY = "Documentation for texlive-filemod"
DESCRIPTION = "This package includes the documentation for texlive-filemod"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn77682"

RPM_NAME = "texlive-filemod-doc-2026.226.1.2svn77682-59.2.noarch.rpm"
RPM_HASH = "2f780a993a12904b4a65dd71ecf72e866de816706d466d5c88afe70d3918850bc28ebf82d491f38bd52a2f173a188df53b260c93616c858d415e01a8ff3e5e23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-filemod-doc"

RDEPENDS:${PN} += ""

inherit rpm
