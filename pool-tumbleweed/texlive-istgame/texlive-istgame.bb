SUMMARY = "Draw Game Trees with TikZ"
DESCRIPTION = "This LaTeX package provides macros based on TikZ to draw a game \
tree. The main idea underlying its core macros is the \
completion of a whole tree by using a sequence of simple \
'parent-child' tree structures, with no longer nested relations \
involved (like the use of 'grandchildren' or \
'great-grandchildren'). Using this package you can draw a game \
tree as easily as drawing a game tree with pen and paper. This \
package depends on expl3, TikZ, and xparse. The 'ist' prefix \
stands for 'it's a simple tree' or 'In-Sung's simple tree.'"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn76924"

RPM_NAME = "texlive-istgame-2026.226.2.1svn76924-63.2.noarch.rpm"
RPM_HASH = "e61c3ed08610360e90482ba5ce03ea06be253b9727e696e779f93174d27e7976626ab0ed1f5af06a48cb76729ca46dbe873cdded15172799b0c5843a19a787ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-istgame.sty \
texlive-istgame"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
