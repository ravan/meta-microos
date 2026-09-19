SUMMARY = "Colours by wavelength of visible light"
DESCRIPTION = "The package allows the user to obtain an RGB value (suitable \
for use in the color package) from a wavelength of light. The \
default unit is nanometres, but other units may be used. Note \
that this function is also available within xcolor."
LICENSE = "LGPL-2.1-or-later"

PV = "2026.226.1.0svn67012"

RPM_NAME = "texlive-colorwav-2026.226.1.0svn67012-60.2.noarch.rpm"
RPM_HASH = "dda6ac85cd8b7e7269c01887724e9a537efdae6eac00659e80aa7870a6cabafefc3482783cb48a04ac79154212d0a97cbbcb56baa27022f61d17a27687daca54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-colorwav.sty \
texlive-colorwav"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fp.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
