SUMMARY = "Documentation for texlive-pdflscape"
DESCRIPTION = "This package includes the documentation for texlive-pdflscape"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.14svn77682"

RPM_NAME = "texlive-pdflscape-doc-2026.226.0.0.14svn77682-58.2.noarch.rpm"
RPM_HASH = "8f6200f5b66fbdd94e8c9ccbb5da82bec493a49b1b9975a7b5e9f8c4eb5a99864e77dbd1a6719e19ddf247397d330ac164d4611ff5195644e61168b53df022e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdflscape-doc"

RDEPENDS:${PN} += ""

inherit rpm
