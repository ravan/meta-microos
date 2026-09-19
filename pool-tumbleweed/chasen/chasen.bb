SUMMARY = "Japanese Morphological Analysis System"
DESCRIPTION = "ChaSen is a Japanese morphological analysis system."
LICENSE = "BSD-3-Clause"

PV = "2.4.5"

RPM_NAME = "chasen-2.4.5-4.8.aarch64.rpm"
RPM_HASH = "a61e5bdc2d3fffd66b1060bf61815f12dd0ce58a65a25ba86445aa32d1f97ac50a735d6c2a5908c4c0e5e42f6cb082644ab9a54415305b9ce4c68357c46c65d0"

RPROVIDES:${PN} += "chasen \
libchasen.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ipadic \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
