SUMMARY = "LaTeX class for theses at Southeast University, Nanjing, China"
DESCRIPTION = "This project provides a LaTeX document class as well as a \
bibliography style file for typesetting theses at the Southeast \
University, Nanjing, China. It is based on the seuthesis \
package which, according to the author of seuthesix, is buggy \
and has not been maintained for some time."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0.1svn40088"

RPM_NAME = "texlive-seuthesix-2026.226.1.0.1svn40088-60.2.noarch.rpm"
RPM_HASH = "7b345e08ac5e77bc2ae2a9c2e27b91da055178977097000f4ca5ac8f762670218c5950550dd33b3be4271d2ac8ad30f91bf39839bd98054651216cac918812b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-seuthesix.cfg \
tex-seuthesix.cls \
texlive-seuthesix"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-algorithm.sty \
tex-algorithmic.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-bm.sty \
tex-caption.sty \
tex-ctexrep.cls \
tex-eso-pic.sty \
tex-eucal.sty \
tex-eufrak.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-natbib.sty \
tex-nomencl.sty \
tex-tocloft.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
