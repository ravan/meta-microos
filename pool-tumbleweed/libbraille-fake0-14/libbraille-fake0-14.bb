SUMMARY = "Fake graphical display for libbraille"
DESCRIPTION = "Libbraille is a computer shared library which makes it possible to \
develop for Braille displays. It provides an API to \
write text on the display, directly draw dots, or get the value of \
keys pressed on the Braille keyboard. \
 \
This package contains a fake graphical virtual display."
LICENSE = "LGPL-2.1-only"

PV = "0.19.0"

RPM_NAME = "libbraille-fake0-14-0.19.0-26.8.aarch64.rpm"
RPM_HASH = "0f57983f7487591535194d4b2b5eea62b395ad2fbba0d24d643e6fe139a702666e9f23e02a9401d0f1e16fd0e7946a6ace0bded6a1863149fc772987f81bc25c"

RPROVIDES:${PN} += "libbraille-fake0-14"

RDEPENDS:${PN} += "/sbin/ldconfig \
libbraille \
libbraille-0.so.14 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
