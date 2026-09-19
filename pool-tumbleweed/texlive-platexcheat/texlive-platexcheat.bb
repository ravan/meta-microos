SUMMARY = "A LaTeX cheat sheet, in Japanese"
DESCRIPTION = "This is a translation to Japanese of Winston Chang's LaTeX \
cheat sheet (a reference sheet for writing scientific papers). \
It has been adapted to Japanese standards using pLaTeX, and \
also attached additional information of 'standard LaTeX' \
(especially about math-mode)."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1svn49557"

RPM_NAME = "texlive-platexcheat-2026.226.3.1svn49557-59.2.noarch.rpm"
RPM_HASH = "c7b155a958dcbc6647374dd0c366e8a23f39a5054948cee70618c79dd9e617fe652c78192a9cea103dc062a1dd8c8217a9b75d1970d4a1f99fdbb685c546bcec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-platexcheat"

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
