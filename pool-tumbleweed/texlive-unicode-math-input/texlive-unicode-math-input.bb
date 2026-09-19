SUMMARY = "Allow entering Unicode symbols in math formulas"
DESCRIPTION = "This package allows entering Unicode symbols in math formulas. \
Unlike the unicode-math package, this does not change the math \
output encoding."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn76924"

RPM_NAME = "texlive-unicode-math-input-2026.226.0.0.1.1svn76924-60.2.noarch.rpm"
RPM_HASH = "26a90fc9773a73a21592c5f2f577dbca6e5d638c744ee75cf511482623e5448acd4481b3e80f0e5842f62c085eda106ae07c2bab92bb6c02b4acaff9f3793bb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-unicode-math-input-table.tex \
tex-unicode-math-input.sty \
texlive-unicode-math-input"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-iftex.sty \
tex-l3keys2e.sty \
texlive \
texlive-filesystem \
texlive-iftex \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3packages \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
