SUMMARY = "Documentation for texlive-pythonimmediate"
DESCRIPTION = "This package includes the documentation for texlive-pythonimmediate"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6.0svn76924"

RPM_NAME = "texlive-pythonimmediate-doc-2026.226.0.0.6.0svn76924-60.4.noarch.rpm"
RPM_HASH = "4ec020ebe1f65d2dd52040ab2ff361d3180b819f825e3ba227d3e92b883dcced88ab1793219b56ab6c852a1d0c9116fe5833881c8bb069ff34bc54207b8a62ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pythonimmediate-doc"

RDEPENDS:${PN} += ""

inherit rpm
