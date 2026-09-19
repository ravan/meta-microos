SUMMARY = "Extended support for STIXTwo fonts"
DESCRIPTION = "Using resources of the fontspec package, the xstix2 package \
adjusts letter widths of the STIXTwo fonts and makes all the \
fonts in this collection available."
LICENSE = "LPPL-1.0"

PV = "2026.226.20260301svn78229"

RPM_NAME = "texlive-xstix2-2026.226.20260301svn78229-59.4.noarch.rpm"
RPM_HASH = "dd084dc1e93f6a52fef63dd7b951d52b6f511a592582c8bb5cef546a5a8a9435ee266df89b90417d641ea08a211da73fdd24137aaaabc7eed8f14d31171e4eb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xstix2.sty \
texlive-xstix2"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-iftex.sty \
tex-unicode-math.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
