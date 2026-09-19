SUMMARY = "A 'convenience wrapper' for High Energy Physics packages"
DESCRIPTION = "Loads the author's hepunits and hepnicenames packages, and a \
selection of others that are useful in High Energy Physics \
papers, etc."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-hep-2026.226.1.0svn15878-60.4.noarch.rpm"
RPM_HASH = "7a57cda51ffdb782cb210990f5e67022f9c2787f947034b5fa61324b6f728fcd097a0cd2c8c90cbf555a7fd13d8d1fde679c18525bbefe2cb61185781ac69eec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hep.sty \
texlive-hep"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpage.sty \
tex-amsmath.sty \
tex-booktabs.sty \
tex-braket.sty \
tex-cancel.sty \
tex-caption.sty \
tex-ccaption.sty \
tex-cite.sty \
tex-fancyhdr.sty \
tex-feynmf.sty \
tex-hepnicenames.sty \
tex-hepunits.sty \
tex-hyperref.sty \
tex-morefloats.sty \
tex-setspace.sty \
tex-slashed.sty \
tex-subfigure.sty \
tex-tocbibind.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
