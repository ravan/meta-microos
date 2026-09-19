SUMMARY = "Polish-oriented document classes"
DESCRIPTION = "mwcls is a set of document classes for LaTeX2e designed with \
Polish typographical tradition in mind. Classes include: \
'mwart' (which is a replacement for 'article'), 'mwrep' \
(replacing 'report'), and 'mwbk' (replacing 'book'). Most \
features present in standard classes work with mwcls classes. \
Some extensions/exceptions include: sectioning commands allow \
for second optional argument (it is possible to state different \
texts for running head and for TOC), new environments \
'itemize*' and 'enumerate*' for lists with long items, page \
styles have variants for normal, opening, closing, and blank \
pages."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.77svn77050"

RPM_NAME = "texlive-mwcls-2026.226.0.0.77svn77050-61.2.noarch.rpm"
RPM_HASH = "6ccaa32284cd1d3379297c9b3c7953ed597826fa585ef14f94b1e1a3c6418467df5285dcf2e8217919b89e4bd148f59aeca22841aa283eae572e5239fcb58e28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mw10.clo \
tex-mw11.clo \
tex-mw12.clo \
tex-mwart.cls \
tex-mwbk.cls \
tex-mwbk10.clo \
tex-mwbk11.clo \
tex-mwbk12.clo \
tex-mwrep.cls \
texlive-mwcls"

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
