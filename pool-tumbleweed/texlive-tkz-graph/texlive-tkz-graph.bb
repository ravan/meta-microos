SUMMARY = "Draw graph-theory graphs"
DESCRIPTION = "The package is designed to create graph diagrams as simply as \
possible, using TikZ."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn57484"

RPM_NAME = "texlive-tkz-graph-2026.226.2.0svn57484-59.2.noarch.rpm"
RPM_HASH = "cd1476960c37d65ee9cce00689b051de24869b2dfc93a01e3a32d02cff688929c4c0908000113028eac6b88b8e5d9e00bbaf5040d744f7ab97a2f4fa25abbc41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tkz-graph.sty \
texlive-tkz-graph"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etex.sty \
tex-ifthen.sty \
tex-tikz.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
