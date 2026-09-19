SUMMARY = "Nanum Korean TrueType Fonts"
DESCRIPTION = "Collection of Nanum Korean TrueType fonts: NanumBrush, \
NanumGothic, NanumMyeongjo and NanumPen."
LICENSE = "OFL-1.1"

PV = "20110907"

RPM_NAME = "nanum-fonts-20110907-23.34.noarch.rpm"
RPM_HASH = "ccf1f53930d9eda8a716cd5c4cb37b38d39b69b9109734de9dafc4359ab5ed55e08d94504f27b2163fa78400f65e26bef853f58cdd221ad91bce32476ab28f37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-ko \
nanum-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
