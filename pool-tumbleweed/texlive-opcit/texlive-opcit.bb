SUMMARY = "Footnote-style bibliographical references"
DESCRIPTION = "This package addresses the problem of expressing citations in a \
style that is natural for humanities studies, yet does not \
interfere with the flow of text (as author-year styles do). The \
package differs from footbib in that it uses real footnotes, \
potentially in the same series as any of the document's other \
footnotes. Opcit also, as its name implies, avoids repetition \
of full citations, achieving this, to a large extent, \
automatically."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn15878"

RPM_NAME = "texlive-opcit-2026.226.1.1svn15878-61.2.noarch.rpm"
RPM_HASH = "992567a0feb2b274f10a0b6cf4c4a905f45699262c1606188a2b7cd67c347994db976a500f611b7ec26a214bfccf2b659f854cd30ac6b600a49624d6ee71409b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-opcit.sty \
texlive-opcit"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperref.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
