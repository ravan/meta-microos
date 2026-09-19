SUMMARY = "Noto Khmer Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Khmer Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-khmer-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "9a45b1a628e05dcee7cbaec1378964a55a351b05f621abbe4f30b3f26eef59e42f85970c86d4d8a4034358abfeabd8e2d636c9702789b7bd94c0f7b0a51b951a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-khmer-fonts \
noto-sans-khmer \
noto-sans-khmer-fonts \
noto-sans-khmer-ui \
noto-sans-khmer-ui-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
