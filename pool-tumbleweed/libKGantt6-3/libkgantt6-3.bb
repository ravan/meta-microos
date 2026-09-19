SUMMARY = "Gantt chart implementation for kdiagram"
DESCRIPTION = "This package contains the KGantt libraries from the kdiagram package."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.1"

RPM_NAME = "libKGantt6-3-3.0.1-1.10.aarch64.rpm"
RPM_HASH = "17f096f8ff8b4a814a0585b96231efd2903b61314eff8ae133ec759ec2bf88313a3ab0c7750692e34e4aeb1e956eee695673c55a3e5b4ba4e4ebb97949975ecc"

RPROVIDES:${PN} += "libKGantt6-3 \
libKGantt6.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
