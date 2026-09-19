SUMMARY = "Documentation for texlive-fretplot"
DESCRIPTION = "This package includes the documentation for texlive-fretplot"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.3svn76337"

RPM_NAME = "texlive-fretplot-doc-2026.226.0.0.0.3svn76337-60.2.noarch.rpm"
RPM_HASH = "3093910f58865586564a244ff6cb14fb8f9ddeee6bf20fc595b18a33fb104e0a9717ace4038abaf108f65460882fc1f2aad3f1221465a0d17855591160e5e434"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fretplot-doc"

RDEPENDS:${PN} += ""

inherit rpm
