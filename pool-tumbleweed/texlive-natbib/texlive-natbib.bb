SUMMARY = "Flexible bibliography support"
DESCRIPTION = "The bundle provides a package that implements both author-year \
and numbered references, as well as much detailed of support \
for other bibliography use. Also Provided are versions of the \
standard BibTeX styles that are compatible with \
natbib--plainnat, unsrtnat, abbrnat. The bibliography styles \
produced by custom-bib are designed from the start to be \
compatible with natbib."
LICENSE = "LPPL-1.0"

PV = "2026.226.8.31bsvn77682"

RPM_NAME = "texlive-natbib-2026.226.8.31bsvn77682-61.2.noarch.rpm"
RPM_HASH = "417af28c6aeabf807e885e97d3477bea0074ff93d7f3dfcce9e6fbb5198e631cead1e604c671712ee4a288c21d41ef83f5df191b44daeaf918f4e3e81949ff37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bibentry.sty \
tex-natbib.sty \
texlive-natbib"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-citeref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
