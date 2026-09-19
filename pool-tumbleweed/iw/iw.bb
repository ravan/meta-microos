SUMMARY = "Configuration utility for nl80211 based wireless drivers"
DESCRIPTION = "iw is a nl80211 based CLI configuration utility for wireless devices. It \
supports almost all new drivers that have been added to the kernel \
recently."
LICENSE = "ISC"

PV = "6.17"

RPM_NAME = "iw-6.17-2.3.aarch64.rpm"
RPM_HASH = "1101f6a9482be1f1745ddf6a0c29cbbec2045e653a85891fcd0f06f432f5c1748e15d0ce8b80e3ef38bbaf3c3566502971c73be333a6802d64ce22a8e27a9a5f"

RPROVIDES:${PN} += "iw"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnl-3.so.200 \
libnl-genl-3.so.200"

inherit rpm
