SUMMARY = "LIRC driver library"
DESCRIPTION = "The LIRC library. LIRC is a package that supports receiving \
and sending IR signals with the most common IR remote controls."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.2"

RPM_NAME = "liblirc0-0.10.2-2.5.aarch64.rpm"
RPM_HASH = "a760eae0a6171b85f8922023f46a3ece3949804ce04dc2a161de53b9d0d7e95b3a751b940376ea6501b21ef673b04652b1f8a74808ff270fb166520246345493"

RPROVIDES:${PN} += "liblirc.so.0 \
liblirc0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
