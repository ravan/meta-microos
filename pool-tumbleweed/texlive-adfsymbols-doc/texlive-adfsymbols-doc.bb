SUMMARY = "Documentation for texlive-adfsymbols"
DESCRIPTION = "This package includes the documentation for texlive-adfsymbols"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn78141"

RPM_NAME = "texlive-adfsymbols-doc-2026.226.1.5svn78141-61.2.noarch.rpm"
RPM_HASH = "b4bee9935740f264eacc8da9e79f11a68fbf4c36bc7c0c78d9f0abf73e468e6f4abb3ae90eadeb37ca5bb4a6c14ae404e7c2d3c4812b03e19bb3f90a10fc46aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-adfsymbols-doc"

RDEPENDS:${PN} += ""

inherit rpm
