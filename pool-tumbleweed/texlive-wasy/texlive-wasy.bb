SUMMARY = "The wasy fonts (Waldi symbol fonts)"
DESCRIPTION = "This font contains all lasy characters (by L.Lamport, copyright \
notice in lasychr.mf), and a lot more symbols. Provided are the \
Metafont files for 5-10pt, and bold and slanted 10pt fonts, \
together with a .tex and .pdf documentation, and a file for \
using the fonts in a PLAIN-TeX document. Type-1 fonts by \
Michael Sharpe and Taco Hoekwater are available as separate \
package wasy-type1. Support under LaTeX is provided by Axel \
Kielhorn's wasysym package."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.2.5svn53533"

RPM_NAME = "texlive-wasy-2026.226.2.5svn53533-60.2.noarch.rpm"
RPM_HASH = "39808001974554dfaa1c9500a26c471caa4fdebee55ec34541fac2a0fcb5ed7c4d0361ed72383f0ad19ef4a276c0d9a3173d2f9760aadfc29f5ea189784ff286"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-wasy10.tfm \
tex-wasy5.tfm \
tex-wasy6.tfm \
tex-wasy7.tfm \
tex-wasy8.tfm \
tex-wasy9.tfm \
tex-wasyb10.tfm \
tex-wasyfont.tex \
tex-wasysl10.tfm \
texlive-wasy"

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
