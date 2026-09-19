SUMMARY = "Footnotes for critical editions"
DESCRIPTION = "The package aims to provide a 'one-stop' solution to \
requirements for footnotes. It offers: Multiple footnote \
apparatus superior to that of manyfoot Footnotes can be \
formatted in separate paragraphs, or be run into a single \
paragraph (this choice may be selected per footnote series); \
Things you might have expected (such as \\verb-like material in \
footnotes, and colour selections over page breaks) now work. \
Note that the majority of the bigfoot package's interface is \
identical to that of manyfoot; users should seek information \
from that package's documentation. The bigfoot bundle also \
provides the perpage and suffix packages."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.1svn77682"

RPM_NAME = "texlive-bigfoot-2026.226.2.1svn77682-61.2.noarch.rpm"
RPM_HASH = "bbcd75ea02bd268b7fe01202aea636e3d741ea067e8a4b4be95b91ce478ccde0fcd304bfaeef5602d09599b1bdf32f57620419f34def2a2189d5ace538ef4a91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bigfoot.sty \
tex-perpage.sty \
tex-suffix.sty \
texlive-bigfoot"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etex.sty \
tex-manyfoot.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
