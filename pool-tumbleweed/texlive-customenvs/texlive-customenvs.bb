SUMMARY = "Custom environments (MCQ, list with picked items, ...)"
DESCRIPTION = "The package provides some custom environments (Multiple Choice, \
list with chosen items, ...) based on existing environments. \
There exist also subpackages (for icons, exams, pictograms)."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.42fsvn77387"

RPM_NAME = "texlive-customenvs-2026.226.0.0.42fsvn77387-61.2.noarch.rpm"
RPM_HASH = "6b7ace64833739bd2af4205fb7696930fb2a307d63d52b447fbed67aa4189596872a1c3b7fa4dcee8ba2224d64b5d7f1f8bda5abc8a74bb20d20b1941e91d9a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-customenvs-exams.sty \
tex-customenvs-icons.sty \
tex-customenvs-macros.sty \
tex-customenvs-mathpictos.sty \
tex-customenvs-tikzpictos.sty \
tex-customenvs.sty \
texlive-customenvs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-calc.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-fontawesome5.sty \
tex-fontawesome6.sty \
tex-fontawesome7.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-inlinegraphicx.sty \
tex-listofitems.sty \
tex-multicol.sty \
tex-pas-tableur.sty \
tex-pgf.sty \
tex-randomlist.sty \
tex-settobox.sty \
tex-simplekv.sty \
tex-tabularray.sty \
tex-tcolorbox.sty \
tex-tikz-3dplot.sty \
tex-tikz.sty \
tex-twemojis.sty \
tex-varwidth.sty \
tex-xcolor.sty \
tex-xintexpr.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
