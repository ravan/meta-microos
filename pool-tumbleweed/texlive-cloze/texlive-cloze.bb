SUMMARY = "A LuaLaTeX package for creating cloze texts"
DESCRIPTION = "This is a LuaTeX or LuaLaTeX package for generating cloze \
texts. The main feature of the package is that the formatting \
doesn't change when using the hide and show options. There are \
the commands \\cloze, \\clozefix, \\clozefil, \\clozenol, \
\\clozestrike and the environments clozepar and clozebox to \
generate cloze texts."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.0svn75681"

RPM_NAME = "texlive-cloze-2026.226.2.0.0svn75681-60.2.noarch.rpm"
RPM_HASH = "7f8b6868ee5048a112ed554f8d251c132c325fda7a460e2df23281a85757b1f88c154d13360f7ffab60d6517287076bff4c5c1d951df642a2c975b64379fccef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cloze-doc.tex \
tex-cloze.sty \
tex-cloze.tex \
texlive-cloze"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-luakeys.sty \
tex-setspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
