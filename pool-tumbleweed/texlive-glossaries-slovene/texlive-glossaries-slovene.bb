SUMMARY = "Slovene language module for glossaries package"
DESCRIPTION = "Slovene language module for glossaries package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn51211"

RPM_NAME = "texlive-glossaries-slovene-2026.226.1.0svn51211-60.4.noarch.rpm"
RPM_HASH = "6e6994ffb5e23feb1b4290d26d323daab2772729f50fe2f78ecb2ded0efd5818632e11c8a200d434112e4731acf666a713c6e78a45dc2896d9331c765bb74dce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-slovene.ldf \
texlive-glossaries-slovene"

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
