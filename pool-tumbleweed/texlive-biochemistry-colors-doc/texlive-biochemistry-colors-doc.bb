SUMMARY = "Documentation for texlive-biochemistry-colors"
DESCRIPTION = "This package includes the documentation for texlive-biochemistry-colors"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.00svn54512"

RPM_NAME = "texlive-biochemistry-colors-doc-2026.226.1.00svn54512-61.2.noarch.rpm"
RPM_HASH = "268908d47073952cf03a5f7cd4e702917a92d659040c687c94608bcf6f53bc675025b1d2b7c87912581bc58e241ecdf63744465d634aa07b950c454ac9c241df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biochemistry-colors-doc"

RDEPENDS:${PN} += ""

inherit rpm
