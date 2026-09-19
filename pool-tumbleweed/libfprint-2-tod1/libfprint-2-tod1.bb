SUMMARY = "Library for on-device verification fingerprint reader support"
DESCRIPTION = "The fprint project provides a central system to support fingerprint \
readers. libfprint is the component which does the work of talking to \
fingerprint reading devices, and processing fingerprint data."
LICENSE = "LGPL-2.1-or-later"

PV = "1.94.10+tod1"

RPM_NAME = "libfprint-2-tod1-1.94.10+tod1-3.1.aarch64.rpm"
RPM_HASH = "d5999ee858072fb6412608c4dc590683289c133ade81fdd5a4a2053ac51d2e4f3a3145a9ca34bbfa87edf62b119902aee93e9925215f73639f3b40cca741f351"

RPROVIDES:${PN} += "libfprint-2-tod.so.1 \
libfprint-2-tod1 \
libfprint-tod"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgusb.so.2 \
libm.so.6 \
libpixman-1.so.0"

inherit rpm
