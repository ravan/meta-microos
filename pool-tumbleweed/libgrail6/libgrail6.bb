SUMMARY = "Gesture recognition library"
DESCRIPTION = "This tree consists of an interface and tools for handling gesture \
recognition and gesture instantiation. \
 \
The library handles tentative getures, i.e., buffering of events \
for several alternative gestures until a match is confirmed."
LICENSE = "LGPL-3.0 & GPL-3.0"

PV = "3.1.1"

RPM_NAME = "libgrail6-3.1.1-1.34.aarch64.rpm"
RPM_HASH = "2216460b39ded6f419d40204b63e5ab752a05a4e80e4e5f4c4367ab5af4c6238e4623d8ff50383605c9719f0971e80822b2ea271a69dabdb45426ba788a49902"

RPROVIDES:${PN} += "libgrail.so.6 \
libgrail6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libframe.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
