SUMMARY = "Template for Huawei documents"
DESCRIPTION = "This unofficial package provides a class for creating documents \
for people working with Huawei Technologies Co., Ltd."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.19.1svn73148"

RPM_NAME = "texlive-huawei-2026.226.0.0.19.1svn73148-60.2.noarch.rpm"
RPM_HASH = "9eed83eb874158587ffd29626323ef1e22742ab90a2fbc47fe5b4d8f79c937fd4941b3af6575fe40dc810bb426572d43998ba723775c90b9e90b896c77a1bbf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-huawei.cls \
texlive-huawei"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-anyfontsize.sty \
tex-array.sty \
tex-article.cls \
tex-caption.sty \
tex-changepage.sty \
tex-currfile.sty \
tex-datetime.sty \
tex-enumitem.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-fontenc.sty \
tex-fontsize.sty \
tex-footmisc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-helvet.sty \
tex-hyperref.sty \
tex-inputenc.sty \
tex-lastpage.sty \
tex-libertine.sty \
tex-makecell.sty \
tex-microtype.sty \
tex-multicol.sty \
tex-pagecolor.sty \
tex-paralist.sty \
tex-pgfopts.sty \
tex-ragged2e.sty \
tex-setspace.sty \
tex-svg.sty \
tex-tabularx.sty \
tex-textpos.sty \
tex-tikz.sty \
tex-titlesec.sty \
tex-titling.sty \
tex-wrapfig.sty \
tex-xcolor.sty \
texlive \
texlive-anyfontsize \
texlive-biblatex \
texlive-caption \
texlive-catchfile \
texlive-changepage \
texlive-currfile \
texlive-datetime \
texlive-enumitem \
texlive-environ \
texlive-fancyhdr \
texlive-ffcode \
texlive-filehook \
texlive-filesystem \
texlive-fmtcount \
texlive-fontsize \
texlive-footmisc \
texlive-geometry \
texlive-hyperref \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-lastpage \
texlive-libertine \
texlive-listings \
texlive-listingsutf8 \
texlive-makecell \
texlive-microtype \
texlive-pagecolor \
texlive-paralist \
texlive-pdfcol \
texlive-pgf \
texlive-pgfopts \
texlive-ragged2e \
texlive-scripts \
texlive-scripts-bin \
texlive-setspace \
texlive-svg \
texlive-tcolorbox \
texlive-textpos \
texlive-tikzfill \
texlive-titling \
texlive-transparent \
texlive-trimspaces \
texlive-wrapfig \
texlive-xcolor"

inherit rpm
