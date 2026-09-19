SUMMARY = "Documentation for texlive-xreview"
DESCRIPTION = "This package includes the documentation for texlive-xreview"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn76924"

RPM_NAME = "texlive-xreview-doc-2026.226.1.0svn76924-59.4.noarch.rpm"
RPM_HASH = "6c1f8fe30d2a8f501239e380f3bd656016b666ec7c5b8e1f148dd542e02112b16e8d3d82258c22131731b36cd80b983f2cc4dc399302df70eb5ad374918595b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xreview-doc"

RDEPENDS:${PN} += ""

inherit rpm
