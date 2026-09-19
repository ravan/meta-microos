SUMMARY = "Noto Syriac Eastern Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
SyriacEastern Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-syriaceastern-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "abde415823bd28ad2ca073253614138375691038466143fc3f6fa3ffdcf0893c96ce5122e04ed7cf3826cc13f23a723868b1d24946c7568fe9367e76cae04556"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-syriaceastern-fonts \
noto-sans-syriaceastern \
noto-sans-syriaceastern-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
