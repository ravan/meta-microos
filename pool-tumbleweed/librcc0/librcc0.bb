SUMMARY = "Russian Character Set Conversion Library"
DESCRIPTION = "Provides the possibility to automatically convert considered \
encodings to and from UTF-8. A lot of languages are supported, not \
just the Russian one. The library is part of the rusxmms patch."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.13"

RPM_NAME = "librcc0-0.2.13-3.6.aarch64.rpm"
RPM_HASH = "46b1f5bc6ba7179b4d76125fbf46652d79398d3f9bc5c3021d680a0742f3723b9cb9cdf807871add4d449a9a4d89c189b2afbde95552c87b802897d510fb4c5e"

RPROVIDES:${PN} += "librcc.so.0 \
librcc0 \
librccui.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-4.8.so \
libenca.so.0 \
librcd.so.0 \
libxml2.so.16 \
rcc-runtime"

inherit rpm
