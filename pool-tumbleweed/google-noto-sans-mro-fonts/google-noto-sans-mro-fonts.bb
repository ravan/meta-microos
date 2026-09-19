SUMMARY = "Noto Mro Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Mro Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-mro-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "a20c2441f220d41c11d312da2dbc9663952122c5699ff0e56f3048d3745fd38088b8b5037bd3bb35c65372c29b0376a559ffde9b53a4e64690194b84db4d7e68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-mro-fonts \
noto-sans-mro \
noto-sans-mro-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
