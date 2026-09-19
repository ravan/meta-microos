SUMMARY = "Documentation for texlive-beamer-varbox"
DESCRIPTION = "This package includes the documentation for texlive-beamer-varbox"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76296"

RPM_NAME = "texlive-beamer-varbox-doc-2026.226.svn76296-61.2.noarch.rpm"
RPM_HASH = "310c747dc3195f85ec0f3138ec3b0b47bacf2d0df44bbbf10c01ca9d4d9d6cb9032be17169301c7ff5db2604a8baffcfbe1daaac0ea1b71be25231cc034993be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamer-varbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
