SUMMARY = "Library for SocketCAN"
DESCRIPTION = "This library allows you to control some basic functions in socketcan \
from userspace. A recent kernel with integrated SocketCAN (at least \
2.6.30) is needed."
LICENSE = "LGPL-2.1-or-later"

PV = "0.0.12"

RPM_NAME = "libsocketcan2-0.0.12-1.17.aarch64.rpm"
RPM_HASH = "18ac2dee48e0fc04c4fb8331e507d0324cc3e69be887e3cbba018347c8068f80aa002caf0249ecc5b70f94ec14207a596ca7e9f513b23eccbef5da07f3e42c36"

RPROVIDES:${PN} += "libsocketcan.so.2 \
libsocketcan2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
