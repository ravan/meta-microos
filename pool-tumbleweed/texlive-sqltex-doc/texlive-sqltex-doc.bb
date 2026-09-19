SUMMARY = "Documentation for texlive-sqltex"
DESCRIPTION = "This package includes the documentation for texlive-sqltex"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0svn72396"

RPM_NAME = "texlive-sqltex-doc-2026.226.3.0svn72396-64.2.noarch.rpm"
RPM_HASH = "6356130efa52d22d99d3471ee7b50b1eb8120a9c20d0f3ac23a067eaa9fa3eaba48f155b366466e25b19776c0c180fa7ffdc72028b18cc6b9b2fe376affa0eb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sqltex-doc"

RDEPENDS:${PN} += ""

inherit rpm
