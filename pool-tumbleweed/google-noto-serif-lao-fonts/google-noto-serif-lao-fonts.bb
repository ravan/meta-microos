SUMMARY = "Noto Lao Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Lao Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-serif-lao-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "2e4c2ec2f5033fee1a011be35ff544eaa5e921cf92095e060a57a21f351c4621553523de926b49f4353507a61302e028151a6c5648104929a73dd92a51675d8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-lao-fonts \
noto-serif-lao \
noto-serif-lao-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
