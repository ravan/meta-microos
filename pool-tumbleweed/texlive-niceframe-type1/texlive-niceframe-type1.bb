SUMMARY = "Type 1 versions of the fonts recommended in niceframe"
DESCRIPTION = "The bundle provides Adobe Type 1 versions of the fonts \
bbding10, dingbat, karta15, umranda and umrandb."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn71849"

RPM_NAME = "texlive-niceframe-type1-2026.226.svn71849-61.2.noarch.rpm"
RPM_HASH = "8ce0dd05dc5a92b90065787b3cecac346c195e63b4860a91358ee12ff4d4bbc76b3acedb93e306485604da539d14725ae91dcebc079bb4224d45409f58a1ebc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-niceframe.map \
texlive-niceframe-type1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-niceframe-type1-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
