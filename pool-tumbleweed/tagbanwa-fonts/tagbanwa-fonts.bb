SUMMARY = "Tagbanwa Fonts"
DESCRIPTION = "Font for the Tagbanwa script."
LICENSE = "CC-BY-2.5"

PV = "1.001"

RPM_NAME = "tagbanwa-fonts-1.001-3.25.noarch.rpm"
RPM_HASH = "5789b0873007cb4053360ee28dce9388ba87dbfdde1202d02215faf89e5701032ca342d01379d90cc7bb035e6f8757248987ba845a7a425064b6868c58907e00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tagbanwa-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
