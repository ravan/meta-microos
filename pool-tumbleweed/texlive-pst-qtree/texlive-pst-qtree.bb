SUMMARY = "Simple syntax for trees"
DESCRIPTION = "The package provides a qtree-like front end for PSTricks."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-pst-qtree-2026.226.svn15878-60.4.noarch.rpm"
RPM_HASH = "c72a2c80ce599cb006750697dd22b304a4a9a80c1a30f23406753daa4427374dd59e8676de08d70ce1ef3161ec706befabd53d3412f03d2be74e0f2260fb98de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-qtree.sty \
tex-pst-qtree.tex \
texlive-pst-qtree"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pst-node.sty \
tex-pst-tree.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
