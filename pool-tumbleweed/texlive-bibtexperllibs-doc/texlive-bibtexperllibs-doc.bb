SUMMARY = "Documentation for texlive-bibtexperllibs"
DESCRIPTION = "This package includes the documentation for texlive-bibtexperllibs"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.93svn76255"

RPM_NAME = "texlive-bibtexperllibs-doc-2026.226.1.93svn76255-61.2.noarch.rpm"
RPM_HASH = "28e0cf712c0fdddab72c870e8e780e25e076d60552a7fe8b4383d3439da49998373d2abe07c5d81289507976d22a55db987a6f8bed252bd9a9c8620375fab890"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-ltx2unitxt.1 \
texlive-bibtexperllibs-doc"

RDEPENDS:${PN} += ""

inherit rpm
