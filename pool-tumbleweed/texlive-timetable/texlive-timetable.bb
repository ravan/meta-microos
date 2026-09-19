SUMMARY = "Generate timetables"
DESCRIPTION = "A highly-configurable package, with nice output and simple \
input. The macros use a radix sort mechanism so that the order \
of input is not critical."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-timetable-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "1e6449e1b551abb6c9f53e2626fab0a206d92a5d156c4dc2b51f035e72d14e614756bcfa9f0fee1e2eaac350cd1890bead370ecefe9e51578af26336226177ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-timetable.tex \
texlive-timetable"

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
