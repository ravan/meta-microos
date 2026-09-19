SUMMARY = "Noto Ethiopic Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Ethiopic Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-serif-ethiopic-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "0627d1c6d602c7ac1cc6e982db6a04fc57be69d37a1cfea87c295c46f64b29d00e9a2914a7a1d96ebf54aef21bdb96f9674b4fb5c1240fdf8040fa467906b67b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-ethiopic-fonts \
noto-serif-ethiopic \
noto-serif-ethiopic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
