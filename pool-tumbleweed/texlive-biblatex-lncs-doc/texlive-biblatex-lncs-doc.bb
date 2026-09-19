SUMMARY = "Documentation for texlive-biblatex-lncs"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-lncs"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7svn67053"

RPM_NAME = "texlive-biblatex-lncs-doc-2026.226.0.0.7svn67053-61.2.noarch.rpm"
RPM_HASH = "110cb0f3c96059bf57c6c65bbb7c025b6848a0023837e2db59913fca45c131863e7ae79f4fbb23b22756e03799b0faac58888d75c6b11192a610a0a5cda9c318"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-lncs-doc"

RDEPENDS:${PN} += ""

inherit rpm
