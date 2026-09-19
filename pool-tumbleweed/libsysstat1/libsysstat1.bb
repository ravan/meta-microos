SUMMARY = "Libraries for lxqt"
DESCRIPTION = "Development libraries for libsysstat"
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "libsysstat1-1.1.0-1.7.aarch64.rpm"
RPM_HASH = "c1b8c4934afe810d22659491ac90f527e4ff5c219a16fbedcff36537065d3cc81f2c53d8822e1ec6dc7612e460d7a6ad661a9ec3d1209511db0b5dfec5bcc425"

RPROVIDES:${PN} += "libsysstat \
libsysstat-qt6.so.1 \
libsysstat1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
