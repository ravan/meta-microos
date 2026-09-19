SUMMARY = "Deal with database, loop, and random in order to build personalized exercises"
DESCRIPTION = "The main aim of this package is to work on lists, especially \
with random operations. The hidden aim is to build a personal \
collection of exercises with different data for each pupil."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn76924"

RPM_NAME = "texlive-randomlist-2026.226.1.3svn76924-60.4.noarch.rpm"
RPM_HASH = "c90f198e77a55eb29702aa26500e24e0775a73e4ba94a3c347c8e05d8d1a805ceee268bc4585a06a5c03689ca103d8605d989c2a80863d20122034b7a2676aa6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-randomlist.sty \
tex-randomlist.tex \
texlive-randomlist"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
