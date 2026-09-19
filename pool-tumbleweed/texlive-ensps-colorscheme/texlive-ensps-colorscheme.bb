SUMMARY = "Color palette and styling of ENS Paris-Saclay"
DESCRIPTION = "This LaTeX package offers access to the design system of the \
Ecole Nationale Superieure Paris-Saclay and can be used to \
write documents consistent with the guidelines. For now, only \
the color palette is available."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.1svn71431"

RPM_NAME = "texlive-ensps-colorscheme-2026.226.0.0.0.1svn71431-61.4.noarch.rpm"
RPM_HASH = "dadfcbde3929636dd396327ad8e9ea04f27311b51567002b5fe8f5ae239e05c51e86665cf028131bdacf13acdead59850101e5f5266a9ab21c1061c951d11c3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ensps-colorscheme.sty \
texlive-ensps-colorscheme"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
