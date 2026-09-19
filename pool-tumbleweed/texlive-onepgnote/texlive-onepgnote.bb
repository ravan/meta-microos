SUMMARY = "Space-efficient one-page notes for exams"
DESCRIPTION = "An article-based LaTeX class that helps making one-page notes \
for exams. It makes the one-page note very space efficient, \
while maintaining the conspicuity of important texts. Another \
feature is the simple implementation of this class. With only \
100+ lines of code, it achieves the above features, thanks to a \
few powerful ideas. This makes it easy for others to understand \
and improve the source code."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0.0svn75332"

RPM_NAME = "texlive-onepgnote-2026.226.1.0.0svn75332-61.2.noarch.rpm"
RPM_HASH = "f7884d9069d5e604977a046fc7b03ca4e8c9d8dc8952f8d92f6fd2a8ad652df605f597d2de732fdd8602d0c2b036b681b0404613e81bbc2aeb2584b7473e4c50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-onepgnote.cls \
texlive-onepgnote"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-expl3.sty \
tex-tcolorbox.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
