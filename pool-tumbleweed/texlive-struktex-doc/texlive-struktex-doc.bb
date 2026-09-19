SUMMARY = "Documentation for texlive-struktex"
DESCRIPTION = "This package includes the documentation for texlive-struktex"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0asvn75565"

RPM_NAME = "texlive-struktex-doc-2026.226.3.0asvn75565-64.2.noarch.rpm"
RPM_HASH = "e40e697eb94561b28a3e1b693f87ff146a2a6bafd3d360023c25076d2d235e9274c02389434466e001239fc3129696549e7aa5fec92372a70b06e197884b1dcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-struktex-doc-de;en \
texlive-struktex-doc"

RDEPENDS:${PN} += "/usr/bin/texlua"

inherit rpm
