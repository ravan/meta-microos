SUMMARY = "Noto Lao Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Lao Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-lao-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "71c3607045cc74771611021759ea51d2563be214a03925c50076d22d3e170edac8a822dc685ae15b8251f886593144c67d0f4555904c46296d33872f57a3bbd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-lao-fonts \
noto-sans-lao \
noto-sans-lao-fonts \
noto-sans-lao-ui \
noto-sans-lao-ui-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
