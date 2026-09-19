SUMMARY = "Generalisations of the page advance commands"
DESCRIPTION = "Provides \\clearpage and \\newpage variants that guarantee to end \
up on even/odd numbered pages; these 4 commands all have an \
optional argument whose content will be placed on any 'empty' \
page generated."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1asvn77682"

RPM_NAME = "texlive-nextpage-2026.226.1.1asvn77682-61.2.noarch.rpm"
RPM_HASH = "347d38896e1694a03dfc735b077be1acd4827d2212c517b25cb0967181730a8285f6bf65ac0b40a536f0ac7f0bd75f2a3b1d8651a8312731ced20f0fbb433ef1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nextpage.sty \
texlive-nextpage"

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
