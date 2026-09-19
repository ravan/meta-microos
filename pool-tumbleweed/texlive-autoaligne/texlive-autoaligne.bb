SUMMARY = "Align terms and members in math expressions"
DESCRIPTION = "This package allows to align terms and members between lines \
containing math expressions."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn77682"

RPM_NAME = "texlive-autoaligne-2026.226.1.5svn77682-60.2.noarch.rpm"
RPM_HASH = "921b33611a5b6575bf432da964773f093c5b7fcb2e14ff9e1f524626eb058905d52bf8d914d8a384a5b02120d3aebc04a8c8a65815432f094ae9168ce8cff191"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-autoaligne-fr.tex \
tex-autoaligne.sty \
tex-autoaligne.tex \
texlive-autoaligne"

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
