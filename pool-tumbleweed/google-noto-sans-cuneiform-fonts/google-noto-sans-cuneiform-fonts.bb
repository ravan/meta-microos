SUMMARY = "Noto Cuneiform Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Cuneiform Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-cuneiform-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "878108ee75100198377bc5ee995710c1d9bdc82830a69be8f5bd0f2516082888f3e086ccfd144e164f362dd06cc223a27ffd3036bd212a57324da94d8bb24230"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-cuneiform-fonts \
noto-sans-cuneiform \
noto-sans-cuneiform-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
