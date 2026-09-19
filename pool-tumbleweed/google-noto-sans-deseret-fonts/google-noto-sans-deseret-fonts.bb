SUMMARY = "Noto Deseret Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Deseret Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-deseret-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "f5499181a411413d27e3a8c5119bb17fd01e257aefeaacefec9c0b070999593908f1bf342dcf48d46b9da2a78046d0d225148cb9ca0071e66de2b8bd53d616d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-deseret-fonts \
noto-sans-deseret \
noto-sans-deseret-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
