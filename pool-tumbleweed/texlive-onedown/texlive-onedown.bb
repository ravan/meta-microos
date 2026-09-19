SUMMARY = "Typeset Bridge Diagrams"
DESCRIPTION = "This is a comprehensive package to draw all sorts of bridge \
diagrams, including hands (stand alone or arround a compass), \
bidding tables (stand alone or in connection with \
hands/compass), trick tables, and expert quizzes. Features: \
Works for all fontsizes from \\ssmall to \\HUGE. Different fonts \
for hands, bidding diagrams, compass, etc. are possible. \
Annotations to card and bidding diagrams. Automated check on \
consistency of suit and hands. Multilingual output of bridge \
terms. Extensive documentation: User manual, Reference manual, \
and Examples."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7svn69067"

RPM_NAME = "texlive-onedown-2026.226.1.7svn69067-61.2.noarch.rpm"
RPM_HASH = "7c84b2e163168e5b34e100ab1b59dab1538f2488d86de18c3861b7b186638b1680871b2d92f0daa973f3ea1f917e1dab409830a7681d7e523be1330c3cf1c7f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-onedown.sty \
texlive-onedown"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
