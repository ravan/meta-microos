SUMMARY = "Rime Input Method Engine"
DESCRIPTION = "Rime is an Traditional Chinese input method engine. \
Its idea comes from ancient Chinese brush and carving art. \
Mainly it's about to express your thinking with your keystrokes. \
 \
This package is the runtime libraries of Rime."
LICENSE = "BSD-3-Clause"

PV = "1.17.0"

RPM_NAME = "librime1-1.17.0-1.1.aarch64.rpm"
RPM_HASH = "3ec0e64fcecc43d806f112960838896a1286828b0d2c700bd444c0b9b755364532584758a1df17ca5755b03749ba10ed9b9766cfbc343233973e094a855d2478"

RPROVIDES:${PN} += "librime.so.1 \
librime1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglog.so.2 \
libleveldb.so.1 \
libm.so.6 \
libmarisa.so.0 \
libopencc.so.1.2 \
libstdc++.so.6 \
libyaml-cpp.so.0.9"

inherit rpm
