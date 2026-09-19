SUMMARY = "Documentation for texlive-tabbing"
DESCRIPTION = "This package includes the documentation for texlive-tabbing"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn59715"

RPM_NAME = "texlive-tabbing-doc-2026.226.svn59715-64.2.noarch.rpm"
RPM_HASH = "d3e331ab05ac0d0e584f74eeced9bfca38a8a84994ab7af6b1e2882103a9ea21e933b0592bbaca3ae598fa7521c393fd4ff4abe930bab56b44a4056145e05882"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tabbing-doc-en \
texlive-tabbing-doc"

RDEPENDS:${PN} += ""

inherit rpm
