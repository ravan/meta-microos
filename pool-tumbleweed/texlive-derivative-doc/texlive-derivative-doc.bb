SUMMARY = "Documentation for texlive-derivative"
DESCRIPTION = "This package includes the documentation for texlive-derivative"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn77682"

RPM_NAME = "texlive-derivative-doc-2026.226.1.4svn77682-59.2.noarch.rpm"
RPM_HASH = "7e9be51e2ba697924407543a41cd91c3aca3fb285d7c2a56dea3dc2606af14ca063f6b5939d2523abb40a80f6dc8a9702c7c1f6d87c98d8217b49443085d6bb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-derivative-doc"

RDEPENDS:${PN} += ""

inherit rpm
