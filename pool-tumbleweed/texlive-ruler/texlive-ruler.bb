SUMMARY = "A typographic ruler for TeX"
DESCRIPTION = "The file processes to produce (real) rulers; the author \
suggests printing them on transparent plastic and trimming for \
use as a 'real' ruler. The rule widths are 0.05mm, which can be \
challenging for (old) laser printers."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1svn54251"

RPM_NAME = "texlive-ruler-2026.226.1.1svn54251-60.2.noarch.rpm"
RPM_HASH = "164c3c88652744c988395d4331c23586d36ae47fc28457b860bac5237a44bac97d53e5ee37fb8d780d25d93d173309b7419d2b36089637d6f3f45d704d266057"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ruler.tex \
texlive-ruler"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
