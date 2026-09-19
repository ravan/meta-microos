SUMMARY = "Documentation for texlive-luafindfont"
DESCRIPTION = "This package includes the documentation for texlive-luafindfont"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.16svn75679"

RPM_NAME = "texlive-luafindfont-doc-2026.226.0.0.16svn75679-59.2.noarch.rpm"
RPM_HASH = "7e8f0c43556881c9b0fe71b21a678455ba873b9f10e134ee784952209b78efcae0d93745ae727f3f9f6ac4e793818544ae0fd56881e13797c0d5e189bd0677d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-luafindfont.1 \
texlive-luafindfont-doc"

RDEPENDS:${PN} += ""

inherit rpm
