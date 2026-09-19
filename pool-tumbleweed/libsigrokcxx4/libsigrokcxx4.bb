SUMMARY = "API for talking to logic analyzer hardware"
DESCRIPTION = "libsigrok is a shared library written in C which provides the basic API \
for talking to logic analyzer hardware and reading/writing the acquired data \
into various input/output file formats."
LICENSE = "GPL-3.0-or-later"

PV = "0.6.0~git20241020.f06f788"

RPM_NAME = "libsigrokcxx4-0.6.0~git20241020.f06f788-1.7.aarch64.rpm"
RPM_HASH = "8d7365b8e1cc1eb73bf6b13d2615bd126fd432a1fe2583abd0b5d33ca8eb03f093e18ac699348a585ff564c2cfc5e2ec7c28225e5484b06d2a80c0b7b7aba23f"

RPROVIDES:${PN} += "libsigrokcxx.so.4 \
libsigrokcxx4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libsigrok-data \
libsigrok.so.4 \
libsigrok4 \
libstdc++.so.6"

inherit rpm
