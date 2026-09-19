SUMMARY = "A class for typesetting flashcards"
DESCRIPTION = "The FlashCards class provides for the typesetting of flash \
cards. By flash card, we mean a two sided card which has a \
prompt or a question on one side and the response or the answer \
on the flip (back) side. Flash cards come in many sizes \
depending on the nature of the information they contain."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0.2svn62104"

RPM_NAME = "texlive-flashcards-2026.226.1.0.2svn62104-59.2.noarch.rpm"
RPM_HASH = "e63507081cefacf3d3ec7f5d221df4abc46e7a7c569a0bb621b35db6ed7e78ff2fd43a2df387aac7a637303ae19e919f84632803e8c325496a209bfdafed4029"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-avery5371.cfg \
tex-avery5388.cfg \
tex-flashcards.cls \
texlive-flashcards"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-geometry.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
