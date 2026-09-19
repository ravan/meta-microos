SUMMARY = "Mark sections of a document"
DESCRIPTION = "The package provides environments to highlight significant \
portions of text within a document, by putting the text in a \
box and adding an icon in the margin. (The icons are provided \
as 'fig' sources, processable by xfig.)"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn42428"

RPM_NAME = "texlive-notes-2026.226.1.0.1svn42428-61.2.noarch.rpm"
RPM_HASH = "1e95f3d519e9fa3644f1ac398d9d3197a5b56c6c28d11718d457c2838b75f758a150ba4e49fdb877f7bc76136899dbbb4bb3dca02031092de59454306e69b04b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-notes.sty \
texlive-notes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphics.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
