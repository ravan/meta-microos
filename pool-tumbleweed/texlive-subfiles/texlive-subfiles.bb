SUMMARY = "Individual typesetting of subfiles of a 'main' document"
DESCRIPTION = "Using this package the user can handle multi-file projects more \
comfortably, making it possible to both process the subsidiary \
files by themselves and to process the main file that includes \
them, without making any changes to either."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn77682"

RPM_NAME = "texlive-subfiles-2026.226.2.2svn77682-64.2.noarch.rpm"
RPM_HASH = "e3c5f273e7a9a8eaea5f109199edb6748de2c537af9cf19c96628a5df49dddbb86446cd927b8dac71248f7489f7279a89d4840d82c57c3521b4eb46f666b9986"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-subfiles.cls \
tex-subfiles.sty \
texlive-subfiles"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-import.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-import \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
