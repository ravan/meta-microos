SUMMARY = "A collection of LaTeX beamer themes"
DESCRIPTION = "'NPBT' stands for 'Norman's Pandoc Beamer Themes'. Currently \
the following themes are supported: Sefiroth Consulting: A \
private (demonstration) theme. FOM: The layout of Hochschule \
FOM. FOM ifes: The layout of Hochschule FOM, Institut fur \
Empirie & Statistik. eufom: The layout of eufom."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.4.1svn54512"

RPM_NAME = "texlive-beamertheme-npbt-2026.226.4.1svn54512-61.2.noarch.rpm"
RPM_HASH = "f5a6855b08b5956934a39e88eb72ac1d349dd1b94d6626e7e5d7d35d51aa4defcdcc5b500b8bf08efb10f3932ea143caa5d32c037c0cf314f16a9dad0e9de358"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemeNPBT-EUFOM.sty \
tex-beamercolorthemeNPBT-FOM-ifes.sty \
tex-beamercolorthemeNPBT-FOM.sty \
tex-beamercolorthemeNPBT-SC.sty \
tex-beamerouterthemeNPBT-FOM-ifes.sty \
tex-beamerouterthemeNPBT-FOM.sty \
tex-beamerthemeNPBT.sty \
texlive-beamertheme-npbt"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-eurosym.sty \
tex-fontenc.sty \
tex-ifthen.sty \
tex-lmodern.sty \
tex-multicol.sty \
tex-pgfplots.sty \
tex-ragged2e.sty \
tex-textcomp.sty \
tex-tikz.sty \
tex-xltxtra.sty \
tex-xspace.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
