SUMMARY = "German input encodings in LaTeX"
DESCRIPTION = "An early package for using alternate input encodings. The \
author considers the package mostly obsolete, since most of its \
functions are taken by the inputenc package; however, inputenc \
doesn't support the roman8 and atari encodings, so umlaute \
remains the sole source of that support."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn15878"

RPM_NAME = "texlive-umlaute-2026.226.2.1svn15878-60.2.noarch.rpm"
RPM_HASH = "3eb0614b894370812fa0ae3e38e335dc256744539f603c1244cf51855b484df725cd3a2765f68a3ffbfee4de86f07689bab854e458d6837a78baf9bdfee754f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-atari.def \
tex-isolatin.def \
tex-mac.def \
tex-pc850.def \
tex-roman8.def \
tex-umlaute.sty \
texlive-umlaute"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-applemac.def \
tex-cp850.def \
tex-inputenc.sty \
tex-latin1.def \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
