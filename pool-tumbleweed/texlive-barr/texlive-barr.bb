SUMMARY = "Diagram macros by Michael Barr"
DESCRIPTION = "Diagxy is a general diagramming package, useful for diagrams in \
a number of mathematical disciplines. Diagxy is a development \
of an earlier (successful) package to use the facilities of the \
xypic bundle."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn38479"

RPM_NAME = "texlive-barr-2026.226.svn38479-60.2.noarch.rpm"
RPM_HASH = "230d476c501ebb707f36864adb9d4d547f260150f5085f42685c32b4164624dc8d7e6c1cf7c048c1cc4a72f62e68b0ddcd2bc91ad2def339b35e53970b8b1193"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-diagxy.tex \
texlive-barr"

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
