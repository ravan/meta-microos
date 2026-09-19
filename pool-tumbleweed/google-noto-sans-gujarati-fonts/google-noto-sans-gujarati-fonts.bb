SUMMARY = "Noto Gujarati Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Gujarati Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-gujarati-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "905ec4266313a092ba381aba1a5ce493c42b7504a46ab395637a0e4273495c089de7878d3af7bd4be9ecb675d9fb6b6d4680c8b9020e3aac97e0c6c28dd15eec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-gujarati-fonts \
noto-sans-gujarati \
noto-sans-gujarati-fonts \
noto-sans-gujarati-ui \
noto-sans-gujarati-ui-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
