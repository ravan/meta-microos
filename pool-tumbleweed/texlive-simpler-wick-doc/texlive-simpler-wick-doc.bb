SUMMARY = "Documentation for texlive-simpler-wick"
DESCRIPTION = "This package includes the documentation for texlive-simpler-wick"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn71991"

RPM_NAME = "texlive-simpler-wick-doc-2026.226.1.0.0svn71991-60.2.noarch.rpm"
RPM_HASH = "0d174108416cd0bdf1e40038a2ca39734db7081c6f0989f081ff232b97ca5bc9332be9552b3a76efc3d5681010d0a64c13c685fade8ad13e372455d11ca7b8f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-simpler-wick-doc"

RDEPENDS:${PN} += ""

inherit rpm
