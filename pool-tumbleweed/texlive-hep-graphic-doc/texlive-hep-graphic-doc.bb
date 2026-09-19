SUMMARY = "Documentation for texlive-hep-graphic"
DESCRIPTION = "This package includes the documentation for texlive-hep-graphic"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn76790"

RPM_NAME = "texlive-hep-graphic-doc-2026.226.1.4svn76790-60.4.noarch.rpm"
RPM_HASH = "531eacfb30eeb7ee91f5394a076e49dd9c9c715e03209a5df5d2485019a30d3c4faf7e9571efb3aa02a387c3758ad1965d64026babf749e638c28a8e7fdd5cb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-graphic-doc"

RDEPENDS:${PN} += ""

inherit rpm
