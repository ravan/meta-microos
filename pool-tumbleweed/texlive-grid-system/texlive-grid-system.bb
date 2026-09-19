SUMMARY = "Page organisation, modelled on CSS facilities"
DESCRIPTION = "The package provides the means for LaTeX to implement a grid \
system as known from CSS grid systems. The facility is useful \
for creating box layouts as used in brochures."
LICENSE = "Apache-1.0"

PV = "2026.226.0.0.3.0svn32981"

RPM_NAME = "texlive-grid-system-2026.226.0.0.3.0svn32981-60.4.noarch.rpm"
RPM_HASH = "76a04fd0e9ee0117bffd6eb820f00503c1e48669470efced1eda8a6b7c3fd7d837179e9c1a300239dee1ecf1a486ad1f029fc4d57f23c5523b58a2aedab77a0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-grid-system.sty \
texlive-grid-system"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-environ.sty \
tex-forloop.sty \
tex-ifthen.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
