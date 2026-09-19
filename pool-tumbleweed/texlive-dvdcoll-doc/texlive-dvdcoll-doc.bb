SUMMARY = "Documentation for texlive-dvdcoll"
DESCRIPTION = "This package includes the documentation for texlive-dvdcoll"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1asvn15878"

RPM_NAME = "texlive-dvdcoll-doc-2026.226.1.1asvn15878-61.4.noarch.rpm"
RPM_HASH = "c4a747e6baa622f4f6fd4c53af723fc271c461e2be77fab2d619fcb28a3b23b38c28bf1b5a10f37f6a3c861d6c2a0591fef74852d62f2f6cafbacc5f20c5a994"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-dvdcoll-doc-en;de \
texlive-dvdcoll-doc"

RDEPENDS:${PN} += ""

inherit rpm
