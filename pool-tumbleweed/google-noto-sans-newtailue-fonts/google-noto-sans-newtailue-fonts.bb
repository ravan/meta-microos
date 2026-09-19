SUMMARY = "Noto New Tai Lue Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
NewTaiLue Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-newtailue-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "e5699d946ce736325c00232833f4be2aefc53fe4a1c96f0d1b362cf2c0cd4a2b3a9e2b9d4975fe49b56f6577e52b7a1f2103f6ff995fb80e7a087ec61236f6ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-newtailue-fonts \
noto-sans-newtailue \
noto-sans-newtailue-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
