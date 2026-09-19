SUMMARY = "Warn whenever a float is placed 'to far away'"
DESCRIPTION = "The package checks for floats that are placed too far from \
their origin. It was motivated by a question on the question \
and answer page."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn77682"

RPM_NAME = "texlive-chkfloat-2026.226.0.0.1svn77682-60.2.noarch.rpm"
RPM_HASH = "c3c3fbcc3e468cd36a9b250326fcc6af8b677a3d444ef05c0ed8d0e7d7092bbfe9a5be052338feb8c5a574e793efc30dc7b88812636ad00c422812c99e5c0df0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chkfloat.sty \
texlive-chkfloat"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
