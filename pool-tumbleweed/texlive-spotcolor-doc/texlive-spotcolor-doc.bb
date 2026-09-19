SUMMARY = "Documentation for texlive-spotcolor"
DESCRIPTION = "This package includes the documentation for texlive-spotcolor"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn15878"

RPM_NAME = "texlive-spotcolor-doc-2026.226.1.2svn15878-64.2.noarch.rpm"
RPM_HASH = "36b042482e2a6373143e3f50c92a1e12fa1091a7dc12ff904ebfc486921de64f17f81ec1002b8892a95b3f7da409658b4f52d01e60aff901250543dc715e6030"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-spotcolor-doc"

RDEPENDS:${PN} += ""

inherit rpm
