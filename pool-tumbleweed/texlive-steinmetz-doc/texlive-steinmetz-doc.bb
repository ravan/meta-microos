SUMMARY = "Documentation for texlive-steinmetz"
DESCRIPTION = "This package includes the documentation for texlive-steinmetz"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-steinmetz-doc-2026.226.1.0svn77682-64.2.noarch.rpm"
RPM_HASH = "223808112a2b986de6757ccf23e29e6c2ed6a79cbad7f7f4482f79c3b7a6d9c3b5b17789f460571d138374e1ae4313da29be46a636981978d4d945e4b519f6cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-steinmetz-doc"

RDEPENDS:${PN} += ""

inherit rpm
