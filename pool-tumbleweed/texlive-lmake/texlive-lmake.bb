SUMMARY = "Process lists to do repetitive actions"
DESCRIPTION = "The package provides commands to simplify processing of \
sequential list-like structures, such as making a series of \
'similar' commands from a list of names."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn25552"

RPM_NAME = "texlive-lmake-2026.226.1.0svn25552-61.2.noarch.rpm"
RPM_HASH = "d85b30a215becc48fd7231b1419e8beadb34d3d0302ac1c7275cbfebeda74da52db2ff24109e2603a2493b7d6e070ee602fcd0d087f2a890bf413e3af94bb13e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lmake.sty \
texlive-lmake"

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
