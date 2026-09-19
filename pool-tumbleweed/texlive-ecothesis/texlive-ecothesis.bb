SUMMARY = "LaTeX thesis template for the Universidade Federal de Vicosa (UFV), Brazil"
DESCRIPTION = "The package provides a LaTeX thesis template for the \
Universidade Federal de Vicosa (UFV), Brazil."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn48007"

RPM_NAME = "texlive-ecothesis-2026.226.1.2svn48007-61.4.noarch.rpm"
RPM_HASH = "6ba5169a95c8c7575a3907290d8afba1883b43dd8388a2038edbb06893dfcc2d45f8ea34c901ccfea776ddeb1fb0b6ce4048e9430b42a1fe301161bd10358404"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ecothesis"

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
