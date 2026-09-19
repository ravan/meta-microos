SUMMARY = "Noto Nag Mundari Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
NagMundari Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-nagmundari-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "a8985c48aa6d9a06a98a82a141f8bfd55132d8249dfbfd6d35815d16957f4c497176b9c4377cd66fb444585029a09f6a642d799a412db4ca784193a6f96f098d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-nagmundari-fonts \
noto-sans-nagmundari \
noto-sans-nagmundari-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
