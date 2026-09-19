SUMMARY = "Documentation for texlive-scalerel"
DESCRIPTION = "This package includes the documentation for texlive-scalerel"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.8svn77682"

RPM_NAME = "texlive-scalerel-doc-2026.226.1.8svn77682-60.2.noarch.rpm"
RPM_HASH = "cfed9c2db6412f79ff0ac7f5a7bec57d119aa64b420c1a93bdb74ca89c314940c7374175d73bb52508c3527fd20d3f18c9c2b31cff1d1731951e5a64885e23a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scalerel-doc"

RDEPENDS:${PN} += ""

inherit rpm
