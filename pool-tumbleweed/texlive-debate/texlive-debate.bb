SUMMARY = "Debates between reviewers"
DESCRIPTION = "This package helps to organize debates between multiple \
reviewers of a paper within the text."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.1svn64846"

RPM_NAME = "texlive-debate-2026.226.0.0.2.1svn64846-59.2.noarch.rpm"
RPM_HASH = "10c15f4b94777b86bee518db23b8fc946ec8766fe4191bb2f0e1c0a4a7e349a28a2349c449d1fe86fa858728a0a75c8fe8cb00c5bffad60e2e3ac58c3f5a485c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-debate.sty \
texlive-debate"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tcolorbox.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-listings \
texlive-listingsutf8 \
texlive-pdfcol \
texlive-scripts \
texlive-scripts-bin \
texlive-tcolorbox \
texlive-xcolor \
texlive-xkeyval"

inherit rpm
