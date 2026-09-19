SUMMARY = "Babel support for typesetting Vietnamese"
DESCRIPTION = "The package provides the language definition file for support \
of Vietnamese in babel."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn39246"

RPM_NAME = "texlive-babel-vietnamese-2026.226.1.4svn39246-60.2.noarch.rpm"
RPM_HASH = "54e7b28c5585cf5b07523ce78ed0358b204f5625efc32f309886973b4c0967b29e66d4844034d879ac089c9294a477e524a664958cb0b287b73586e93cda277c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-vietnamese.ldf \
texlive-babel-vietnamese"

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
