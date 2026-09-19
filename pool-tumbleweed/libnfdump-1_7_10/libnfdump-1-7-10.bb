SUMMARY = "Shared Library part of libnfdump"
DESCRIPTION = "Shared Library part of libnfdump."
LICENSE = "BSD-3-Clause"

PV = "1.7.10"

RPM_NAME = "libnfdump-1_7_10-1.7.10-1.1.aarch64.rpm"
RPM_HASH = "0a286a5c799410f835b9e0470d095377bffe2a20b37e9156a8ef0ec3f7eb6961b9618ac6351d988879e8d234b9406186d12b6fdd7489c20d90170fd82f51a1a2"

RPROVIDES:${PN} += "libnfdump-1-7-10 \
libnfdump-1.7.10.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
