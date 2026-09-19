SUMMARY = "Documentation for texlive-babel-catalan"
DESCRIPTION = "This package includes the documentation for texlive-babel-catalan"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2psvn30259"

RPM_NAME = "texlive-babel-catalan-doc-2026.226.2.2psvn30259-60.2.noarch.rpm"
RPM_HASH = "34bcab95dd17ad687bbfef58b2f9607d54661a1d26e9fe43b3e528749835d8d5b3f7f9aa1a2244658cbe19bfc3f99c5c330448a43e3feddb0f170404c605b7f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-catalan-doc"

RDEPENDS:${PN} += ""

inherit rpm
