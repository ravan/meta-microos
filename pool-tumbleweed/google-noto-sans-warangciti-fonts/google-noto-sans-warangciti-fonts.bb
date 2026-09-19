SUMMARY = "Noto Warang Citi Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
WarangCiti Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-warangciti-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "6d326abf497651ed4f907550bc6786a737ccf2cb8d1d1ca52f25fbc66ab26b2533f769e57a846225c5a8fc2ff2dced861d5a42b924ec0839da4119cf62cff8f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-warangciti-fonts \
noto-sans-warangciti \
noto-sans-warangciti-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
