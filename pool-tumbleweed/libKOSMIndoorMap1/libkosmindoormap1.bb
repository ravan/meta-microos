SUMMARY = "OSM multi-floor indoor map renderer"
DESCRIPTION = "OSM multi-floor indoor map renderer library."
LICENSE = "CC0-1.0 & LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "libKOSMIndoorMap1-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "b4d7195e0de254355e54944f718a9e0e9e9945ff67a7ee211b9714141c2103aeb24f956fa9f2a96a5d842879e15b90d63e6b9eb2c387f549231087c20894284e"

RPROVIDES:${PN} += "libKOSMIndoorMap.so.1 \
libKOSMIndoorMap1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKOSM.so.1 \
libKOpeningHours.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
