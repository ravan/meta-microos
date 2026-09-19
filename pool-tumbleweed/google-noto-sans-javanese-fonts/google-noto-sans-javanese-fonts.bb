SUMMARY = "Noto Javanese Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Javanese Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-javanese-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "2ee815374460003e709e269cf174b13dc13df3ca08e4567f1be656bd66423a3330292aa2f8757cafa93a4270c30e09230353bc343df67a51edffc978e95a9e1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-javanese-fonts \
noto-sans-javanese \
noto-sans-javanese-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
