SUMMARY = "A Beamer theme for academic presentations"
DESCRIPTION = "The package developed for academic purposes. The distribution \
includes nothing more than style file needed for preparing \
presentations."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn20765"

RPM_NAME = "texlive-beamerthemenirma-2026.226.0.0.1svn20765-61.2.noarch.rpm"
RPM_HASH = "12ab447fcbc5052588ec6199089bff2559eed62a06671492e0333803d0d629975082446dd44a59597bee26142aeb642fa1a025b48da626bdfce6c436f19725e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamerthemenirma.sty \
texlive-beamerthemenirma"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-beamerbasethemes.sty \
tex-pgf.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
