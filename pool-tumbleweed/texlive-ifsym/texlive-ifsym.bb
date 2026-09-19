SUMMARY = "A collection of symbols"
DESCRIPTION = "A set of symbol fonts, written in Metafont, offering \
(respectively) clock-face symbols, geometrical symbols, weather \
symbols, mountaineering symbols, electronic circuit symbols and \
a set of miscellaneous symbols. A LaTeX package is provided, \
that allows the user to load only those symbols needed in a \
document."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-ifsym-2026.226.svn77682-60.2.noarch.rpm"
RPM_HASH = "a7db4429b04c272a99bbdc9f93c76059969458fbb21fb402f20347f04b5fdaeb396192f241af9ba86f30ca32cdf39a92e7bbfd202de95921c24b55bfcd0964bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ifclk10.tfm \
tex-ifclkb10.tfm \
tex-ifgeo10.tfm \
tex-ifgeob10.tfm \
tex-ifgeobn10.tfm \
tex-ifgeobw10.tfm \
tex-ifgeon10.tfm \
tex-ifgeow10.tfm \
tex-ifsym.sty \
tex-ifsym10.tfm \
tex-ifsymb10.tfm \
tex-ifsymbi10.tfm \
tex-ifsymi10.tfm \
tex-ifwea10.tfm \
tex-ifweab10.tfm \
tex-uifblk.fd \
tex-uifclk.fd \
tex-uifgeo.fd \
tex-uifsym.fd \
tex-uifwea.fd \
texlive-ifsym"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
