SUMMARY = "Detour Crowd Library for Recastnatnaviagtion"
DESCRIPTION = "This package contains the detour crowd library part of Recastnatnaviagtion."
LICENSE = "Zlib"

PV = "1.6.0"

RPM_NAME = "libDetourCrowd1-1.6.0-1.9.aarch64.rpm"
RPM_HASH = "9ef79e3485c03e0ac0bd0fca88eadc3206ae0d8ad6daffd3dfba435b505bc7c48e7225220324009f8287adda595f1eff5bd1b0b21678d907d6e5a47fc3c952f3"

RPROVIDES:${PN} += "libDetourCrowd.so.1 \
libDetourCrowd1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libDetour.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
