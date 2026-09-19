SUMMARY = "Overlay a grid on the printed page"
DESCRIPTION = "The package overlays a grid (whose spacing is \\baselineskip, \
which offers guidlines for considering the 'rhythm' of the \
document on the page."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn32457"

RPM_NAME = "texlive-vgrid-2026.226.0.0.1svn32457-60.2.noarch.rpm"
RPM_HASH = "8dffe4c5bcbf1d0d2fccb21688b6a24ce59f96849dd2f3a9ec4bc8c5e9b9303a19c4115d1d6d252dc782a25346eca2f559db4d5a5361f4fdf3611b16289c5bf0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-vgrid.sty \
texlive-vgrid"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-everypage.sty \
tex-ifoddpage.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
