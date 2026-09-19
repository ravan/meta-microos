SUMMARY = "Generate sentences from economic articles"
DESCRIPTION = "This package is a blind text generator that outputs sentences \
inferred from abstracts of economic articles. All the \
paragraphs are taken with permission from \
https://ipsum.mwt.me/."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.8.2svn77682"

RPM_NAME = "texlive-econlipsum-2026.226.0.0.8.2svn77682-61.4.noarch.rpm"
RPM_HASH = "8a31fe37ee0c8feebb90d2fdd55ee4bec1aa6b60cd93fffdebf51bcb2369ca7e77d9009f871f69fc60e0a2e7a9f323146799b01ff0c17552ed9cf99f678a8901"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-econlipsum.sty \
texlive-econlipsum"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
