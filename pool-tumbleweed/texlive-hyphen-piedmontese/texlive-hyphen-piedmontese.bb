SUMMARY = "Piedmontese hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Piedmontese in ASCII encoding. \
Compliant with 'Gramatica dla lengua piemonteisa' by Camillo \
Brero."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-piedmontese-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "1dd1e0c26a96f26bc5c773337be4723675e165226293b4eb75a252d0681e413ac3cd850d519682c4665b262eb8cd4dc30c36057db6f73654b4d77d01ae24693a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-pms.tex \
tex-hyph-quote-pms.tex \
tex-loadhyph-pms.tex \
texlive-hyphen-piedmontese"

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
