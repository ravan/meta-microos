SUMMARY = "Documentation for texlive-lsc"
DESCRIPTION = "This package includes the documentation for texlive-lsc"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-lsc-doc-2026.226.svn15878-61.2.noarch.rpm"
RPM_HASH = "1d9d019b5c2fabe2a9982e429783f82fb923d974f40f7857684572de9bd1cabb3561e5ef61d73e4f7634b2bd954435d3fde8773f891cf2a8709725a9c18e9423"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lsc-doc"

RDEPENDS:${PN} += ""

inherit rpm
