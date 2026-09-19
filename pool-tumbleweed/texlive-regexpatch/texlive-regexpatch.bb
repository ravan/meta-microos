SUMMARY = "High level patching of commands"
DESCRIPTION = "The package generalises the macro patching commands provided by \
P. Lehmann's etoolbox. The difference between this package and \
its sibling xpatch is that this package sports a very powerful \
\\regexpatchcmd based on the l3regex module of the LaTeX3 \
experimental packages."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2fsvn77682"

RPM_NAME = "texlive-regexpatch-2026.226.0.0.2fsvn77682-60.4.noarch.rpm"
RPM_HASH = "144437e12ea2a39aca3ddaf1a067094d01d4a1dcbf2ea7283dfc71b7351704cfc92a1117e7a1e26f7630ede48dd204f84b589eff5c9986d079cacf46d44e569a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-regexpatch.sty \
texlive-regexpatch"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
