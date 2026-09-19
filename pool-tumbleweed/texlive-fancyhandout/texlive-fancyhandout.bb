SUMMARY = "A LaTeX class for producing nice-looking handouts"
DESCRIPTION = "This package breaks with some of LaTeX's principles and \
redefines basic LaTeX commands with the aim of producing \
well-designed and clearly structured handouts: A sans-serif \
font is used by default; sections are not numbered, but \
highlighted by underlining; head- and footline display document \
information; and in order to avoid too much whitespace around \
the text the margin sizes are adjusted to smaller values. All \
in all, fancyhandout provides a means of typesetting documents \
not exclusively consisting of running text in a beautiful way. \
fancyhandout depends on the following other LaTeX packages: \
csquotes, enumitem, etoolbox, fancyhdr, geometry, and xcolor."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn46411"

RPM_NAME = "texlive-fancyhandout-2026.226.svn46411-59.2.noarch.rpm"
RPM_HASH = "01dea2070515535caa92bd50a8bc1692fa3140a724e570829fb387978c14e04efd934b52e21b01938c85b44859e320e47c063670692a90e0cbfe9c1614945b36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fancyhandout.cls \
texlive-fancyhandout"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-csquotes.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
