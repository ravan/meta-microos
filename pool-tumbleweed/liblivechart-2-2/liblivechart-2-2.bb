SUMMARY = "Library files for livechart"
DESCRIPTION = "Library files for livechart."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "liblivechart-2-2-2.0.0-1.4.aarch64.rpm"
RPM_HASH = "29ccbe79382789a30e7ea63e7afd0a66a1752fbae39358555015efebefe72681000bee35655bd609035eda703044402fe0c6b85566a5c2dde38e8b02a8938533"

RPROVIDES:${PN} += "liblivechart-2-2 \
liblivechart-2.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgee-0.8.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libm.so.6"

inherit rpm
