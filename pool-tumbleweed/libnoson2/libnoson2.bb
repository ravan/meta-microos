SUMMARY = "C++ library for accessing sonos devices"
DESCRIPTION = "C++ library for accessing sonos devices \
The API supports basic features to browse music index and control playback \
in any zones."
LICENSE = "GPL-3.0-or-later"

PV = "2.10.2"

RPM_NAME = "libnoson2-2.10.2-1.13.aarch64.rpm"
RPM_HASH = "96107b99021cea9c9cc8c98676678888d06aacc1423416bbf0cb0b0512cc09a3a8420bc91f35e7fb26215e73c9cf076374b7cfbb4d17c4474d70ea0cefb043fa"

RPROVIDES:${PN} += "libnoson.so.2 \
libnoson2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFLAC++.so.11 \
libFLAC.so.14 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
