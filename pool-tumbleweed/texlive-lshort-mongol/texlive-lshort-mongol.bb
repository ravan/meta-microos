SUMMARY = "Short introduction to LaTeX, in Mongolian"
DESCRIPTION = "A translation of Oetiker's Not so short introduction."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.26svn15878"

RPM_NAME = "texlive-lshort-mongol-2026.226.4.26svn15878-61.2.noarch.rpm"
RPM_HASH = "b0fa08b566fe695b2821c25414741008c73f891188020a0675fc80396914e4df3d1cca4b14c8c5e9d22d42ea8c501c1ded9e45d1e689088a30a47eaeea2a2572"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-mongol"

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
