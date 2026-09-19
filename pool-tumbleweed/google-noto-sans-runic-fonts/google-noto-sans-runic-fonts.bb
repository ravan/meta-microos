SUMMARY = "Noto Runic Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Runic Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-runic-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "74fa21fa967005113ade70579731b1ffbddb6404f4dd07acf5e23203d9539391357ad1710a9690232836b0c8497b85a9c4d8914cab3726fb011087f7ab860a60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-runic-fonts \
noto-sans-runic \
noto-sans-runic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
