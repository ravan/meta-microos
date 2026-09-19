SUMMARY = "Documentation for texlive-qtree"
DESCRIPTION = "This package includes the documentation for texlive-qtree"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1bsvn15878"

RPM_NAME = "texlive-qtree-doc-2026.226.3.1bsvn15878-60.4.noarch.rpm"
RPM_HASH = "9137232dca79025c267d277bb1a0e8581828d59977cf21a5b6c59a2d98ba44c027c75a16ef4fce44873a32f0ae8c948d299ebd051803ab623a119c54b13d2fc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-qtree-doc-en \
texlive-qtree-doc"

RDEPENDS:${PN} += ""

inherit rpm
