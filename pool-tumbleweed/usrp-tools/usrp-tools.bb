SUMMARY = "Tools for the URSP1 SDR"
DESCRIPTION = "Tools for the URSP1 SDR."
LICENSE = "GPL-3.0-or-later"

PV = "3.4.11"

RPM_NAME = "usrp-tools-3.4.11-1.4.aarch64.rpm"
RPM_HASH = "e274403f0ed6e6bdc5e8cbfa93389823eb3a91a33937c157687c4bb8fb3394f6fd168a16669bb317dcacd81d95f510f3c11f40d9f883ea292462c90c38cbe36c"

RPROVIDES:${PN} += "usrp-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libusrp.so.1"

inherit rpm
