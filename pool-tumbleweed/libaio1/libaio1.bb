SUMMARY = "Linux-Native Asynchronous I/O Access Library"
DESCRIPTION = "The Linux-native asynchronous I/O facility ('async I/O', or 'aio') has \
a richer API and capability set than the simple POSIX async I/O \
facility. This library provides the Linux-native API for async I/O. The \
POSIX async I/O facility requires this library to provide \
kernel-accelerated async I/O capabilities, as do applications that \
require the Linux-native async I/O API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.113"

RPM_NAME = "libaio1-0.3.113-5.5.aarch64.rpm"
RPM_HASH = "fd60534879e6ed8851d91c4c644bec2f4b19f2a02cc2813dd7299d2990e71a724e8fb45f4848bd158b18b6618a231f080b2890d38da7ae997e0dedb73075bdf2"

RPROVIDES:${PN} += "libaio \
libaio.so.1 \
libaio1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
