SUMMARY = "Noto Chakma Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Chakma Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-chakma-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "a828c82384f0eed988c13d0248819e10883f7704b83e5146ad636e3f803f090fb9830dd792bd0fe964e6efaf3666ee523daa2a1058370cb1ad4e8f05952cadb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-chakma-fonts \
noto-sans-chakma \
noto-sans-chakma-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
