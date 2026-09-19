SUMMARY = "Flexible typesetting of Curricula Vitae"
DESCRIPTION = "The package provides the framework for typesetting a Curriculum \
Vitae (composed in French), together with a number of 'themes' \
that may be used with the package. (The use of the themes may \
be seen in the package's examples/ collection.) The author \
hints that conversion for use with other languages (than \
French) should be possible."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.01svn32263"

RPM_NAME = "texlive-pas-cv-2026.226.2.01svn32263-58.2.noarch.rpm"
RPM_HASH = "8a5cffc0f38a978046bd53813661caf1500748049b5629f927ad3271c1354b94c23389c314b95647ef09ca548f167204599f6fedc9d6677ad18588d3caaf0e93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-macro-andromede.tex \
tex-macro-architecte.tex \
tex-macro-centaure.tex \
tex-macro-dynamique.tex \
tex-macro-gaia.tex \
tex-macro-jupiter.tex \
tex-macro-mars.tex \
tex-macro-neptune.tex \
tex-macro-orion.tex \
tex-macro-pegase.tex \
tex-macro-pluton.tex \
tex-macro-saturne.tex \
tex-macro-univers.tex \
tex-macro-uranus.tex \
tex-macro-venus.tex \
tex-pas-cv.sty \
texlive-pas-cv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-eso-pic.sty \
tex-fp.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-tikz.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
