SUMMARY = "Noto Cypriot Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Cypriot Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-cypriot-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "e6f754e8f9c0c589166a484fc9b00f0b33be1274609bf43d52083eb09397fdcb749fbfdcfad773d3dccd542ca4109d6f42aa2e54f644c3f93257ad9f81bfa467"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-cypriot-fonts \
noto-sans-cypriot \
noto-sans-cypriot-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
