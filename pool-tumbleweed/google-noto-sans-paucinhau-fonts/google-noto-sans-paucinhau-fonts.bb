SUMMARY = "Noto Pau Cin Hau Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
PauCinHau Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-paucinhau-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "7dac0fcf051374794da4c60c740b7cd5e42d31077a9a802c2b46692a695b08d7a37f636fa39247fda8de65085e534196b102bf2651f44e03e859c4f32dbd67a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-paucinhau-fonts \
noto-sans-paucinhau \
noto-sans-paucinhau-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
