SUMMARY = "Weekly schedules"
DESCRIPTION = "Automatically format weekly schedules using LaTeX's picture \
environment. It requires the packages calc and color. Its main \
feature is the accuracy with which appointments are \
represented: boxes drawn to represent a particular appointment \
are accurate to the minute -- i.e., a 31-minute appointment \
will have a box 1/30th longer than a 30-minute appointment. A \
number of features are included to allow the user to customize \
the output."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.20svn51805"

RPM_NAME = "texlive-schedule-2026.226.1.20svn51805-60.2.noarch.rpm"
RPM_HASH = "14e8ce386d7d88eff3d1f2c8e6177d8dded6722aeaec377926e4a947d18de864abbc18ca910825bf62a6ff578ff70f3dd7677b09e0313f2f2d9e74f64c33ce14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-schedule.sty \
texlive-schedule"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
