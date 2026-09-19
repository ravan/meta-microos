SUMMARY = "Utilities for reading storage media devices through libsmdev"
DESCRIPTION = "This subpackage contains the utility programs from libsmdev, which \
can access and read storage media devices and will determine \
information about such."
LICENSE = "LGPL-3.0-or-later"

PV = "20260902"

RPM_NAME = "libsmdev-tools-20260902-1.1.aarch64.rpm"
RPM_HASH = "e7079b33651ceac8be2ff5dc3244d95455ca2de78a5db3d9c05db2833e3b25549841bf5636ac17eedeb5bc40cbb5a6547b900fe08773edd62e7ca3ab5337e526"

RPROVIDES:${PN} += "libsmdev-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libsmdev.so.1"

inherit rpm
