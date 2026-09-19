SUMMARY = "Detour Library for Recastnatnaviagtion"
DESCRIPTION = "This package contains the detour library part of Recastnatnaviagtion."
LICENSE = "Zlib"

PV = "1.6.0"

RPM_NAME = "libDetour1-1.6.0-1.9.aarch64.rpm"
RPM_HASH = "ae8ea12742670ad54df12117b778fb60ae2e5ededc0e8cadf7391731ae27c97f9a9e4266bc9ad0a09ddde187a3116f3bbddbc51c981302ee2f5b33285d4af24a"

RPROVIDES:${PN} += "libDetour.so.1 \
libDetour1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
