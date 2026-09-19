SUMMARY = "Hooks for auxiliary files"
DESCRIPTION = "This package auxhook provides hooks for adding stuff at the \
begin of .aux files."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn77682"

RPM_NAME = "texlive-auxhook-2026.226.1.6svn77682-60.2.noarch.rpm"
RPM_HASH = "a476e8ae31d8eaea678e02eb7a508a8d59cbb1ae49ab65faa3e5885125afc64f5c62b2d82b6170178965ca6e2a1c3ec253f1caabcbe1a69866065c84e44e33c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-auxhook.sty \
texlive-auxhook"

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
