SUMMARY = "Noto Fangsong KSSVertical Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
FangsongKSSVertical font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-fangsongkssvertical-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "d24684194b56d2c41d86d28ab227b4d764a503e4ff1878b8cd62369f43d0b036adcbe4628f322c0f997b8c99203549feb405cce59ca5746d49ebffdfa46a7f9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-fangsongkssvertical-fonts \
noto-fangsongkssvertical \
noto-fangsongkssvertical-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
