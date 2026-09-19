SUMMARY = "Typeset musical pitches with octave designations"
DESCRIPTION = "This package typesets musical pitch names with designation for \
the octave in either the Helmholtz system (with octave \
numbers), or the traditional system (with prime symbols). \
Authors can just write \\pitch{C}{4} and the pitches will be \
rendered correctly depending on which package option was \
selected. The system can also be changed mid-document."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76790"

RPM_NAME = "texlive-octave-2026.226.svn76790-61.2.noarch.rpm"
RPM_HASH = "1c0124cb73bb3a04b0b831b0adf23e63571d5e2b45a4e408bdff58a30368d0088f1e990875e63459914dc5c0559d6666dbfe3d182c0f5cde263cd3f7e150554b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-octave.sty \
texlive-octave"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
