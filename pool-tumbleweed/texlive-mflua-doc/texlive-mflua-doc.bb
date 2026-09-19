SUMMARY = "Documentation for texlive-mflua"
DESCRIPTION = "This package includes the documentation for texlive-mflua"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77830"

RPM_NAME = "texlive-mflua-doc-2026.226.svn77830-61.2.noarch.rpm"
RPM_HASH = "3faef57e2a89cfbb3ce5f959d7b01f905a9f35429d42fe4d6d902d72d2dde93bb67ec33845d840052c51edb71cc1e4bbaf8a8570ecc86982765676b919b6ca41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-mflua.1 \
texlive-mflua-doc"

RDEPENDS:${PN} += ""

inherit rpm
