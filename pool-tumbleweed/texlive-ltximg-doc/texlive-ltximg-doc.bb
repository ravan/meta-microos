SUMMARY = "Documentation for texlive-ltximg"
DESCRIPTION = "This package includes the documentation for texlive-ltximg"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.1svn59335"

RPM_NAME = "texlive-ltximg-doc-2026.226.2.1svn59335-59.2.noarch.rpm"
RPM_HASH = "2e382055d3b0f6eb8f27203f5c4068e5a4ad9ac02b37478c6e829fb7a7c5a16fa2b7cca1d5b58e931362071b19312ab8e507ba2278850d5d830ea40bb63ddb35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-ltximg.1 \
texlive-ltximg-doc"

RDEPENDS:${PN} += ""

inherit rpm
