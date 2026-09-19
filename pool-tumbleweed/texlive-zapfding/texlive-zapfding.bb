SUMMARY = "URW 'Base 35' font pack for LaTeX"
DESCRIPTION = "A set of fonts for use as 'drop-in' replacements for Adobe's \
basic set, comprising: Century Schoolbook (substituting for \
Adobe's New Century Schoolbook); Dingbats (substituting for \
Adobe's Zapf Dingbats); Nimbus Mono L (substituting for Adobe's \
Courier); Nimbus Roman No9 L (substituting for Adobe's Times); \
Nimbus Sans L (substituting for Adobe's Helvetica); Standard \
Symbols L (substituting for Adobe's Symbol); URW Bookman; URW \
Chancery L Medium Italic (substituting for Adobe's Zapf \
Chancery); URW Gothic L Book (substituting for Adobe's Avant \
Garde); and URW Palladio L (substituting for Adobe's Palatino)."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn77161"

RPM_NAME = "texlive-zapfding-2026.226.svn77161-59.4.noarch.rpm"
RPM_HASH = "6350ea77833ed4635c6e1ce724fb3d1a3d846997c5ba0eb0020103cc5a7e8f92f6a2daef0f28151df66edf08fab7b6f2bb586d3a52c64b83050fd6941fcf3c1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pzdr.tfm \
tex-uuzd.fd \
tex-uzd.map \
tex-uzdr.tfm \
texlive-zapfding"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-zapfding-fonts"

inherit rpm
