SUMMARY = "Documentation for texlive-pats-resume"
DESCRIPTION = "This package includes the documentation for texlive-pats-resume"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn74532"

RPM_NAME = "texlive-pats-resume-doc-2026.226.svn74532-58.2.noarch.rpm"
RPM_HASH = "0dc7d215883ed1a6813762250c6be9c412c64011c5f3bba2a41627ede831ed991c59cc4da203e6d488ffbb56792c1f8be1cf341d0f54de54d2d65c345dd42277"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pats-resume-doc"

RDEPENDS:${PN} += ""

inherit rpm
