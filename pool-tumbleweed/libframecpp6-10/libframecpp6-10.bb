SUMMARY = "C++ bindings for ldas-tools"
DESCRIPTION = "This package provides a shared library for ldas-tools-framecpp - a toolkit providing C++ \
bindings for working with frame data."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.4"

RPM_NAME = "libframecpp6-10-3.0.4-2.7.aarch64.rpm"
RPM_HASH = "aa8a76073a54ace8aecc80c8f358eb9b01a2bafb3b2599ce67cadd9bb391945a9763395a22f6ca6bd045e24b57c2e20403c81f9ebe30b5f5d70ccd6fa036a892"

RPROVIDES:${PN} += "libframecpp6-10 \
libframecpp6.so.10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libframecpp3.so.8 \
libframecpp4.so.10 \
libframecppcmn.so.12 \
libgcc-s.so.1 \
libldastoolsal.so.7 \
libstdc++.so.6"

inherit rpm
