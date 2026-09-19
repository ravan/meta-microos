SUMMARY = "Typeset notes, in the margin"
DESCRIPTION = "The package provides a macro \\sidenote, that places a note in \
the margin of the document, with its baseline aligned with the \
baseline in the body of the document. These sidenotes are \
numbered (both in the text, and on the notes themselves). The \
package loads the package etoolbox, pgfopts and marginnote."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7svn77682"

RPM_NAME = "texlive-snotez-2026.226.0.0.7svn77682-64.2.noarch.rpm"
RPM_HASH = "710c159915aa62b4409b001a877d51ec11aa7687c4cf411df5702883447dc964642e1e0ea089c9c8faebb721f129d1406e343a4ba5ab43913498fda56b61d005"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-snotez.sty \
texlive-snotez"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-marginnote.sty \
tex-pgfopts.sty \
tex-zref-perpage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
