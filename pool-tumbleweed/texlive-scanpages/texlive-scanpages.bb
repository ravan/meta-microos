SUMMARY = "Support importing and embellishing scanned documents"
DESCRIPTION = "The bundle provides support for the process of creating \
documents based on pre-TeX-era material that is available as \
scanned pages, only."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.05asvn42633"

RPM_NAME = "texlive-scanpages-2026.226.1.05asvn42633-60.2.noarch.rpm"
RPM_HASH = "fccc061aa5a37ca0334fbe0b1ed419dcc2649f69268e300ed003350ce96f89ba1589cecd29066de4584cc629d35d6b1898291eab58a9c19a02150f0589a0bbbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-scanpages.map \
tex-scanpages.sty \
tex-scanwipe.tfm \
tex-uscanwipe.fd \
texlive-scanpages"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-fp-basic.sty \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-pgffor.sty \
tex-updmap.cfg \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scanpages-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
