SUMMARY = "Support for fancy frames"
DESCRIPTION = "The package defines means of drawing frames around boxes, using \
dingbat fonts. Some (Metafont) font sources are included; the \
fonts are available separately in Type 1 format."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1csvn77682"

RPM_NAME = "texlive-niceframe-2026.226.1.1csvn77682-61.2.noarch.rpm"
RPM_HASH = "d1f7c4042b92de297f720ebf7b2b455241d61eead215a075b725ead8ba079c4bb9daa1e2cc57bda850f3a6d6035fe81b1b75d5b57bb9b41e707e6411db3b0bc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-karta15.tfm \
tex-niceframe.sty \
tex-umranda.tfm \
tex-umrandb.tfm \
texlive-niceframe"

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
