SUMMARY = "A class for IU8 reports"
DESCRIPTION = "This package consists of a class file and style files for \
writing reports at the IU8 department of IU faculty of BMSTU \
(Bauman Moscow State Technical University). The class defines \
all headings, structure elements and other things in respect of \
Russian standard GOST 7.32-2017. But there are correctives to \
be compatible with our local IU8 department requirements."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9svn76373"

RPM_NAME = "texlive-bmstu-iu8-2026.226.1.9svn76373-59.2.noarch.rpm"
RPM_HASH = "acf13d7d3a3897c9e6777dd4379085691f55609a893ec64b296f8ececbff81fdadbb868e0fb5d01813158cb8262507f74eb093dac8a2cc872d6db1d80df7c75b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-BMSTU-IU8.cls \
tex-IU8-01-base.sty \
tex-IU8-02-construction.sty \
tex-IU8-03-numbering.sty \
tex-IU8-04-section-numbering.sty \
tex-IU8-05-figures.sty \
tex-IU8-06-tables.sty \
tex-IU8-07-footnotes.sty \
tex-IU8-08-formulas.sty \
tex-IU8-09-cites.sty \
tex-IU8-10-titlepage.sty \
tex-IU8-11-performers.sty \
tex-IU8-12-abstract.sty \
tex-IU8-13-contents.sty \
tex-IU8-14-terms-and-definitions.sty \
tex-IU8-15-list-of-abbreviations.sty \
tex-IU8-16-references.sty \
tex-IU8-17-appendices.sty \
tex-IU8-18-extra.sty \
tex-IU8-19-counters.sty \
tex-IU8-20-listing.sty \
tex-IU8-21-math.sty \
tex-IU8-22-algorithms.sty \
texlive-bmstu-iu8"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-algorithm2e.sty \
tex-amsthm.sty \
tex-anyfontsize.sty \
tex-article.cls \
tex-babel.sty \
tex-bookmark.sty \
tex-calc.sty \
tex-caption.sty \
tex-chngcntr.sty \
tex-csquotes.sty \
tex-enumitem.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-fontenc.sty \
tex-glossaries-extra.sty \
tex-graphicx.sty \
tex-hhline.sty \
tex-hyphsubst.sty \
tex-ifthen.sty \
tex-indentfirst.sty \
tex-inputenc.sty \
tex-lastpage.sty \
tex-lineno.sty \
tex-listings.sty \
tex-longtable.sty \
tex-multirow.sty \
tex-nowidow.sty \
tex-scrextend.sty \
tex-setspace.sty \
tex-stackengine.sty \
tex-tabto.sty \
tex-tabularx.sty \
tex-titlesec.sty \
tex-titletoc.sty \
tex-totcount.sty \
tex-ulem.sty \
tex-xassoccnt.sty \
tex-xcolor.sty \
tex-xltabular.sty \
tex-xstring.sty \
texlive \
texlive-algorithm2e \
texlive-amscls \
texlive-anyfontsize \
texlive-babel \
texlive-biblatex \
texlive-bookmark \
texlive-caption \
texlive-chngcntr \
texlive-csquotes \
texlive-enumitem \
texlive-fancyhdr \
texlive-filesystem \
texlive-float \
texlive-fontspec \
texlive-geometry \
texlive-glossaries \
texlive-glossaries-extra \
texlive-graphics \
texlive-ifoddpage \
texlive-koma-script \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-lastpage \
texlive-lineno \
texlive-listings \
texlive-ltablex \
texlive-multirow \
texlive-nowidow \
texlive-oberdiek \
texlive-relsize \
texlive-scripts \
texlive-scripts-bin \
texlive-setspace \
texlive-stackengine \
texlive-tabto-ltx \
texlive-titlesec \
texlive-tools \
texlive-totcount \
texlive-ulem \
texlive-xassoccnt \
texlive-xcolor \
texlive-xltabular \
texlive-xstring"

inherit rpm
