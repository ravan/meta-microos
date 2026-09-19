SUMMARY = "Draw objects for Chemistry laboratories"
DESCRIPTION = "Pst-labo is a PSTricks related package for drawing basic and \
complex chemical objects. The documentation of the package is \
illuminated with plenty of illustrations together with their \
source code, making it an easy read."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.07svn74874"

RPM_NAME = "texlive-pst-labo-2026.226.2.07svn74874-59.2.noarch.rpm"
RPM_HASH = "d60641c8093a11444e4c251dea71863f9a8d01013acafd64f4cbb1f7c3329a439403bfc57be47039aa0dadb3291dbf6aa786d80e1664d36da205f70c52ad04d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-labo.sty \
tex-pst-labo.tex \
tex-pst-laboObj.tex \
texlive-pst-labo"

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
