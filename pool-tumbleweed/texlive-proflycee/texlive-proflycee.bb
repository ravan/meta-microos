SUMMARY = "A LaTeX package for French maths teachers in high school"
DESCRIPTION = "This package provides some commands to help French mathematics \
teachers for 15-18 years olds, for example: solve equations to \
approximation ; calculate an approximate value of an integral ; \
present Python code or pseudocode, a Python execution console ; \
simplify calculations in fractional form, simplify roots ; \
display and use a trigonometric circle ; display a small \
diagram for the sign of an affine function or a trinomial ; ..."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.00dsvn77895"

RPM_NAME = "texlive-proflycee-2026.226.4.00dsvn77895-59.2.noarch.rpm"
RPM_HASH = "7d08da173f7b9b42902494c9060fbd743fcc7c874213949420ba0ea5d34945cf8878a8630027a7cecaa1ec8c9be858ae2e10e5b3839297220377f254cf6518e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ProfLycee-Light.sty \
tex-ProfLycee-Macros.sty \
tex-ProfLycee-Pictosbac.sty \
tex-ProfLycee.sty \
tex-proflycee-tools-aleatoire.tex \
tex-proflycee-tools-analyse.tex \
tex-proflycee-tools-arithm.tex \
tex-proflycee-tools-cliparts.tex \
tex-proflycee-tools-competences.tex \
tex-proflycee-tools-complexes.tex \
tex-proflycee-tools-ecritures.tex \
tex-proflycee-tools-espace.tex \
tex-proflycee-tools-exams.tex \
tex-proflycee-tools-geom.tex \
tex-proflycee-tools-graphiques.tex \
tex-proflycee-tools-listings.tex \
tex-proflycee-tools-minted.tex \
tex-proflycee-tools-piton.tex \
tex-proflycee-tools-probas.tex \
tex-proflycee-tools-pythontex.tex \
tex-proflycee-tools-recreat.tex \
tex-proflycee-tools-stats.tex \
tex-proflycee-tools-suites.tex \
tex-proflycee-tools-trigo.tex \
texlive-proflycee"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-FenetreCas.sty \
tex-amssymb.sty \
tex-fancyvrb.sty \
tex-fontawesome5.sty \
tex-fontawesome6.sty \
tex-fontawesome7.sty \
tex-graphicx.sty \
tex-hologo.sty \
tex-iftex.sty \
tex-ifthen.sty \
tex-listofitems.sty \
tex-mathtools.sty \
tex-nicefrac.sty \
tex-pgf.sty \
tex-pgffor.sty \
tex-pythontex.sty \
tex-randomlist.sty \
tex-settobox.sty \
tex-simplekv.sty \
tex-siunitx.sty \
tex-tabularray.sty \
tex-tcolorbox.sty \
tex-tikz.sty \
tex-tikz2d-fr.sty \
tex-tikz3d-fr.sty \
tex-tkz-tab.sty \
tex-xcolor.sty \
tex-xintbinhex.sty \
tex-xintexpr.sty \
tex-xinttools.sty \
tex-xkeyval.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
