SUMMARY = "Noto Old South Arabian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
OldSouthArabian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-oldsoutharabian-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "d15e02f705a18369c102654cef76706637d560679ac812546b9d0d197c1ae7aaa851e1d3fd48a7682b813adacee5888e9f143e47cc5e18b121a1107b9a8265be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-oldsoutharabian-fonts \
noto-sans-oldsoutharabian \
noto-sans-oldsoutharabian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
