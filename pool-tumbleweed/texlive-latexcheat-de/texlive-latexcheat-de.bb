SUMMARY = "A LaTeX cheat sheet, in German"
DESCRIPTION = "This is a translation to German of Winston Chang's LaTeX cheat \
sheet (a reference sheet for writing scientific papers). It has \
been adapted to German standards using the KOMA script document \
classes."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn35702"

RPM_NAME = "texlive-latexcheat-de-2026.226.svn35702-61.2.noarch.rpm"
RPM_HASH = "3b43e1c2561fa8713cd077d9a206fa849ebd09896dd45a02d3860c8ac5c2620d0699a5b3980355395c9c8a78846bce20d0208ca343213984e41664ab587fc35e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexcheat-de"

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
