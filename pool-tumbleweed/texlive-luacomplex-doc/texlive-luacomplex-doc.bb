SUMMARY = "Documentation for texlive-luacomplex"
DESCRIPTION = "This package includes the documentation for texlive-luacomplex"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn68883"

RPM_NAME = "texlive-luacomplex-doc-2026.226.1.4svn68883-59.2.noarch.rpm"
RPM_HASH = "e84c675608f4cf9398e658deef78295e0d314b133818d10260b3d36010e577ba8341f68f8f3df5cd13be8c81f6f2fc94fe379d42fd6d0a59da5d3cc0a4c3617e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luacomplex-doc"

RDEPENDS:${PN} += ""

inherit rpm
