SUMMARY = "A TeX extension for direct creation of PDF"
DESCRIPTION = "An extension of TeX which can directly generate PDF documents \
as well as DVI output. All current free TeX distributions \
including TeX Live, MacTeX and MiKTeX include pdfTeX (Plain \
TeX) and pdfLaTeX (LaTeX), among many other formats based on \
the pdfTeX engine."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn77868"

RPM_NAME = "texlive-pdftex-2026.226.svn77868-58.2.noarch.rpm"
RPM_HASH = "18d6b82782d88759bbf53bcc758020b1e7d05a4665ded7fe19da9ba5a08d27fef31407e7ce3f266162ca767849b12ee71b39c8092c07ac1b98ff7b84c0c07244"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dummy-space.map \
tex-dummy-space.tfm \
tex-glyphtounicode.tex \
tex-pdfcolor.tex \
tex-pdftex-dvi.tex \
tex-pdftexspace.tfm \
texlive-pdftex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
tex-load-unicode-data.tex \
tex-pdftexconfig.tex \
tex-updmap.cfg \
texlive \
texlive-cm \
texlive-dehyph \
texlive-etex \
texlive-filesystem \
texlive-graphics-def \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-knuth-lib \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pdftex-bin \
texlive-pdftex-fonts \
texlive-plain \
texlive-scripts \
texlive-scripts-bin \
texlive-tex-ini-files"

inherit rpm
