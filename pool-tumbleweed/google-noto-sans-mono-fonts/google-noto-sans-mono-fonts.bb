SUMMARY = "Noto Mono Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Mono Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-mono-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "bce00c834b1e1bb214e692cba2f069be9a3f10b193bb1d8387e2804153cc5a5e42010a2d16a768621bfb4c44956bab64598b65e71ebc5beedc6572735e403351"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-mono-fonts \
noto-mono \
noto-mono-fonts \
noto-sans-mono \
noto-sans-mono-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
