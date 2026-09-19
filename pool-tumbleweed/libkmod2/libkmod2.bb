SUMMARY = "Library to interact with Linux kernel modules"
DESCRIPTION = "libkmod was created to allow programs to easily insert, remove and \
list modules, also checking its properties, dependencies and aliases."
LICENSE = "LGPL-2.1-or-later"

PV = "34.2"

RPM_NAME = "libkmod2-34.2-5.3.aarch64.rpm"
RPM_HASH = "f3a5740d0408162aceef5a7aad7601862692f241200eacffa0ecb16c54909e2297bc54094671325720509d9f88ffe8578b464bd74f56e54216756727da14109b"

RPROVIDES:${PN} += "libkmod.so.2 \
libkmod2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
liblzma.so.5 \
libz.so.1 \
libzstd.so.1"

inherit rpm
