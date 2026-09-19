SUMMARY = "Documentation for texlive-g-brief"
DESCRIPTION = "This package includes the documentation for texlive-g-brief"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.0.3svn77050"

RPM_NAME = "texlive-g-brief-doc-2026.226.4.0.3svn77050-60.2.noarch.rpm"
RPM_HASH = "69d2438ec1a0b83a681167573cd5b73df534ebea257493b6abc66044a6d3a1a7edfefabb174b2c336a70e0b8e0a78957ef3ff8340b261cc39c3ca96ec28bfbcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-g-brief-doc-de \
texlive-g-brief-doc"

RDEPENDS:${PN} += ""

inherit rpm
