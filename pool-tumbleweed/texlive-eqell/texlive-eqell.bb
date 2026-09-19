SUMMARY = "Sympathetically spaced ellipsis after punctuation"
DESCRIPTION = "The package provides commands that give a well-spaced ellipsis \
after !, ?, !? or ?!."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn22931"

RPM_NAME = "texlive-eqell-2026.226.svn22931-61.4.noarch.rpm"
RPM_HASH = "7b35ac3d85d41cde9ea96d26d2369a8e00d72eba43ee7c30505926d10ca72becf0099fa794484b1e0e291e3a5b27563c7808406c6d07ace2e4ae2e250531cb80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eqell.sty \
texlive-eqell"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
