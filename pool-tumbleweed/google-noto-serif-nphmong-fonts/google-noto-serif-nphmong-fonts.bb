SUMMARY = "Noto NPHmong Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
NPHmong Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-serif-nphmong-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "0f5d19a3669a01682b0860d224546a5f324919db2de3c81128a0fb0879eac75497bbddac369f1f9cc6cb1f9f1c3d3e6022f8b3f3ac0ec08a258c00894da56791"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-nphmong-fonts \
noto-serif-myanmar \
noto-serif-myanmar-fonts \
noto-serif-nyiakengpuachuehmong \
noto-serif-nyiakengpuachuehmong-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
