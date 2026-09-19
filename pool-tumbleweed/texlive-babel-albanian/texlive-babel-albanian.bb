SUMMARY = "Support for Albanian within babel"
DESCRIPTION = "The package provides support for typesetting Albanian (as part \
of the babel system)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0dsvn77682"

RPM_NAME = "texlive-babel-albanian-2026.226.1.0dsvn77682-60.2.noarch.rpm"
RPM_HASH = "2659d794d0047c7a4ce0d3c45e2ce5d780b7238e25b6e1bea3b013bc3c6022d272e292ada3679f43fd552396063891208dc27af45bd65fe4a33175f96500a0f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-albanian.ldf \
texlive-babel-albanian"

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
