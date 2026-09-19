SUMMARY = "Documentation for texlive-cleveref-forward"
DESCRIPTION = "This package includes the documentation for texlive-cleveref-forward"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76924"

RPM_NAME = "texlive-cleveref-forward-doc-2026.226.svn76924-60.2.noarch.rpm"
RPM_HASH = "6396aaa6f68cd02f90288cb0527e88e439c2944e8f481b624ecbc9f60c5b5d4a50b8813b1a85f6d1148d2236ce7d32f0f037bc68e6b2abe032207cce0e7ca3bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cleveref-forward-doc"

RDEPENDS:${PN} += ""

inherit rpm
