SUMMARY = "A set of fonts supporting chess diagrams"
DESCRIPTION = "The fonts are provided as Metafont source."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn78101"

RPM_NAME = "texlive-bartel-chess-fonts-2026.226.svn78101-60.2.noarch.rpm"
RPM_HASH = "995c74fa1a93fbbd19c76f3181d2face355d89166dd5f283e744a67aa476ea7c7f663fbe41dd333195bf15c83835145a622ca2eb61170ac40341d8ff8c5c8d95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fselch10.tfm \
tex-fselch11.tfm \
tex-fselch12.tfm \
tex-fselch13.tfm \
tex-fselch14.tfm \
tex-fselch16.tfm \
tex-fselch17.tfm \
tex-fselch20.tfm \
tex-fselch24.tfm \
tex-fselch32.tfm \
tex-fselch36.tfm \
tex-fselch6.tfm \
tex-fselch7.tfm \
tex-fselch8.tfm \
tex-fselch9.tfm \
tex-pkelch10.tfm \
tex-pkelch11.tfm \
tex-pkelch12.tfm \
tex-pkelch14.tfm \
tex-pkelch16.tfm \
tex-pkelch8.tfm \
tex-pkelch9.tfm \
texlive-bartel-chess-fonts"

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
