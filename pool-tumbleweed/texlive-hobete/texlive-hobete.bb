SUMMARY = "Unofficial beamer theme for the University of Hohenheim"
DESCRIPTION = "The package provides a beamer theme which features the Ci \
colors of the University of Hohenheim. Please note that this is \
not an official Theme, and that there will be no support for \
it, from the University. Furthermore there is NO relationship \
between the University and this theme."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn27036"

RPM_NAME = "texlive-hobete-2026.226.svn27036-60.4.noarch.rpm"
RPM_HASH = "e3e247fdeddfda63938a31a37bbf305b73061e3945a5717874a6b453ae0b9b7434ca2f4b5cecc75447133c7f07d67c4f01abbe1533bf1ec56010ea4ab9ebec8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemehohenheim.sty \
tex-beamerouterthemehohenheim.sty \
tex-beamerouterthemehohenheimposter.sty \
tex-beamerthemehohenheim.sty \
tex-hobete.sty \
texlive-hobete"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-tikz.sty \
tex-xfrac.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
