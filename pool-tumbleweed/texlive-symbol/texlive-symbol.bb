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

RPM_NAME = "texlive-symbol-2026.226.svn77161-64.2.noarch.rpm"
RPM_HASH = "2e9967a42c9e762368625af64f5c684964a9c41fd511af96bc9cfca3d11e845d361cc95b3e54249f9f56755ba39d59d2bc19fa0ce3ce3221a04ebef4660d0cd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-msyr.tfm \
tex-psyr.tfm \
tex-usy.map \
tex-usyr.tfm \
tex-uusy.fd \
texlive-symbol"

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
texlive-symbol-fonts"

inherit rpm
