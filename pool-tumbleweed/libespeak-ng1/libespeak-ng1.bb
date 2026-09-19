SUMMARY = "Software speech synthesizer (text-to-speech)"
DESCRIPTION = "Software speech synthesizer (text-to-speech), support \
library."
LICENSE = "Apache-2.0 & BSD-2-Clause & GPL-3.0-or-later & Unicode-DFS-2015"

PV = "1.52.0"

RPM_NAME = "libespeak-ng1-1.52.0-2.6.aarch64.rpm"
RPM_HASH = "9cbdc77ffae828a4c1f1b48f8c47ff7ba9c715018d9f2bf7b1412ac6b9ede754dc12d48e8c15271f91b8d824c125ebe95a7e623b76611c2e9ac0f8247cc45654"

RPROVIDES:${PN} += "libespeak-ng.so.1 \
libespeak-ng1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpcaudio.so.0 \
libstdc++.so.6"

inherit rpm
