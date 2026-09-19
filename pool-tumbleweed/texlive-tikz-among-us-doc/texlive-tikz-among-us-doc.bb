SUMMARY = "Documentation for texlive-tikz-among-us"
DESCRIPTION = "This package includes the documentation for texlive-tikz-among-us"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.2.0svn60880"

RPM_NAME = "texlive-tikz-among-us-doc-2026.227.1.2.0svn60880-62.2.noarch.rpm"
RPM_HASH = "daa5a0a9bee06f4285ebced4e63e2d0e16ea7642f84002c82d998015490ae0964563cc82de535af33b2204d165bd1d6caad3c1d6fc293d561104af84a672998e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-among-us-doc"

RDEPENDS:${PN} += ""

inherit rpm
