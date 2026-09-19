SUMMARY = "Convenience library for clients of NetworkManager"
DESCRIPTION = "This package contains the libraries that make it easier to use some \
Network Manager functionality from applications that use glib."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.56.1"

RPM_NAME = "libnm0-1.56.1-4.1.aarch64.rpm"
RPM_HASH = "895ab698176a9dc1f2ad2432063d0a4c834c2604e2ace841aca61d41ef8fbf16791baca6d45f39b27d706754cd6d09bbb8368673760a3ce00cda2a7d8002374c"

RPROVIDES:${PN} += "libnm.so.0 \
libnm0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libnspr4.so \
libnss3.so \
libsmime3.so \
libudev.so.1"

inherit rpm
