SUMMARY = "Fancy section separators"
DESCRIPTION = "This package provides fancy separators, which are visual cues \
that indicate a change of subject or context without actually \
starting a new chapter or section."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4.0svn77682"

RPM_NAME = "texlive-froufrou-2026.226.1.4.0svn77682-60.2.noarch.rpm"
RPM_HASH = "d980470687d0e8f356b102a4a9f6b364cd6e5f8f08ac9ab76461de13506a6d773ddb0c4c97d02af7f174a34f5734098f6402f70fb5a0233d08f71b85db9b6116"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-froufrou.sty \
texlive-froufrou"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-expl3.sty \
tex-fourier-orns.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
