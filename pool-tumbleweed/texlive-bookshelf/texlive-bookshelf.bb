SUMMARY = "Create a nice image from a BibTeX file"
DESCRIPTION = "This package turns a BibTeX bibliography file into a \
randomly-coloured, randomly-sized shelf of books, with the \
title and author in a randomly-chosen typeface."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn72521"

RPM_NAME = "texlive-bookshelf-2026.226.1.2svn72521-59.2.noarch.rpm"
RPM_HASH = "79d81eacdd8c02b9b4aad949986683c617bdbd6f76cfd6a0d7c098e26c5df30bb1609a8bc5ebd056712812b832230e60f8be64bc1b6a546c096b666e571d5e54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bookshelf-svgnam.tex \
tex-bookshelf.cls \
texlive-bookshelf"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Getopt--Long \
perl-Pod--Usage \
perl-open \
perl-strict \
sed \
tex-calc.sty \
tex-eso-pic.sty \
tex-fix-cm.sty \
tex-fontspec.sty \
tex-fp.sty \
tex-graphicx.sty \
tex-random.tex \
tex-report.cls \
tex-xcolor.sty \
texlive \
texlive-bookshelf-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
