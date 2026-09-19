SUMMARY = "Print diffraction patterns from various apertures"
DESCRIPTION = "The package enables the user to draw (using PSTricks) the \
diffraction patterns for different geometric forms of apertures \
for monochromatic light (using PSTricks). The aperture stops \
can have rectangular, circular or triangular openings. The view \
of the diffraction may be planar, or three-dimensional. Options \
available are the dimensions of the aperture under \
consideration and of the particular optical setting, e.g. the \
radius in case of an circular opening. Moreover one can choose \
the wavelength of the light (the associated color will be \
calculated by the package)."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.06asvn71819"

RPM_NAME = "texlive-pst-diffraction-2026.226.2.06asvn71819-59.2.noarch.rpm"
RPM_HASH = "89ee03612f6a4c7f7a817377486511ede05a3e06698eea605d31d808f0ea2e95472bdb592b16552ea34d522227d9e91602a341d4926d4490d051c3fa5d22e5f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-diffraction.sty \
tex-pst-diffraction.tex \
texlive-pst-diffraction"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pst-3dplot.sty \
tex-pst-xkey.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
