SUMMARY = "LaTeX pre-release executables and formats"
DESCRIPTION = "See the latex-base-dev package for information."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77830"

RPM_NAME = "texlive-latex-bin-dev-2026.226.svn77830-63.2.noarch.rpm"
RPM_HASH = "a03f46b7ea11fda77ec29a89b1ddfc8f9db8f833feda3c9a612b7ca8698577f34c5e4004b32ffd9cd488dcb65749c645969cfb2b5de41efceb41e71208234563"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-dvilualatex-dev.1 \
man-latex-dev.1 \
man-lualatex-dev.1 \
man-pdflatex-dev.1 \
man-platex-dev.1 \
man-uplatex-dev.1 \
man-xelatex-dev.1 \
texlive-latex-bin-dev"

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
texlive-babel \
texlive-cm \
texlive-dehyph \
texlive-filesystem \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-knuth-lib \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3backend-dev \
texlive-l3kernel-dev \
texlive-latex-base-dev \
texlive-latex-bin-dev-bin \
texlive-latex-firstaid-dev \
texlive-latex-fonts \
texlive-latex-graphics-dev \
texlive-latexconfig \
texlive-lm \
texlive-luahbtex \
texlive-luaotfload \
texlive-luatex \
texlive-pdftex \
texlive-scripts \
texlive-scripts-bin \
texlive-tex-ini-files \
texlive-unicode-data"

inherit rpm
