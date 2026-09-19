SUMMARY = "Noto Syriac Western Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
SyriacWestern Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-syriacwestern-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "0b97ca503f6bfcb7d7ef128f3d18bd5cdbb5df5a36235cb3d676321c3969edf5ebc6a563718fd84d0ae798d7f4701f9a6e6899dd2050aaac3f2c282c94344f9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-syriacwestern-fonts \
noto-sans-syriacwestern \
noto-sans-syriacwestern-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
