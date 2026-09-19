SUMMARY = "Documentation for texlive-returntogrid"
DESCRIPTION = "This package includes the documentation for texlive-returntogrid"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn48485"

RPM_NAME = "texlive-returntogrid-doc-2026.226.0.0.2svn48485-60.4.noarch.rpm"
RPM_HASH = "02d92d1f8b94802384851058db597e1bef36623f4fb9007b897f6fc2595d54c1d87f814ffce3393153c8148c91f91845e98fb3442810902c0d790d9769b5873b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-returntogrid-doc"

RDEPENDS:${PN} += ""

inherit rpm
