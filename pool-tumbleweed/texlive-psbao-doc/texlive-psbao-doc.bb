SUMMARY = "Documentation for texlive-psbao"
DESCRIPTION = "This package includes the documentation for texlive-psbao"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn55013"

RPM_NAME = "texlive-psbao-doc-2026.226.1.0svn55013-59.2.noarch.rpm"
RPM_HASH = "de8c1226608928b4e440ea64b4f41f61ec90cbd510d9b90399218b92a91fc7605062594c281a84767303aa00e1b4cd464b3e5af8efd63bcdddfa0f38978851bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-psbao-doc"

RDEPENDS:${PN} += ""

inherit rpm
