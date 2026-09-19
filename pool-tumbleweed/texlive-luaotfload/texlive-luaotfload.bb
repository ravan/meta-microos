SUMMARY = "OpenType 'loader' for Plain TeX and LaTeX"
DESCRIPTION = "The package adopts the TrueType/OpenType Font loader code \
provided in ConTeXt, and adapts it to use in Plain TeX and \
LaTeX. It works under LuaLaTeX only."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.3.29svn74324"

RPM_NAME = "texlive-luaotfload-2026.226.3.29svn74324-59.2.noarch.rpm"
RPM_HASH = "ff68fb6d725599ebc2008fd23d39a04c5e064b4c7c497305728bdc26b786abf67555c4d972cdb4f2afa698fdabf56ab5b3e0d31e77da9802583dc4d737fec263"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luaotfload-blacklist.cnf \
tex-luaotfload.sty \
texlive-luaotfload"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-lm \
texlive-lua-alt-getopt \
texlive-lua-uni-algos \
texlive-lualibs \
texlive-luaotfload-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
