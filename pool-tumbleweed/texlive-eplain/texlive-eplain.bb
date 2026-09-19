SUMMARY = "Extended plain TeX macros"
DESCRIPTION = "An extended version of the plain TeX format, adding support for \
bibliographies, tables of contents, enumerated lists, verbatim \
input of files, numbered equations, tables, two-column output, \
footnotes, hyperlinks in PDF output and commutative diagrams. \
Eplain can also load some of the more useful LaTeX packages, \
notably graphics, graphicx (an extended version of graphics), \
color, autopict (a package instance of the LaTeX picture code), \
psfrag, and url."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.3.14svn71409"

RPM_NAME = "texlive-eplain-2026.226.3.14svn71409-61.4.noarch.rpm"
RPM_HASH = "9466f081149b644f68b3d29ef22d9284ff91c1a4a46a0847f7eb32de55a458a81b83f59e64f7ee51e17520ed829a402690f986159c46d83bbeda18d2fd1251de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-arrow.tex \
tex-btxmac.tex \
tex-eplain.tex \
texlive-eplain"

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
texlive-eplain-bin \
texlive-filesystem \
texlive-hyph-utf8 \
texlive-knuth-lib \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-latex-fonts \
texlive-pdftex \
texlive-plain \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
