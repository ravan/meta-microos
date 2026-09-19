SUMMARY = "Documentation for texlive-pgfkeysearch"
DESCRIPTION = "This package includes the documentation for texlive-pgfkeysearch"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn77050"

RPM_NAME = "texlive-pgfkeysearch-doc-2026.226.1.5svn77050-58.2.noarch.rpm"
RPM_HASH = "ae290c2dbf1d3628b61d6f7e3c5c12938620b552ed65c62816cd42a7d4a17ff5e34607d82dd8707b288a37088a8efc00570baf6cf6c558558bc78f014c8855d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgfkeysearch-doc"

RDEPENDS:${PN} += ""

inherit rpm
