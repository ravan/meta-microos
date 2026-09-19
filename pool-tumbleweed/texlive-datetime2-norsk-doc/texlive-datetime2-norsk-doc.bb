SUMMARY = "Documentation for texlive-datetime2-norsk"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-norsk"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn48267"

RPM_NAME = "texlive-datetime2-norsk-doc-2026.226.1.1svn48267-59.2.noarch.rpm"
RPM_HASH = "80210af4c2f49e79449d7607aca1c10f0526d49377eb95fec2aa0dcf31300c613271bfa67fc3baff843308f530fc967c41dbc09500533e0d1296011b745d22c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-norsk-doc"

RDEPENDS:${PN} += ""

inherit rpm
