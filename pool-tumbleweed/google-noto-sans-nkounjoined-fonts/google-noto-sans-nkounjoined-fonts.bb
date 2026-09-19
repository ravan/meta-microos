SUMMARY = "Noto NKo Unjoined Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
NKoUnjoined Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-nkounjoined-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "6701f4ab04b6ef21ac71d8d5b985a6722cd05b14cdaf7d97fbea01c587d9738dad9182b5338d553fd8914166b86b3dab466e50f8043cd450becb9eb1a88fe138"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-nkounjoined-fonts \
noto-sans-nkounjoined \
noto-sans-nkounjoined-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
