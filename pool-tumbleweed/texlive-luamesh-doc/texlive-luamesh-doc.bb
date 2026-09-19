SUMMARY = "Documentation for texlive-luamesh"
DESCRIPTION = "This package includes the documentation for texlive-luamesh"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7svn77682"

RPM_NAME = "texlive-luamesh-doc-2026.226.0.0.7svn77682-59.2.noarch.rpm"
RPM_HASH = "020487cabe8ec7ab8bca89e18e8e05a9ee4f4c3ecd2bfa8692c7d6bd4ef5d00c3402d3f8ef9767e3228896f30b5cad8b2283bac738b78a7f49db7593cfc3a13e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luamesh-doc"

RDEPENDS:${PN} += ""

inherit rpm
