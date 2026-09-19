SUMMARY = "Generating Moodle quizzes via LaTeX"
DESCRIPTION = "A package for writing Moodle quizzes in LaTeX. In addition to \
typesetting the quizzes for proofreading, the package compiles \
an XML file to be uploaded to a Moodle server."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn65672"

RPM_NAME = "texlive-moodle-2026.226.1.0svn65672-61.2.noarch.rpm"
RPM_HASH = "9930b327394e3507b03b82cd7755199330f5c663ecf0939d6c874217436e5bb5fece4f3ffde1cc9818d684e6ad531701b17a6ed89e46b1a9ca299217e2c29ce0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-moodle.sty \
texlive-moodle"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-array.sty \
tex-environ.sty \
tex-etex.sty \
tex-etoolbox.sty \
tex-fancybox.sty \
tex-getitems.sty \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-ifplatform.sty \
tex-iftex.sty \
tex-randomlist.sty \
tex-readprov.sty \
tex-shellesc.sty \
tex-tikz.sty \
tex-translator.sty \
tex-varwidth.sty \
tex-xkeyval.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
