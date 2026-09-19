SUMMARY = "The LaTeX standard tools bundle"
DESCRIPTION = "A collection of (variously) simple tools provided as part of \
the LaTeX required tools distribution, comprising the packages: \
afterpage, array, bm, calc, dcolumn, delarray, enumerate, \
fileerr, fontsmpl, ftnright, hhline, indentfirst, layout, \
longtable, multicol, rawfonts, shellesc, showkeys, somedefs, \
tabularx, theorem, trace, varioref, verbatim, xr, and xspace."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76708"

RPM_NAME = "texlive-tools-2026.226.svn76708-59.2.noarch.rpm"
RPM_HASH = "58f75b88efdda6f89a9807df89a259285d9be2024697c7025a78f3aeff260e90e933812fe73888b6db00dab8a79c87979505f2dc2e2028e390c975d54215f462"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-afterpage.sty \
tex-array-2016-10-06.sty \
tex-array-2020-02-10.sty \
tex-array-2023-11-01.sty \
tex-array.sty \
tex-bm.sty \
tex-calc.sty \
tex-dcolumn.sty \
tex-delarray.sty \
tex-e.tex \
tex-enumerate.sty \
tex-fontsmpl.sty \
tex-fontsmpl.tex \
tex-ftnright.sty \
tex-h.tex \
tex-hhline.sty \
tex-indentfirst.sty \
tex-l3sys-query.sty \
tex-layout.sty \
tex-longtable-2020-01-07.sty \
tex-longtable.sty \
tex-multicol-2017-04-11.sty \
tex-multicol-2019-10-01.sty \
tex-multicol-2024-05-23.sty \
tex-multicol.sty \
tex-q.tex \
tex-r.tex \
tex-rawfonts.sty \
tex-s.tex \
tex-shellesc.sty \
tex-showkeys-2014-10-28.sty \
tex-showkeys.sty \
tex-somedefs.sty \
tex-tabularx.sty \
tex-thb.sty \
tex-thc.sty \
tex-thcb.sty \
tex-theorem.sty \
tex-thm.sty \
tex-thmb.sty \
tex-thp.sty \
tex-trace.sty \
tex-varioref-2016-02-16.sty \
tex-varioref.sty \
tex-verbatim.sty \
tex-verbtest.tex \
tex-x.tex \
tex-xr-2023-07-04.sty \
tex-xr.sty \
tex-xspace.sty \
texlive-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
texlive \
texlive-extratools \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
