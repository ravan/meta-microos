SUMMARY = "Noto Bengali Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Bengali Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-serif-bengali-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "a8b638f93e113b1fdfb82f872845fb88c7c8cbad70d070623bb5a02ef0d27ba313483d23a7d4f3c5acfb3ccb1d6d115f7f8eca71b9b8cd14289eae7258c6b81c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-bengali-fonts \
noto-serif-bengali \
noto-serif-bengali-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
