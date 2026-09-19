SUMMARY = "Load multiple datamodels in BibLaTeX"
DESCRIPTION = "The package adds the possibility to BibLaTeX to load data \
models from multiple sources."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn37081"

RPM_NAME = "texlive-biblatex-multiple-dm-2026.226.1.0.1svn37081-61.2.noarch.rpm"
RPM_HASH = "4e02a41aabd06cb16a055d640930d0205baea8fbcfc3914d8a506b24abfcca7da70ac819a3622f9489c5bfc00dcf3edd614a6f7dd9d637b620e58865e6648ce3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-biblatex-multiple-dm.sty \
tex-multiple-dm.bbx \
texlive-biblatex-multiple-dm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
