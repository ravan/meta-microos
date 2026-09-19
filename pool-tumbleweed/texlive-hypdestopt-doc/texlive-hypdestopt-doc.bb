SUMMARY = "Documentation for texlive-hypdestopt"
DESCRIPTION = "This package includes the documentation for texlive-hypdestopt"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.9svn77682"

RPM_NAME = "texlive-hypdestopt-doc-2026.226.2.9svn77682-60.2.noarch.rpm"
RPM_HASH = "331a0e21f68543e9f91dbcd65e067f5c1c0d1dc0e1d7e92396a879908169413195a06e9d6e78563a0c2a111f01ef997d1e67f8fe4313945b44be8857b9ecdeb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hypdestopt-doc-en \
texlive-hypdestopt-doc"

RDEPENDS:${PN} += ""

inherit rpm
