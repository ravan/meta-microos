SUMMARY = "SCrypt library"
DESCRIPTION = "This is a shared library that implements scrypt() functionality."
LICENSE = "BSD-1-Clause"

PV = "1.22"

RPM_NAME = "libscrypt0-1.22-1.12.aarch64.rpm"
RPM_HASH = "644845d540c3f0aab913a65d04e12650f910410e39c4c4d53ecd16d6eff6452cce03aaabaebac082fbcb71ab852cbcd62bd79a485db1c9dd73eb52b8a3d48ae3"

RPROVIDES:${PN} += "libscrypt.so.0 \
libscrypt0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
