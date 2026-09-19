SUMMARY = "Put objects at an absolute position"
DESCRIPTION = "The (PSTricks-related) package provides a command \
\\pstPutAbs(x,y) to put an object at an arbitrary absolute (or \
even a relative) position on the page."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn15878"

RPM_NAME = "texlive-pst-abspos-2026.226.0.0.2svn15878-59.2.noarch.rpm"
RPM_HASH = "2cd2a021d6d83d190c1e8f93ab1e439bb12b6592a55abdd43c5e2d6bae7f94f247b3f5dd48802314077d60c53204848b1e10d941e305cff444eac725ffd5eee0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-abspos.sty \
tex-pst-abspos.tex \
texlive-pst-abspos"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
