SUMMARY = "'Tab' to a measured position in the line"
DESCRIPTION = "\\tabto{<length>} moves the typesetting position to <length> \
from the left margin of the paragraph. If the typesetting \
position is already further along, \\tabto starts a new line; \
the command \\tabto* will move position backwards if necessary, \
so that previous text may be overwritten. The command \
\\TabPositions may be used to define a set of tabbing positions, \
after which the command \\tab advances typesetting position to \
the next defined 'tab stop'."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.4svn78101"

RPM_NAME = "texlive-tabto-ltx-2026.227.1.4svn78101-62.2.noarch.rpm"
RPM_HASH = "68fe8c980b318955a23b906366c956db0ec883110af5114d57747d18f8b325d5cdba5ff9a3dfdc583d0e5f61916e272408f3709af710681d9162bb8c0fa6e0bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tabto.sty \
texlive-tabto-ltx"

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
