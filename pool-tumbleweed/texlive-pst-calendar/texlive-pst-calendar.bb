SUMMARY = "Plot calendars in 'fancy' ways"
DESCRIPTION = "The package uses pstricks and pst-3d to draw tabular calendars, \
or calendars on dodecahedra with a month to each face (the \
package also requires the multido and pst-xkey packages). The \
package works for years 2000-2099, and has options for \
calendars in French German and English, but the documentation \
is not available in English."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.48svn60480"

RPM_NAME = "texlive-pst-calendar-2026.226.0.0.48svn60480-59.2.noarch.rpm"
RPM_HASH = "e195d682ad13bdd41c7dacf0ddaaa46610ad49d9053d7a1dc1005797077a384503225e923b3bf7ac3fd21f4d02dba50656186003133fa93914e41dd5cf07b4d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-calendar.sty \
texlive-pst-calendar"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fp.sty \
tex-multido.sty \
tex-pst-3d.sty \
tex-pst-xkey.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
