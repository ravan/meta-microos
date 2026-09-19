SUMMARY = "OSM primitives for kosmindoormap"
DESCRIPTION = "OSM primitives for kosmindoormap."
LICENSE = "CC0-1.0 & LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "libKOSM1-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "23212eaf483eadf594a536a9e8dd62449c115bd2aeae29694d1067829eeb021bbd3265173182a2109f1e253b6b480ef97fa9babec59e1a6e6f391185166dc15e"

RPROVIDES:${PN} += "libKOSM.so.1 \
libKOSM1"

RDEPENDS:${PN} += "/sbin/ldconfig \
kosmindoormap \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
