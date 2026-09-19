SUMMARY = "Setting questions (or exercises) and answers"
DESCRIPTION = "The package allows a lot of flexibility in constructing \
question and answer sheets."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.16svn77682"

RPM_NAME = "texlive-answers-2026.226.2.16svn77682-61.2.noarch.rpm"
RPM_HASH = "1dea3f4d8c8225159c3914aa0cb71905f91c9c8b71841e183b961b5bea1a3a353108161d0a406b4218820986bf1d5428bf9962bdd0558464ce00cd644d5d1e4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-answers.sty \
texlive-answers"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
