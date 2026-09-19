SUMMARY = "Typeset guitar chords"
DESCRIPTION = "A LaTeX package for typesetting of guitar chord diagrams, \
including options for chord names, finger numbers and \
typesetting above lyrics. The bundle also includes a TCL script \
(chordbox.tcl) that provides a graphical application which \
creates LaTeX files that use gchords.sty."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.20svn29803"

RPM_NAME = "texlive-gchords-2026.226.1.20svn29803-60.2.noarch.rpm"
RPM_HASH = "64aee9846c69864a1436ca979e767753cacbbfffd3e0306c73f200d5945ba4d596a4049b93d0c4dd3279e7a213f3bdca4856af09d822849753289bf9b5b7248f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gchords.sty \
texlive-gchords"

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
