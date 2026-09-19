SUMMARY = "Shared library for umockdev"
DESCRIPTION = "umockdev mocks Linux devices for creating integration tests for hardware \
related libraries and programs. \
 \
This package provides the shared library for umockdev."
LICENSE = "LGPL-2.1-or-later"

PV = "0.19.7"

RPM_NAME = "libumockdev0-0.19.7-1.4.aarch64.rpm"
RPM_HASH = "b5ada3a2d43775ff06896ca8411a42dd63b541968034ed57e5b374425f8eb98d231e388a908319c1630044be0c73836d460fb9eda3d76ff149b6502d88c647aa"

RPROVIDES:${PN} += "libumockdev.so.0 \
libumockdev0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpcap.so.1 \
libselinux.so.1 \
libudev.so.1"

inherit rpm
