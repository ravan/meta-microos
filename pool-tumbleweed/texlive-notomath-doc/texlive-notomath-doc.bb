SUMMARY = "Documentation for texlive-notomath"
DESCRIPTION = "This package includes the documentation for texlive-notomath"
LICENSE = "OFL-1.1"

PV = "2026.226.1.031svn77682"

RPM_NAME = "texlive-notomath-doc-2026.226.1.031svn77682-61.2.noarch.rpm"
RPM_HASH = "c5a37141dd31646f92a0564bb25a41891000632a831e2156d10b29b0ce17841661d15ec06a64d4cc0f9acac69c999453ea8bce109020206fac8b9a024cf8a355"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-notomath-doc"

RDEPENDS:${PN} += ""

inherit rpm
