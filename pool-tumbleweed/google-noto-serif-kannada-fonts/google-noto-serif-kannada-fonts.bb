SUMMARY = "Noto Kannada Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Kannada Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-serif-kannada-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "fa32fad65815bfbbb9d5fbf9b35bfbc87d28b97f90e9202f63856da7efd826049907236e5eef07abfd2a2895bc0940d7d290d4b8fe7e57e2f818f5fe0399855d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-kannada-fonts \
noto-serif-kannada \
noto-serif-kannada-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
