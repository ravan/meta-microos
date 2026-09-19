SUMMARY = "Noto Tagbanwa Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Tagbanwa Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-tagbanwa-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "fb7b5030bea056b4adedf9c93b01c379e6518e032efcd8b86e6db8f91328d8ce45b59cbe2adec4fd1198e70dc11d061e4459eb40e2aef2561a646cfabed14895"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-tagbanwa-fonts \
noto-sans-tagbanwa \
noto-sans-tagbanwa-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
