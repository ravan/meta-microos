SUMMARY = "Documentation for texlive-l3backend-dev"
DESCRIPTION = "This package includes the documentation for texlive-l3backend-dev"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77954"

RPM_NAME = "texlive-l3backend-dev-doc-2026.226.svn77954-63.2.noarch.rpm"
RPM_HASH = "bce9f1728da06efb832d9243df710f1d4d4f00ef76b4ab88c5d2d7c7eb9ee68e8a5d0652f508565fc24b4d2491e484cd12889e74519d0d7db7134d6f8a732071"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-l3backend-dev-doc"

RDEPENDS:${PN} += ""

inherit rpm
