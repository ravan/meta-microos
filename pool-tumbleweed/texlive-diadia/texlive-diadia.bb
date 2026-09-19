SUMMARY = "Package to keep a diabetes diary"
DESCRIPTION = "The diadia package allows you to keep a diabetes diary. \
Usually, this means keeping record of certain medical values \
like blood sugar, blood pressure, pulse or weight. It might \
also include other medical, pharmaceutical or nutritional data \
(HbA1c, insulin doses, carbohydrate units). The diadia package \
supports all of this plus more - simply by adding more columns \
to the data file! It is able to evaluate the data file and \
typesets formatted tables and derived plots. Furthermore, it \
supports medication charts and info boxes. Supported languages: \
English, German. Feel free to provide other translation files!"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn37656"

RPM_NAME = "texlive-diadia-2026.226.1.1svn37656-59.2.noarch.rpm"
RPM_HASH = "61678cb55feee96ccee52ba7e1fab92e18f2edf54dd40b53c021b078e07022e412953671edc8688a8d7ca4b40c351f23e6c55492f1aad95b2c3be438939276eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-diadia.cfg \
tex-diadia.sty \
texlive-diadia"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-booktabs.sty \
tex-calc.sty \
tex-colortbl.sty \
tex-environ.sty \
tex-ifthen.sty \
tex-multicol.sty \
tex-pgfcalendar.sty \
tex-pgfplots.sty \
tex-pgfplotstable.sty \
tex-tabularx.sty \
tex-tcolorbox.sty \
tex-translations.sty \
tex-xkeyval.sty \
texlive \
texlive-diadia-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
