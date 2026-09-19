SUMMARY = "Insert Trivial Pursuit board game"
DESCRIPTION = "This is a package to display a Trivial Pursuit board game, with \
customization."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.7svn76152"

RPM_NAME = "texlive-trivialpursuit-2026.226.0.0.1.7svn76152-59.2.noarch.rpm"
RPM_HASH = "3457febe66809a0822599420cf289c6c989c6502813d7e2a6a23866f7a35081608a35ebdc06f110b3bce85ea2ad42e427672d2efa2eed0d6964cbaed6b6304e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-TrivialPursuit.sty \
texlive-trivialpursuit"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-fontawesome5.sty \
tex-fontawesome6.sty \
tex-fontawesome7.sty \
tex-ifthen.sty \
tex-listofitems.sty \
tex-simplekv.sty \
tex-tikz.sty \
tex-xintexpr.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
