SUMMARY = "Defines the 16 colors from Ethan Schoonover's Solarized palette"
DESCRIPTION = "Built on top of the xcolor package, this package defines the \
sixteen colors of Ethan Schoonover's popular color palette, \
Solarized, for use in documents typeset with LaTeX and Friends."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn61719"

RPM_NAME = "texlive-xcolor-solarized-2026.226.0.0.4svn61719-59.4.noarch.rpm"
RPM_HASH = "f1ebcceda1f1f560e9241d660bf39009681bf86ea9ce4087264d5099de3b14197641a44d6ace155df57d1c3a93dfe32f41178fd99452fe912e3be847fad7134c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xcolor-solarized.sty \
texlive-xcolor-solarized"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
