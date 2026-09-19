SUMMARY = "Decompression library for ancient formats"
DESCRIPTION = "This package provides the shared library for the decompression routines \
for ancient formats."
LICENSE = "BSD-2-Clause"

PV = "2.3.0"

RPM_NAME = "libancient2-2.3.0-1.5.aarch64.rpm"
RPM_HASH = "ee09758fdbbe6aa9b98afc940e8a3e126ad56844fb76f0b95b066f40686d1bf63685923b96864f395865b1b6e21b8e59500361e12ae711209a555d722c2b3edf"

RPROVIDES:${PN} += "libancient.so.2 \
libancient2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
