SUMMARY = "Drawing very thick lines and curves"
DESCRIPTION = "The package supports drawing of very thick lines and curves in \
PSTricks, with various fillings for the body of the lines."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn16369"

RPM_NAME = "texlive-pst-thick-2026.226.1.0svn16369-60.4.noarch.rpm"
RPM_HASH = "ed661ec752c0805c4c7553b6c66f430531fc94d8e5fb0831b3f2bf8ffad8f8ff16a3b0584fb23eab6624d89acc728c5a4d298ff8ee597a425117e7bebd6e3e84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-thick.sty \
tex-pst-thick.tex \
texlive-pst-thick"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
