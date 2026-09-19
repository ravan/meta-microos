SUMMARY = "FIFO interface used by startproc"
DESCRIPTION = "The libaray for the FIFO interface used by the LSB startproc command."
LICENSE = "GPL-2.0-or-later"

PV = "2.48"

RPM_NAME = "libblogger2-2.48-1.1.aarch64.rpm"
RPM_HASH = "42b9f8ffab3169b01ef95c3709371f4ae3eaeac0b7cd702e5c21566373d3677ae7d5341564798f4fa304a222f88bd6bafef5c4f32b80c1e3a3a2b83fe698fa9e"

RPROVIDES:${PN} += "blog-/usr/lib64/libblogger.so.2 \
libblogger.so.2 \
libblogger2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
