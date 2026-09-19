SUMMARY = "Alternative font handling in LaTeX"
DESCRIPTION = "The package provides a replacement for that part of psnfss and \
mfnfss that changes the default font. The package is \
distributed together with the psfont package, by the same \
author."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1svn15878"

RPM_NAME = "texlive-altfont-2026.226.1.1svn15878-61.2.noarch.rpm"
RPM_HASH = "12f263d18f4dfb4781bc619611561fa197708e2e5eed5e70a3263ab645b5b1d4ca0bcc7508c9c70966ccdc5cca9d38a0114e164e4dd07dfc1faa4c81c1d282ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-altfont.cfg \
tex-altfont.sty \
tex-psfont.cfg \
tex-psfont.sty \
texlive-altfont"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontenc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
