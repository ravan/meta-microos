SUMMARY = "Hebrew hyphenation patterns"
DESCRIPTION = "Prevents hyphenation in Arabic."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn74032"

RPM_NAME = "texlive-hyphen-hebrew-2026.226.svn74032-60.2.noarch.rpm"
RPM_HASH = "70488a5ded79847dd11134ff89c34ee888efb08aa7f6fce42911f4992529b4bca9614ef80d9b26edb1eadb0d87f41bb5ca90c505abf6263e6837258baa27b072"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-he.tex \
texlive-hyphen-hebrew"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
texlive \
texlive-filesystem \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
