SUMMARY = "Document Class for Journal of the Physical Society of Japan"
DESCRIPTION = "The jpsj package"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.2svn66115"

RPM_NAME = "texlive-jpsj-2026.226.1.2.2svn66115-63.2.noarch.rpm"
RPM_HASH = "5cbb42ce6e68449fead065e66e63947b759b64c710edc290fbcc49747119e323a0702e85d8672994321221b9cf43aa5cb5b23905282f4c6c67b7b692bc6c9bc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jpsj2.cls \
texlive-jpsj"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-graphicx.sty \
tex-overcite.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
