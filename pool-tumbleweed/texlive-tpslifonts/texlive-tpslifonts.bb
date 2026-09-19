SUMMARY = "A LaTeX package for configuring presentation fonts"
DESCRIPTION = "This package aims to improve of font readability in \
presentations, especially with maths. The standard cm maths \
fonts at large design sizes are difficult to read from far \
away, especially at low resolutions and low contrast color \
choice. Using this package leads to much better overall \
readability of some font combinations. The package offers a \
couple of 'harmonising' combinations of text and maths fonts \
from the (distant) relatives of computer modern fonts, with a \
couple of extras for optimising readability. Text fonts from \
computer modern roman, computer modern sans serif, SliTeX \
computer modern sans serif, computer modern bright, or concrete \
roman are available, in addition to maths fonts from computer \
modern maths, computer modern bright maths, or Euler fonts. The \
package is part of the TeXPower bundle."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.6svn42428"

RPM_NAME = "texlive-tpslifonts-2026.226.0.0.6svn42428-59.2.noarch.rpm"
RPM_HASH = "0ac71c01f8f17453e903dfc1f44d8d8c5de757fc9c0834f1a343ecd30ca8dbd4d61b9f58f82485eace2a35736e6d72e048d0b2007034a4841d51787e22137b76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tpslifonts.sty \
texlive-tpslifonts"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cmbright.sty \
tex-eulervm.sty \
tex-ifthen.sty \
tex-t1cmdh.fd \
tex-t1cmfib.fd \
tex-t1cmfr.fd \
tex-t1cmr.fd \
tex-t1cmss.fd \
tex-t1cmtt.fd \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
