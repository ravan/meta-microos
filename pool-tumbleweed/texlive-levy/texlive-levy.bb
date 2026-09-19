SUMMARY = "Fonts for typesetting classical greek"
DESCRIPTION = "These fonts are derivatives of Knuth's CM fonts. Macros for use \
with Plain TeX are included in the package; for use with LaTeX, \
see lgreek (with English documentation) or levy (with German \
documentation)."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn76924"

RPM_NAME = "texlive-levy-2026.226.svn76924-61.2.noarch.rpm"
RPM_HASH = "d467d25b34ff2912b9a418faa64545f39723acb79a97bf143a5eff5841f142cb8da225c9bfa10e6b8049de73e43003545728c9053421bb8cfe16e6594e49fb6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-grbld10.tfm \
tex-grbld8.tfm \
tex-grbld9.tfm \
tex-greekmacros.tex \
tex-grreg10.tfm \
tex-grreg8.tfm \
tex-grreg9.tfm \
tex-slgreek.sty \
texlive-levy"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
