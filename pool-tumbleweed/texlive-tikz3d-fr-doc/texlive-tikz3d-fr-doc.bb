SUMMARY = "Documentation for texlive-tikz3d-fr"
DESCRIPTION = "This package includes the documentation for texlive-tikz3d-fr"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.5svn75291"

RPM_NAME = "texlive-tikz3d-fr-doc-2026.226.0.0.1.5svn75291-59.2.noarch.rpm"
RPM_HASH = "e1769c4c3a3111752e7d8fcaceabd2a82f48dd34474b1d52327188e4fb5035f5817d2ed9d2ea0c57f90e8141461ce665666509494e144f1ab28b9da21ae9621c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz3d-fr-doc"

RDEPENDS:${PN} += ""

inherit rpm
