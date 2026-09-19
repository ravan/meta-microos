SUMMARY = "Documentation for texlive-citeref"
DESCRIPTION = "This package includes the documentation for texlive-citeref"
LICENSE = "BSD-3-Clause"

PV = "2026.226.1.1svn47407"

RPM_NAME = "texlive-citeref-doc-2026.226.1.1svn47407-60.2.noarch.rpm"
RPM_HASH = "4d52187b6c640766748cb54d97b5d25787fbadae8f146a9b65b3caa39aba7e3350c2ee4a6392c2528e262187bb8fb3a9a7ae68b7f22c513496a12458e2a1492a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-citeref-doc"

RDEPENDS:${PN} += ""

inherit rpm
