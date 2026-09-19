SUMMARY = "Documentation for texlive-babel-esperanto"
DESCRIPTION = "This package includes the documentation for texlive-babel-esperanto"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5asvn77682"

RPM_NAME = "texlive-babel-esperanto-doc-2026.226.1.5asvn77682-60.2.noarch.rpm"
RPM_HASH = "7061ec27776b91fc9d8fdfef8b7b7cebf2aafc7a58b9217c9802fbdcff614c0473a7c115fc6b3deed78736e5304db228db75440139f3f606a308dc310a88913f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-esperanto-doc"

RDEPENDS:${PN} += ""

inherit rpm
