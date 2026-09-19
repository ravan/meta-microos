SUMMARY = "Documentation for texlive-pas-cours"
DESCRIPTION = "This package includes the documentation for texlive-pas-cours"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9svn55859"

RPM_NAME = "texlive-pas-cours-doc-2026.226.1.9svn55859-58.2.noarch.rpm"
RPM_HASH = "122c06dc1fff0fab8b0772f766f3dfc91959bc1dfbcef94d0d547041bcc06d27d5ad0ebae189157b5f857361a5972f8607597030db64e354869c1d50457a2f85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pas-cours-doc"

RDEPENDS:${PN} += ""

inherit rpm
