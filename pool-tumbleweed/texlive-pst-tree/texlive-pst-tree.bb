SUMMARY = "Trees, using PSTricks"
DESCRIPTION = "pst-tree is a pstricks package that defines a macro \\pstree \
which offers a structured way of joining nodes created using \
pst-node in order to draw trees."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.14svn77682"

RPM_NAME = "texlive-pst-tree-2026.226.1.14svn77682-60.4.noarch.rpm"
RPM_HASH = "ac6f9efd93d864cd3f8336361f16aa8a22b84527acbaa8fb69ea4d09a22fc2a4a1a8788a137b516fb217591fefda072805c5e3022775a9b33bc34a12fe89c204"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-tree.sty \
tex-pst-tree.tex \
texlive-pst-tree"

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
