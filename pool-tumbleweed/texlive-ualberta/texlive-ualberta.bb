SUMMARY = "A LaTeX template for the University of Alberta"
DESCRIPTION = "This package provides a comprehensive template designed to meet \
the formatting requirements of the University of Alberta ( \
https://www.ualberta.ca/en/graduate-studies/resources/graduate- \
students/thesis-preparation-requirements-deadlines/index.html) \
for MSc and PhD theses. It provides a structured and \
customizable framework that ensures compliance with university \
guidelines while allowing flexibility in document formatting."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.0svn78219"

RPM_NAME = "texlive-ualberta-2026.226.2.0.0svn78219-59.2.noarch.rpm"
RPM_HASH = "2982f5623585ab55370d3c5aa6c7ed628e8ee5d23390b20d2313ea35c3cae1860a3d1ccabf778e809ac4708d6318eb275ded699fe0de986223dbdc9c83ce0a40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ualberta.cls \
texlive-ualberta"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-pdfx.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
