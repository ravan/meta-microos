SUMMARY = "Create thumb indexes for printed books"
DESCRIPTION = "The package can generate thumb indexes for your document. It \
features printing thumb indexes on one- or two-sided pages, \
along with background- and foreground-color selection and full \
LaTeX styling of the chapter numbers in the thumb indexes. The \
height of each thumb index is automatically chosen based on the \
number of chapters in your document, while the width is chosen \
by the user. The package is designed to work with the memoir \
class, and also requires PerlTeX and tikz/"
LICENSE = "GPL-2.0-or-later"

PV = "2026.227.0.0.1svn16736"

RPM_NAME = "texlive-thumby-2026.227.0.0.1svn16736-62.2.noarch.rpm"
RPM_HASH = "a56ebacbb3adcc048fdbf731c6330586b20a8abe195d84e226c1ad476861b1df69286c6fcefb037535df968585af7d7870d8bbb0f08d848b981321f2da005bde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-thumby.sty \
texlive-thumby"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bophook.sty \
tex-perltex.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
