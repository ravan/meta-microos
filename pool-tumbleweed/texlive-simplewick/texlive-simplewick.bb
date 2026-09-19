SUMMARY = "Simple Wick contractions"
DESCRIPTION = "The package provides a simple means of drawing Wick \
contractions above and below expressions."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.2asvn15878"

RPM_NAME = "texlive-simplewick-2026.226.1.2asvn15878-60.2.noarch.rpm"
RPM_HASH = "67d8dc98ab205473af49898ffc00f7d13b59f79e19742d405c6da368e8b0f843bedfb6a2c468df4f2062f86839e0c99c0b01a2f069185a55dcf86175c92bfddf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-simplewick.sty \
texlive-simplewick"

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
