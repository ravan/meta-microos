SUMMARY = "Formulas frequently used in rigid body mechanics"
DESCRIPTION = "This package provides a number of formulas frequently used in \
rigid body mechanics. Since most of these formulas are long and \
tedious to write, this package wraps them up in short commands."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0svn60346"

RPM_NAME = "texlive-mecaso-2026.226.1.0svn60346-59.2.noarch.rpm"
RPM_HASH = "3eccc034f385c2f58bafcf545f25a4205323f512b8b67bf4a0d5f47b02c5c1745d08c9578b956f9a0690eec14edbcc42c6f43c69d1e219eaf3c5eabe792d6f0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mecaso.sty \
texlive-mecaso"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-mathrsfs.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
