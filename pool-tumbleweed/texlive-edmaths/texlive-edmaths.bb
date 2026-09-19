SUMMARY = "A report and thesis package for the University of Edinburgh (UoE)"
DESCRIPTION = "A report and thesis package for The School of Mathematics, \
Scotland at the University of Edinburgh (UoE). When working on \
a report or thesis, an easy way to implement the University's \
typesetting rules in LaTeX is provided by edmaths.sty. It sets \
the page margins as required and defines commands to create the \
correct cover page and standard declaration. It also loads the \
amsmath, amsthm, amscd, and amssymb packages, which are \
required by almost all mathematical publications. Through \
setspace line spacing settings are available that only affect \
the body text and not footnotes and captions. Additional \
in-built options can be found in more detail in the project's \
documentation."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn77050"

RPM_NAME = "texlive-edmaths-2026.226.1.0.0svn77050-61.4.noarch.rpm"
RPM_HASH = "5ae4461a915b2227c0f7d229110710940e5269b7d06de31c2ac14197c16abd90ebb06d6cb25483ef9a78c3133349bc8c38ba5775072e38d18d44009f82b1a718"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-edmaths.sty \
texlive-edmaths"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amscd.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-cmap.sty \
tex-cmbright.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-fourier.sty \
tex-geometry.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-microtype.sty \
tex-setspace.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
