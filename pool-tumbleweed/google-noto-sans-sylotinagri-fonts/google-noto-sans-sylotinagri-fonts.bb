SUMMARY = "Noto Syloti Nagri Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
SylotiNagri Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-sylotinagri-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "7922fe36b19eac6a3fffef96045c553014cf8fad706fc988534aebd5e7f8d7ce321a64e6e8329d0e0224545db2033bdb237f50f83de5f1a9f83137696f8bc9d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-sylotinagri-fonts \
noto-sans-sylotinagri \
noto-sans-sylotinagri-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
