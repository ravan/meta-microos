SUMMARY = "Documentation for texlive-xetex-itrans"
DESCRIPTION = "This package includes the documentation for texlive-xetex-itrans"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.2svn55475"

RPM_NAME = "texlive-xetex-itrans-doc-2026.226.4.2svn55475-59.4.noarch.rpm"
RPM_HASH = "6191b8229c7725c4c78fccd87005f6156740d912d88f741e483b021e9c0a8256a0f132d28f014e4582885c882056e674298f61d88691c9e56a715893be98fe44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xetex-itrans-doc"

RDEPENDS:${PN} += ""

inherit rpm
