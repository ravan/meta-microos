SUMMARY = "Typesetting units in LaTeX"
DESCRIPTION = "Many packages for typesetting units have been written for use \
in LaTeX2e. Some define macros to typeset a lot of units but do \
not suit to the actual font settings, some make the characters \
needed available but do not predefine any unit. This package \
tries to comply with both requirements. It predefines common \
units, defines an easy to use interface to define new units and \
changes the output concerning to the surrounding font settings."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn15878"

RPM_NAME = "texlive-unitsdef-2026.226.0.0.2svn15878-60.2.noarch.rpm"
RPM_HASH = "7a65866f5cfa70b4b23c10fa7a75eefb8937cf5765c9a1cbfb51358d85017515a7482b4a42d7fbf3d7ad6740638f1cf09683e601cf06f1f7f0fe0d6819f402be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ampabbrv.cfg \
tex-enerabbr.cfg \
tex-freqabbr.cfg \
tex-lengabbr.cfg \
tex-molabbrv.cfg \
tex-timeabbr.cfg \
tex-unitsdef.sty \
tex-volabbrv.cfg \
tex-voltabbr.cfg \
tex-weigabbr.cfg \
texlive-unitsdef"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-fontenc.sty \
tex-textcomp.sty \
tex-units.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
