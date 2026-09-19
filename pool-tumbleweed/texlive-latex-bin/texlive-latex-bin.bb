SUMMARY = "LaTeX executables and man pages"
DESCRIPTION = "The latex-bin package"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77830"

RPM_NAME = "texlive-latex-bin-2026.226.svn77830-63.2.noarch.rpm"
RPM_HASH = "2ac9b8e5c65258dfd86f4d294ddf837e30e71479f6fb3cf9a10b7e2e44f2267591ad035a7f0f8f23388bc78d3930cf299425f405b0aada738cc66878845037df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-dvilualatex.1 \
man-latex.1 \
man-lualatex.1 \
man-pdflatex.1 \
texlive-latex-bin"

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
texlive-amsfonts \
texlive-babel \
texlive-cm \
texlive-cm-super \
texlive-dehyph \
texlive-dehyph-exptl \
texlive-ec \
texlive-filesystem \
texlive-firstaid \
texlive-graphics \
texlive-graphics-def \
texlive-hyph-utf8 \
texlive-hyphen-ancientgreek \
texlive-hyphen-base \
texlive-hyphen-german \
texlive-hyphen-greek \
texlive-knuth-lib \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3backend \
texlive-l3kernel \
texlive-latex \
texlive-latex-bin-bin \
texlive-latex-fonts \
texlive-latexconfig \
texlive-lm \
texlive-lua-uni-algos \
texlive-luahbtex \
texlive-luaotfload \
texlive-luatex \
texlive-pdftex \
texlive-ruhyphen \
texlive-scripts \
texlive-scripts-bin \
texlive-tex-ini-files \
texlive-ukrhyph \
texlive-unicode-data"

inherit rpm
