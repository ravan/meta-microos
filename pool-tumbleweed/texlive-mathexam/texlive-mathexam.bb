SUMMARY = "Package for typesetting exams"
DESCRIPTION = "The package can help you typeset exams (mostly in mathematics \
and related disciplines where students are required to show \
their calculations followed by one or more short answers). It \
provides commands for inclusion of space for calculations, as \
well as commands for automatic creation of 'answer spaces'. In \
addition, the package will automatically create page headers \
and footers, and will let you include instructions and space \
for students to put their name."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.00svn15878"

RPM_NAME = "texlive-mathexam-2026.226.1.00svn15878-59.2.noarch.rpm"
RPM_HASH = "5a26631e36f5104e5540c514270c77d24340feecbc1e0f196e49d6ac4eda1f270c9ac197cc1ded101c391f59020b37e98d89527e27b1fb62d8b27cc78fa05136"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mathexam.sty \
texlive-mathexam"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fancyhdr.sty \
tex-ifthen.sty \
tex-lastpage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
