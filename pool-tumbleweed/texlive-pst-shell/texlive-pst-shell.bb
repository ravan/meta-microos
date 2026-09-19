SUMMARY = "Plotting sea shells"
DESCRIPTION = "pst-shell is a PSTricks related package to draw seashells in 3D \
view: Argonauta, Epiteonium, Lyria, Turritella, Tonna, \
Achatina, Oxystele, Conus, Ammonite, Codakia, Escalaria, \
Helcion, Natalina, Planorbis, and Nautilus, all with different \
parameters. pst-shell needs pst-solides3d and an up-to-date \
PSTricks, which should be part of your local TeX installation, \
otherwise get it from a CTAN server."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.03svn56070"

RPM_NAME = "texlive-pst-shell-2026.226.0.0.03svn56070-60.4.noarch.rpm"
RPM_HASH = "f987cfe41471908f97c4f787a66cf4f004d5182f3c890ff39bddab229d048e9baf3359b95c1d916c731b0bb2794f1c9941dda7999fc1d555a683ed2e6639a046"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-shell.sty \
tex-pst-shell.tex \
texlive-pst-shell"

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
