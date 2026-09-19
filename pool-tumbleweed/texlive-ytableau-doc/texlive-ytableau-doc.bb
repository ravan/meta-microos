SUMMARY = "Documentation for texlive-ytableau"
DESCRIPTION = "This package includes the documentation for texlive-ytableau"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn77682"

RPM_NAME = "texlive-ytableau-doc-2026.226.1.4svn77682-59.4.noarch.rpm"
RPM_HASH = "2ac9eb63db0aeb79db58cbf09997389d7d4e2be79643b5b0719fbd25259e6cb8d3bf17ebf1e21c77c78d6707f3572e0cc3fa327f6baa36bf10e4d85237465771"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ytableau-doc"

RDEPENDS:${PN} += ""

inherit rpm
