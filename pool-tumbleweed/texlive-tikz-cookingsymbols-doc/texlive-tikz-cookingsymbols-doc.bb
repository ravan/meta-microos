SUMMARY = "Documentation for texlive-tikz-cookingsymbols"
DESCRIPTION = "This package includes the documentation for texlive-tikz-cookingsymbols"
LICENSE = "LPPL-1.0"

PV = "2026.227.2.0svn75636"

RPM_NAME = "texlive-tikz-cookingsymbols-doc-2026.227.2.0svn75636-62.2.noarch.rpm"
RPM_HASH = "5fa949495b3cc9a0dc253cb2909adf7832f33b86ba2cb418dc678face6c42fe60fcf0c7e7f88588893578cc7ad3cbe81406f77b93f1918cc5bbf36fbba4dc224"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-cookingsymbols-doc"

RDEPENDS:${PN} += ""

inherit rpm
