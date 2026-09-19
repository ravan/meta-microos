SUMMARY = "Linux-native nvme device management library"
DESCRIPTION = "Provides library functions for accessing and managing NVMe devices on a Linux \
system."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0+6.g1ac60ca4b"

RPM_NAME = "libnvme3-1-3.0+6.g1ac60ca4b-1.1.aarch64.rpm"
RPM_HASH = "d170c5e21c9ac787d6b201dfeae8cd9903d8566f659a434100c58ffb0394682db0e148d0078f351cf2921153139cbbba07fd483bb74c0346f13d366cdab1fe13"

RPROVIDES:${PN} += "libnvme3-1 \
libnvme3.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libkeyutils.so.1"

inherit rpm
