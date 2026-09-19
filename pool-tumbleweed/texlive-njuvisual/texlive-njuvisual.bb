SUMMARY = "Display logos related to Nanjing University"
DESCRIPTION = "The njuvisual package collects standard colors and logos \
related to Nanjing University, saves the vector logos as TikZ \
pictures and provides a user-friendly interface to display them \
in documents and beamers."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3.0svn76924"

RPM_NAME = "texlive-njuvisual-2026.226.0.0.3.0svn76924-61.2.noarch.rpm"
RPM_HASH = "d37ff07c0615ed638801061b02021368faeff0ec8e474ea0e59dc6aed3ca0bac3626056721240e165386546224fe352edcccfb1fcbea8489a5ad19644dc0d962"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-njuvisual-emblem-ai.def \
tex-njuvisual-emblem-chem.def \
tex-njuvisual-emblem-cs.def \
tex-njuvisual-emblem-dii.def \
tex-njuvisual-emblem-eng.def \
tex-njuvisual-emblem-nju.def \
tex-njuvisual-emblem-physics.def \
tex-njuvisual-emblem-software.def \
tex-njuvisual-motto-nju.def \
tex-njuvisual-name-en-nju.def \
tex-njuvisual-name-zh-nju.def \
tex-njuvisual-spirit-nju.def \
tex-njuvisual.sty \
texlive-njuvisual"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3keys2e.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
