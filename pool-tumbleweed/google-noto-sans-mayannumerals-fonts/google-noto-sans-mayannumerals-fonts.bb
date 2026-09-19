SUMMARY = "Noto Mayan Numerals Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
MayanNumerals Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-mayannumerals-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "49ef20c3a13b79adc6b7b487e51a7d3f0ef9dda3827f63ddd08003657fe459bbc79114293c1c7e74ced305d8cf87668a2f1db9e23f240038a57ba0ebb343aed4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-mayannumerals-fonts \
noto-sans-mayannumerals \
noto-sans-mayannumerals-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
