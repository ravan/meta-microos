SUMMARY = "OSM multi-floor indoor map renderer"
DESCRIPTION = "Indoor routing component of kosmindoormap, an OSM \
multi-floor indoor map renderer"
LICENSE = "CC0-1.0 & LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "libKOSMIndoorRouting1-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "717cd49cbd6cc426f672d451478c30c30c7ff93b61cf378907e95582d8e6e2052eceeeba310090fe1394ede4d1a7e96f2112bb92d39e5323a444a29b4f5579bd"

RPROVIDES:${PN} += "libKOSMIndoorRouting.so.1 \
libKOSMIndoorRouting1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libDetour.so.1 \
libKOSM.so.1 \
libKOSMIndoorMap.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libRecast.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
