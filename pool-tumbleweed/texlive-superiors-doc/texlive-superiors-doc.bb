SUMMARY = "Documentation for texlive-superiors"
DESCRIPTION = "This package includes the documentation for texlive-superiors"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn77682"

RPM_NAME = "texlive-superiors-doc-2026.226.2.0svn77682-64.2.noarch.rpm"
RPM_HASH = "7e1a9f25e3c1d6d1378cdff8bad6120ff3d5a12d18b3441a72031a6560f4917fd3d07ffbee4036e71206d0ee6b3542877ec8a622188f0b7511e0fbccfca672aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-superiors-doc"

RDEPENDS:${PN} += ""

inherit rpm
