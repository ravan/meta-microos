SUMMARY = "Library to access the Windows Shell Item format"
DESCRIPTION = "Library to access the Windows Shell Item format for the libyal family of libraries. \
libyal is typically used in digital forensic tools."
LICENSE = "LGPL-3.0-or-later"

PV = "20260522"

RPM_NAME = "libfwsi1-20260522-1.9.aarch64.rpm"
RPM_HASH = "bccf61fad22e877ca478df08e35704c294cae57128977ec243e7ed114fe26cded0548e20549601224d2be1555b9410e266685fd50c9ca2ee9dbe1a2be2ed39de"

RPROVIDES:${PN} += "libfwsi.so.1 \
libfwsi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libcnotify.so.1 \
libuna.so.1"

inherit rpm
