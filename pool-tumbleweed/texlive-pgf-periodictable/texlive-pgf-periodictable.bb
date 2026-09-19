SUMMARY = "Create custom periodic tables of elements"
DESCRIPTION = "The purpose of this package is to provide the Periodic Table of \
Elements in a simple way. It relies on PGF/TikZ to offer a full \
or partial periodic table with a variety of options and \
displaying the desired data for all the 118 elements. It can be \
done in different languages: English, French, German, \
Portuguese (from Portugal and from Brazil), Spanish, Italian \
and translations provided by user contributions -- currently in \
Dutch and Chinese. Compatible with pdfLaTeX, LuaLaTeX and \
XeLaTeX engines."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1.5svn73886"

RPM_NAME = "texlive-pgf-periodictable-2026.226.2.1.5svn73886-58.2.noarch.rpm"
RPM_HASH = "e0e97d92199e0df6f00fad878dde6b641c0281c014dbca054ac26dc48de2e73f9a893ff8c2516bb36f815253abe7167cee13b43c83ed8001a20c770e9b04f8be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgf-PeriodicTable.sty \
tex-pgfPT.backcolors.keys.tex \
tex-pgfPT.buildcell.tex \
tex-pgfPT.coordinates.tex \
tex-pgfPT.data.tex \
tex-pgfPT.drawing.keys.tex \
tex-pgfPT.formatNumbers.tex \
tex-pgfPT.input.library.tex \
tex-pgfPT.labels.tex \
tex-pgfPT.lang.nl.tex \
tex-pgfPT.lang.undefined.tex \
tex-pgfPT.lang.zh.tex \
tex-pgfPT.library.colorschemes.tex \
tex-pgfPT.names.tex \
tex-pgfPT.process.language.tex \
texlive-pgf-periodictable"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontenc.sty \
tex-fontspec.sty \
tex-lmodern.sty \
tex-silence.sty \
tex-tikz.sty \
tex-zhnumber.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
