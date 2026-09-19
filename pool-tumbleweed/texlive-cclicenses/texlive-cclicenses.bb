SUMMARY = "Typeset Creative Commons licence logos"
DESCRIPTION = "The cclicenses package helps users typesetting Creative Commons \
logos in LaTeX. It defines some commands useful to quickly \
write these logos, related to CC licences versions 1.0 and 2.0."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-cclicenses-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "3b0d1b21b749e1d360d45ffc29076753d4262732e80adb20e10238007ff600ce291b6804e145222f68f3346d61a08755e51e69c19da7332b3668a08229605f35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cclicenses.sty \
texlive-cclicenses"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-rotating.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
