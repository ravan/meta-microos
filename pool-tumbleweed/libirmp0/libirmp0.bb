SUMMARY = "Protocol Decoder Library for sigrok"
DESCRIPTION = "The sigrok project aims at creating a portable, cross-platform, \
Free/Libre/Open-Source logic analyzer software that supports various \
logic analyzer hardware products."
LICENSE = "GPL-3.0-or-later"

PV = "0.6.0~git20241001.71f4514"

RPM_NAME = "libirmp0-0.6.0~git20241001.71f4514-1.6.aarch64.rpm"
RPM_HASH = "6989aa28037ca88cc7b997ce5efab945d63e90517442db39d0b47daf20d538d2578f56002e61a5a8c4412f5fa4b5061aea3d3cd1fc2de486f40543f39febb21a"

RPROVIDES:${PN} += "libirmp.so.0 \
libirmp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libpython3.13.so.1.0"

inherit rpm
