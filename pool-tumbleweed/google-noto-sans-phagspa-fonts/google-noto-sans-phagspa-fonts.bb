SUMMARY = "Noto Phags Pa Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
PhagsPa Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-phagspa-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "b3b2fc182563a3058494d7d52b62d4de43a2ae00caa5dad5fb1ea04c382a03d9b93afdf2d05fa28445e3a26d20e05462f79bcc24e26827935daea474d7145cd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-phagspa-fonts \
noto-sans-phagspa \
noto-sans-phagspa-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
