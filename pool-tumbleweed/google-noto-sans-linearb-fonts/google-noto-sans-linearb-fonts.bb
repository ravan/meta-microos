SUMMARY = "Noto Linear B Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
LinearB Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-linearb-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "dcfdca29be8a4cd81c1c8b4cefd87167d8d3bd5af9965e447509ed39a700c0c260a20a907dfc9fa6f6e7724c7886d0ffcb2eb2fa2368f1d3698cf82cd5f965f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-linearb-fonts \
noto-sans-linearb \
noto-sans-linearb-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
