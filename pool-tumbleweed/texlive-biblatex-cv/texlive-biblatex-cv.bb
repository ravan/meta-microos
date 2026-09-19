SUMMARY = "Create a CV from BibTeX files"
DESCRIPTION = "This package creates an academic curriculum vitae (CV) from a \
BibTeX .bib file. The package makes use of BibLaTeX/biber to \
automatically format, group, and sort the entries on a CV."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.01svn59433"

RPM_NAME = "texlive-biblatex-cv-2026.226.0.0.01svn59433-61.2.noarch.rpm"
RPM_HASH = "87de2a29c24f350e832ccf91a33af01246dac5285e7ba379ca89d9cac14f6aa0231d77a556b4142883f3369f5f3a4cac29a08c1293c724e055129c5338e3ae4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-american-cv.lbx \
tex-biblatex-cv.bbx \
tex-biblatex-cv.cbx \
tex-biblatex-cv.sty \
texlive-biblatex-cv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-american.lbx \
tex-authoryear.bbx \
tex-authoryear.cbx \
tex-biblatex.sty \
tex-datenumber.sty \
tex-expl3.sty \
tex-fp.sty \
tex-totcount.sty \
tex-xparse.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
