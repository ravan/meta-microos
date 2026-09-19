SUMMARY = "Cite classic works"
DESCRIPTION = "The package provides a basic framework to cite classic works \
(specially from authors such as Homer, Plato, Aristotle, \
Descartes, Hume, and Kant) in accordance with traditional \
pagination systems. It may be used in conjunction with other \
citation packages."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1asvn76924"

RPM_NAME = "texlive-classics-2026.226.0.0.1asvn76924-60.2.noarch.rpm"
RPM_HASH = "fd0fd182c07467ded0247098f4f20c85e8fc11f1acc7685c086cb61274fd48644d15bc2290d5a13eded4e446a844e1bc25364b8739b1c8e512cdaba58daceffe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-classics.sty \
texlive-classics"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
