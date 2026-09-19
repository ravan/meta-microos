SUMMARY = "A simple LaTeX document class to create folded leaflets using columns and boxes"
DESCRIPTION = "A simple LaTeX document class to create folded leaflets with \
the following key features: The document layout consists of a \
specific number of pages that can have varying widths and are \
placed next to each other. Each page contains one frame to \
contain typeset material. Material is typeset in boxes, and \
boxes are positioned in columns which in turn are placed into \
the frames on the pages of the document. Columns are predefined \
and then placed into the frame of a page in the document \
layout. This way, columns can be used on pages with varying \
widths. Boxes can have padding (including bleed) and a \
background and are positioned inside a column."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.3svn76924"

RPM_NAME = "texlive-leporello-2026.226.1.0.3svn76924-61.2.noarch.rpm"
RPM_HASH = "c76b7c4c3aa5eacba9866bd1f45d2525c0c632641c52c42cfc0f098c5ecf8f9562d61ccd0fe2ae9274eebe25676f3ed9e6e6353bc0b1f045e0c08442df7a60ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-leporello.cls \
texlive-leporello"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-l3draw.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
