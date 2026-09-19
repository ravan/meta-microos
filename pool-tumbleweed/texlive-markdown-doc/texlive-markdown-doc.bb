SUMMARY = "Documentation for texlive-markdown"
DESCRIPTION = "This package includes the documentation for texlive-markdown"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.13.0_0_gdd212d58svn77254"

RPM_NAME = "texlive-markdown-doc-2026.226.3.13.0_0_gdd212d58svn77254-59.2.noarch.rpm"
RPM_HASH = "5f39d28cd2a39cc9b7cf7e090084e05d82de8af9943dcf2a9d7f9fd121145633d633f62dea3899d1e5cfed19b19d9419f14ef5430218583f10b9885a99b06639"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-markdown2tex.1 \
texlive-markdown-doc"

RDEPENDS:${PN} += ""

inherit rpm
