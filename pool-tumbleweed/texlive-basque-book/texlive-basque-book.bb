SUMMARY = "Class for book-type documents written in Basque"
DESCRIPTION = "The class is derived from the LaTeX book class. The extensions \
solve grammatical and numeration issues that occur when \
book-type documents are written in Basque. The class is useful \
for writing books, PhD and Master Theses, etc., in Basque."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.20svn32924"

RPM_NAME = "texlive-basque-book-2026.226.1.20svn32924-60.2.noarch.rpm"
RPM_HASH = "b5313da858c861dae34912d8f70428a418e0811ad7230575dbd85d7d98a7e3cf4dfea956ad69b41110aa891cdaba693694399cbc8e95c5ed734cecb219986091"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-basque-book.cls \
texlive-basque-book"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-basque-date.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
