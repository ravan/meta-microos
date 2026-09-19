SUMMARY = "Documentation for texlive-textcase"
DESCRIPTION = "This package includes the documentation for texlive-textcase"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.05svn77682"

RPM_NAME = "texlive-textcase-doc-2026.227.1.05svn77682-62.2.noarch.rpm"
RPM_HASH = "93540571fc2c187af0f5ad9a98a5b6030981210ecca000f3f7fda2b425e5ff107c37867e520c098a83be62f4546769a48ab195908b7fd0ddb07bc3810e3e28d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-textcase-doc"

RDEPENDS:${PN} += ""

inherit rpm
