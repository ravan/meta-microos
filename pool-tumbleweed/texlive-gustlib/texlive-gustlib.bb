SUMMARY = "Plain macros for much core and extra functionality, from GUST"
DESCRIPTION = "Includes bibliography support, token manipulation, \
cross-references, verbatim, determining length of a paragraph's \
last line, multicolumn output, Polish bibliography and index \
styles, prepress and color separation, graphics manipulation, \
tables."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn54074"

RPM_NAME = "texlive-gustlib-2026.226.svn54074-60.4.noarch.rpm"
RPM_HASH = "35e2f59c66d3c37b8ebf4c3b745e1854c9cc0db1baea9e53b0d57d7114fde157c919b76dfafed5c3b89f7b1d0a1cdb089b0f9fee29a88ae9a049759006daf114"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-biblotex.tex \
tex-infr-ex.tex \
tex-infram.tex \
tex-map.tex \
tex-mcol-ex.tex \
tex-meashor.tex \
tex-mimulcol.tex \
tex-plidxmac.tex \
tex-przyklad.tex \
tex-rbox-ex.tex \
tex-roundbox.tex \
tex-split.tex \
tex-tp-crf.tex \
tex-tsp.tex \
tex-tun.tex \
tex-verbatim-dek.tex \
texlive-gustlib"

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
