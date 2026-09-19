SUMMARY = "Documentation for texlive-luaprogtable"
DESCRIPTION = "This package includes the documentation for texlive-luaprogtable"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn56113"

RPM_NAME = "texlive-luaprogtable-doc-2026.226.1.0svn56113-59.2.noarch.rpm"
RPM_HASH = "e400ed6a4232efd6a78d89e2f3ac81d6ab4c06a3a293644bf3b00023215bdfbdb337f004cbf71fd7b60c10d40602c025965cd58a892386ce65b2b5d36295b0c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luaprogtable-doc"

RDEPENDS:${PN} += ""

inherit rpm
