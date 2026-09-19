SUMMARY = "Documentation for texlive-luaotfload"
DESCRIPTION = "This package includes the documentation for texlive-luaotfload"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.3.29svn74324"

RPM_NAME = "texlive-luaotfload-doc-2026.226.3.29svn74324-59.2.noarch.rpm"
RPM_HASH = "f6bae917c70a16738eaf2bbcd620a08b60aa16d42b9f20e079a5f4263216d5a7b8f6c70a09174c5d0d8d7acd4a61f91d52d10c7ae749fee6528c9e9bee6e2d3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-luaotfload-tool.1 \
texlive-luaotfload-doc"

RDEPENDS:${PN} += ""

inherit rpm
