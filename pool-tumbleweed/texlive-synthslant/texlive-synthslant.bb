SUMMARY = "Synthetically slant text"
DESCRIPTION = "This package allows to slant ('shear') short pieces of text to \
the left or to the right by an arbitrary angle, thus creating \
for example 'fake italics' or upright italics. Several \
back-ends that do the actual shearing are supported, though \
currently the pdfLaTeX back-end works best concerning output \
quality and processing speed."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn76662"

RPM_NAME = "texlive-synthslant-2026.226.0.0.2svn76662-64.2.noarch.rpm"
RPM_HASH = "99fe60477e7b085a856aa98b97566ccfb9f72dc7abdb2961fcfff9cede1784740b34b6182f9e824d1e4980ff040ef184a7f09981aaff4ef428c7eab2f00e786d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-synthslant.sty \
texlive-synthslant"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-fontspec.sty \
tex-iftex.sty \
tex-l3draw.sty \
tex-pst-3d.sty \
tex-tikz.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
