SUMMARY = "Draw timetables and other organizational matters useful for planning a semester"
DESCRIPTION = "This LaTeX package provides commands to print timetables, lists \
of appointments and exams. Also it is possible to draw \
calendars of specified ranges (and mark dates which were \
previously listed). Drawing the timetable is based on TikZ, \
which makes it very flexible."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.2svn71322"

RPM_NAME = "texlive-semesterplannerlua-2026.226.1.1.2svn71322-60.2.noarch.rpm"
RPM_HASH = "c728f87ab2e8eb26694955f83661dc2d5d3882dac0aedfe311f5cc5d172c040af055111369710a1a471ea39f003a887eb9dd86c476bd81a9430e3470d3935983"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-semesterplannerlua.sty \
texlive-semesterplannerlua"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontawesome.sty \
tex-luapackageloader.sty \
tex-pgfkeys.sty \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
