SUMMARY = "Library for binary signature scanning"
DESCRIPTION = "libsigscan is a library for binary signature scanning"
LICENSE = "LGPL-3.0-or-later"

PV = "20260902"

RPM_NAME = "libsigscan1-20260902-1.1.aarch64.rpm"
RPM_HASH = "274801b8a7c2feb8a7cc3f64d90d090d390d5a43dd245a8245725fd42ce6dfd63f72c31d6884701847b01cf9a7728c3a6f79aa173b3b28783c8a25de532c7ec8"

RPROVIDES:${PN} += "libsigscan.so.1 \
libsigscan1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1"

inherit rpm
