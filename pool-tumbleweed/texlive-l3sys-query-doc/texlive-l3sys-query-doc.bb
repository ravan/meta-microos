SUMMARY = "Documentation for texlive-l3sys-query"
DESCRIPTION = "This package includes the documentation for texlive-l3sys-query"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-l3sys-query-doc-2026.226.svn77682-63.2.noarch.rpm"
RPM_HASH = "2ccb2d207e9373ea16050233bd24a1f8d3a8a962d42569e2a0be3213bc388cab9f760a12aa39fe09be6b5d799e50a9af15794bbdbe37d49155f18facb0b6492f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-l3sys-query.1 \
texlive-l3sys-query-doc"

RDEPENDS:${PN} += ""

inherit rpm
