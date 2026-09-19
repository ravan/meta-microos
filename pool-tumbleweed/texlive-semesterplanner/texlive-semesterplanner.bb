SUMMARY = "Create beautiful semester timetables and more"
DESCRIPTION = "This package defines several useful environments for a \
beautiful printable semester plan. It includes a timetable \
(which is using the schedule-Package) as well as appointments, \
deadlines, and exams. The package requires color, TikZ, \
schedule, and fontawesome. Furthermore, documents need to be \
compiled with LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn56841"

RPM_NAME = "texlive-semesterplanner-2026.226.1.0svn56841-60.2.noarch.rpm"
RPM_HASH = "602336dec52754e80c89944423b3125504946485896b621eef2a83182f27d9de27c9b37e1f0114f6bedd04d359e5bd7fe3b9b0554487e19d3b8a6f009e8b9baf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-semesterplanner.sty \
texlive-semesterplanner"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-fontawesome.sty \
tex-schedule.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
