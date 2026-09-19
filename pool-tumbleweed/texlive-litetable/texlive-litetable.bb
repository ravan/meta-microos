SUMMARY = "Class schedules with colorful course blocks"
DESCRIPTION = "This package provides a colorful timetable design, developed \
using expl3, and based on TikZ."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.9asvn77682"

RPM_NAME = "texlive-litetable-2026.226.3.9asvn77682-61.2.noarch.rpm"
RPM_HASH = "109ba8eeb5c7c4115a1d330d686db4673a22754ac9f6677f68bd3255e590e5b5d30d0402f44f08a20f0cdeda4cb9fb6f5bdcd303bd34f54baa55f6abc19bf65a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-litetable.sty \
texlive-litetable"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
