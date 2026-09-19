SUMMARY = "Customizable optical components for drawing laser setups and optical systems using TikZ"
DESCRIPTION = "This package provides a collection of TikZ-based commands for \
drawing laser setups and optical systems. It includes \
components such as lenses, mirrors, beamsplitters, cameras, \
spectrometers, detectors and more. Each element is highly \
customizable through optional key-value arguments (e.g. angle, \
width, thickness, color). Furthermore, rainbow and single color \
beams can be drawn to visualize beam size and dispersion in \
e.g. stretcher-compressor setups."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.0svn77916"

RPM_NAME = "texlive-optikz-2026.226.1.1.0svn77916-61.2.noarch.rpm"
RPM_HASH = "288fb1d997016a4e442a47ee4359869624650c35394996d79d4c7db82e0f716374bf9d7aec7eb77dcd9e4a9fb2a242884bb1410b988a0359122ba4346e7f9523"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-optikz.sty \
texlive-optikz"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
