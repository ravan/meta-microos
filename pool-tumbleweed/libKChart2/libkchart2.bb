SUMMARY = "KChart library for kdiagram"
DESCRIPTION = "This package contains the KChart libraries from the kdiagram package."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "libKChart2-2.8.0-2.5.aarch64.rpm"
RPM_HASH = "6d8a42509ff589f100af129ecdd8c1ac9ef59d927dcd137902d8a2d1350fa0426198387090d566a7ee16a575472e54eeacfda0fbb69f30666bc1147642543688"

RPROVIDES:${PN} += "libKChart.so.2 \
libKChart2 \
libkchart"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
