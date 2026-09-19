SUMMARY = "Left-blocking for letter class"
DESCRIPTION = "Used with the letter documentclass to set the letter in a \
fullblock style (everything at the left margin)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.03svn25434"

RPM_NAME = "texlive-fullblck-2026.226.1.03svn25434-60.2.noarch.rpm"
RPM_HASH = "cea07bd8bb1feee101ac89b27acff785d154198aedc5456550a55c0b657e24f398a825cc5a0c3a20c4e6cf248d58a4b8d5da71c94742adc400f71447d2236a0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fullblck.sty \
texlive-fullblck"

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
