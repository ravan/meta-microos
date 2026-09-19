SUMMARY = "Freed version of the book TeX by Topic"
DESCRIPTION = "An invaluable book, originally published by Addison-Wesley (who \
have released their copyright -- their version of the book went \
out of print in the 1990s). The book describes itself as 'a \
TeXnician's reference', and covers the way TeX (the engine) \
works in as much detail as most ordinary TeX programmers will \
ever need to know. A printed copy of the book, slightly \
updated, may be had (for a modest price) from DANTE. The \
original edition is available from Lulu. See the package home \
page for details."
LICENSE = "GFDL-1.3-or-later"

PV = "2026.227.svn68950"

RPM_NAME = "texlive-texbytopic-2026.227.svn68950-62.2.noarch.rpm"
RPM_HASH = "855e5c3f0e90814381511f613bd74a5482c4c4345b0eb5750d5ff1564b2661e458bdfcd2d7c054345d92e96b41944f736cd1557219b27eff0dfb66fa64b6907c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texbytopic"

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
