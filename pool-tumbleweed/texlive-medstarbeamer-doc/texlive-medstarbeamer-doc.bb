SUMMARY = "Documentation for texlive-medstarbeamer"
DESCRIPTION = "This package includes the documentation for texlive-medstarbeamer"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn38828"

RPM_NAME = "texlive-medstarbeamer-doc-2026.226.svn38828-59.2.noarch.rpm"
RPM_HASH = "48f3473b010f3c949e0e059a20abcaa231f42e472be18f7ac9b6cbeec17289e9f3684d46a8341f90269ed0f7ccb8659b267827145b2e8238e06840b3e83652a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-medstarbeamer-doc"

RDEPENDS:${PN} += ""

inherit rpm
