SUMMARY = "Nodes and node connections in PSTricks"
DESCRIPTION = "The package enables the user to connect information, and to \
place labels, without knowing (in advance) the actual positions \
of the items to be connected, or where the connecting line \
should go. The macros are useful for making graphs and trees, \
mathematical diagrams, linguistic syntax diagrams, and so on. \
The package contents were previously distributed as a part of \
the pstricks base distribution; the package serves as an \
extension to PSTricks."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.45svn77682"

RPM_NAME = "texlive-pst-node-2026.226.1.45svn77682-59.2.noarch.rpm"
RPM_HASH = "9bd5f868ade0b52919c0045123abc63370b281a59fac31b7ef391ce508b35d96ccb88a2b7eeaddffa85559b2919eb40780c2b40c7c3c445b46112ff5c5509a6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-node.sty \
tex-pst-node.tex \
tex-pst-node97.tex \
texlive-pst-node"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
