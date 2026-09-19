SUMMARY = "Documentation for texlive-curve"
DESCRIPTION = "This package includes the documentation for texlive-curve"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.16svn20745"

RPM_NAME = "texlive-curve-doc-2026.226.1.16svn20745-61.2.noarch.rpm"
RPM_HASH = "aff92e01a295221f09a3ae0f657f3909e9c2fcb66079e33e0c436fff71bb9183d9b97747d78d1b679f4287fb0ff1dcc1ba54955d86bb67c4aea3d0ff9dc00230"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-curve-doc"

RDEPENDS:${PN} += ""

inherit rpm
