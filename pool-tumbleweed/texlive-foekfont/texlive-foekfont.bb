SUMMARY = "The title font of the Mads Fok magazine"
DESCRIPTION = "The bundle provides an Adobe Type 1 font, and LaTeX support for \
its use. The magazine web site shows the font in use in a few \
places."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-foekfont-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "9ea47fbf551174944a71c00105e3327f767173eac3c0211c655265565d37716f9722a8160aab296307416025cb5c14e01081960468980cb1400ca676f3dd0123"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-foekfont.map \
tex-foekfont.sty \
tex-foekfont.tfm \
tex-ot1foekfont.fd \
tex-t1foekfont.fd \
texlive-foekfont"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-foekfont-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
