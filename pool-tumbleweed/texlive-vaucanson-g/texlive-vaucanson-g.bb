SUMMARY = "PSTricks macros for drawing automata"
DESCRIPTION = "VauCanSon-G is a package that enables the user to draw automata \
within texts written using LaTeX. The package macros make use \
of commands of PStricks."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn15878"

RPM_NAME = "texlive-vaucanson-g-2026.226.0.0.4svn15878-60.2.noarch.rpm"
RPM_HASH = "7386f6edb9a3d437e718559f2c9274f1ea2f2a55c01e7869897c22021bace1e406435764e3979513a7a95f47ee04547b80e3c51d9c856847d052edad6881d848"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-VCColor-names.def \
tex-VCPref-beamer.tex \
tex-VCPref-default.tex \
tex-VCPref-mystyle.tex \
tex-VCPref-slides.tex \
tex-Vaucanson-G.tex \
tex-vaucanson-g.sty \
tex-vaucanson.sty \
texlive-vaucanson-g"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
tex-multido.sty \
tex-pst-3d.sty \
tex-pst-coil.sty \
tex-pst-node.sty \
tex-pst-plot.sty \
tex-pstricks.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
