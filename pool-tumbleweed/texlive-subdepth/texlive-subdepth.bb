SUMMARY = "Unify maths subscript height"
DESCRIPTION = "This package is based on code (posted long ago to comp.text.tex \
by Donald Arseneau) to equalise the height of subscripts in \
maths. The default behaviour is to place subscripts slightly \
lower when there is a superscript as well, but this can look \
odd in some situations."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn77682"

RPM_NAME = "texlive-subdepth-2026.226.0.0.1svn77682-64.2.noarch.rpm"
RPM_HASH = "fd7494b775e690863531e0d5911c3a01cea4aa931a54f69990b9002649ecc3fe8425bfcc621dacb0c0d72cef51b5abf7c7a020f7f12b433c52b7d4ffde4a856c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-subdepth.sty \
texlive-subdepth"

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
