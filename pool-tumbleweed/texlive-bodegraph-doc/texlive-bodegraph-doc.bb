SUMMARY = "Documentation for texlive-bodegraph"
DESCRIPTION = "This package includes the documentation for texlive-bodegraph"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn72949"

RPM_NAME = "texlive-bodegraph-doc-2026.226.1.6svn72949-59.2.noarch.rpm"
RPM_HASH = "eacf6b04adf4beaf246780078f608d48ec88eb04802621e3241a512a881e8f77de3ad6280b9a272481e20de25a92facb0d3f022b2317e4c84bba3203c42a23d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bodegraph-doc"

RDEPENDS:${PN} += ""

inherit rpm
