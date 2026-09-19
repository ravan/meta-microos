SUMMARY = "Short introduction to LaTeX, Spanish translation"
DESCRIPTION = "A Spanish translation of the Short Introduction to LaTeX2e, \
version 20."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn35050"

RPM_NAME = "texlive-lshort-spanish-2026.226.0.0.5svn35050-59.2.noarch.rpm"
RPM_HASH = "c28f0d85e46434e33f97bdc05063f060bfe65faf94583442edd0d55878a10d9d9ef70300ba67850b1fe6697c470317b02244f7e0948adf969206cbc406db5333"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-spanish"

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
