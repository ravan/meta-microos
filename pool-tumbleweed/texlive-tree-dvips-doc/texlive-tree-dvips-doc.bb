SUMMARY = "Documentation for texlive-tree-dvips"
DESCRIPTION = "This package includes the documentation for texlive-tree-dvips"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.91svn21751"

RPM_NAME = "texlive-tree-dvips-doc-2026.226.0.0.91svn21751-59.2.noarch.rpm"
RPM_HASH = "a9469d1b0fb49b6c8b0268426ac3065941154e094bb257c39e6224d070c424d61671dbbb61696efb880c4173275b317b08064c239f51913cb7567983746a9f71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tree-dvips-doc"

RDEPENDS:${PN} += ""

inherit rpm
