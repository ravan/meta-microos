SUMMARY = "Noto Telugu Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Telugu Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-serif-telugu-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "a1004f632456bfe77ed2367e09b42b8dab5131c5b151cf15f9695514621d1000b1681569b9b24c382b0df5647d3da1b51e19b82de52891bdcb747dd090ada51f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-telugu-fonts \
noto-serif-telugu \
noto-serif-telugu-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
