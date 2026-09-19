SUMMARY = "Documentation for texlive-tabriz-thesis"
DESCRIPTION = "This package includes the documentation for texlive-tabriz-thesis"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.1svn51729"

RPM_NAME = "texlive-tabriz-thesis-doc-2026.227.1.1svn51729-62.2.noarch.rpm"
RPM_HASH = "03e8bcd45a9f19c99d777af2fbfc4ec5c6cd3afb30c7781ef2ee5d62120b6d1f8ee7807d9a397addf2523acbd7238e4968edec9d25c9207fe2a04639ef665298"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tabriz-thesis-doc-fa \
texlive-tabriz-thesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
