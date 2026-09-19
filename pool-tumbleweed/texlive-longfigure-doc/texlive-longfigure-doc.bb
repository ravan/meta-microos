SUMMARY = "Documentation for texlive-longfigure"
DESCRIPTION = "This package includes the documentation for texlive-longfigure"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn34302"

RPM_NAME = "texlive-longfigure-doc-2026.226.1.0svn34302-61.2.noarch.rpm"
RPM_HASH = "b2494acc0e6be14a71f6dd2c6596c9a00b8e478336e3773817655ff7fb8d3846a1c27405816d656985b4a2b2b7cbe20cdef38472f28b692d99d844ed097cf901"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-longfigure-doc"

RDEPENDS:${PN} += ""

inherit rpm
