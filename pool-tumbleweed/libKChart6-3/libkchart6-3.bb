SUMMARY = "KChart library for kdiagram"
DESCRIPTION = "This package contains the KChart libraries from the kdiagram package."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.1"

RPM_NAME = "libKChart6-3-3.0.1-1.10.aarch64.rpm"
RPM_HASH = "156442bb7c7d2291e8979cbc6af180d18f0c001551991a231ffb3b5b0803fc138f82156e6c0c225da2eee36e32e58271a54e0895e6f7dc4ed4357f9de141c1b2"

RPROVIDES:${PN} += "libKChart6-3 \
libKChart6.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
