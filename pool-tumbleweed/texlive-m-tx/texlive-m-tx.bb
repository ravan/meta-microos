SUMMARY = "A preprocessor for pmx"
DESCRIPTION = "M-Tx is a preprocessor to pmx, which is itself a preprocessor \
to musixtex, a music typesetting system. The prime motivation \
to the development of M-Tx was to provide lyrics for music to \
be typeset. In fact, pmx now provides a lyrics interface, but \
M-Tx continues in use by those who prefer its language."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.63dsvn78106"

RPM_NAME = "texlive-m-tx-2026.226.0.0.63dsvn78106-59.2.noarch.rpm"
RPM_HASH = "2c95dcecae89098f23cb8532916a04c73cb1bd1d7bddfb90685e446bf0750609f046c090e85927b38f4a9ba32bcddd67e82b885ff0bbf27a5da63a906f62b017"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mtx.tex \
tex-mtxlatex.sty \
texlive-m-tx"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-m-tx-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
