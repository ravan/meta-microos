SUMMARY = "Simple decoration fonts, made with TikZ, for short texts"
DESCRIPTION = "Some simple 'decoration' fonts made with TikZ, for short texts: \
paint brush; ink brush; pixelart brush; bicolor texts; \
'surround' or 'underline' effect; block of letters texts."
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.1.7svn77388"

RPM_NAME = "texlive-tikz-decofonts-2026.227.0.0.1.7svn77388-62.2.noarch.rpm"
RPM_HASH = "c501b0fd8b14da7a41fcc9106ebae34981464ed00d36ba938d98c09122f432b725dadc30257f51f70d15032c4ac6a82fa99f56850cc320b8615f18c4db761e18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-decofonts.sty \
texlive-tikz-decofonts"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
tex-listofitems.sty \
tex-settobox.sty \
tex-simplekv.sty \
tex-tikz-3dplot.sty \
tex-tikz.sty \
tex-xintexpr.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
