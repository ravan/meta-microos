SUMMARY = "Trees using epic and eepic macros"
DESCRIPTION = "The package recursively draws trees: each subtree is defined in \
a 'bundle' environment, with a set of leaves described by \
\\chunk macros. A chunk may have a bundle environment inside it."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1asvn15878"

RPM_NAME = "texlive-ecltree-2026.226.1.1asvn15878-61.4.noarch.rpm"
RPM_HASH = "deca4dc8e1af39aeef8fb9b2d615146a9f683cbbcd301fb90086aadbefa2dead33e7404d2742f33a233149965c18b8bbc5e95d6b4676b3dc41aea33ca7cd31df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ecltree.sty \
texlive-ecltree"

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
