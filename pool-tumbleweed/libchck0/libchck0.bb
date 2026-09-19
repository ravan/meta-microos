SUMMARY = "C utilities collection library itself"
DESCRIPTION = "C utilities collection library itself."
LICENSE = "MIT"

PV = "0.0.20161208"

RPM_NAME = "libchck0-0.0.20161208-1.36.aarch64.rpm"
RPM_HASH = "edd49c3dafa9e7f0cd3316e68b8967328f30d040da622a43ac6335d68a968d96d6033fab5566a85b728cc5281918521f7e2adedba29855e4f44f77851e79e773"

RPROVIDES:${PN} += "libchck-atlas.so.0 \
libchck-buffer.so.0 \
libchck-dl.so.0 \
libchck-fs.so.0 \
libchck-lut.so.0 \
libchck-pool.so.0 \
libchck-sjis.so.0 \
libchck-string.so.0 \
libchck-tqueue.so.0 \
libchck-unicode.so.0 \
libchck-xdg.so.0 \
libchck0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
