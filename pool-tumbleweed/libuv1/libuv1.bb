SUMMARY = "Asychronous I/O support library"
DESCRIPTION = "libuv is a support library with a focus on asynchronous I/O. It was \
primarily developed for use by Node.js, but it is also used by \
Mozilla's Rust language, Luvit, Julia, pyuv, and others."
LICENSE = "MIT"

PV = "1.52.0"

RPM_NAME = "libuv1-1.52.0-1.3.aarch64.rpm"
RPM_HASH = "74b84610c8f21a7e847671a223d059710c15e49f45779862aed3352a3875c0aeb7ef76c835cbafb6f725ba248c4e11f0daaf53435e0f3aada9375b9c601b2372"

RPROVIDES:${PN} += "libuv.so.1 \
libuv1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
