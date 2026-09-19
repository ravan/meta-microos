SUMMARY = "Vacuum-IM notification messages through system DBus"
DESCRIPTION = "The plug-in uses org.freedesktop.Notifications for show of notification messages"
LICENSE = "GPL-3.0-only"

PV = "1.5.4"

RPM_NAME = "vacuum-im-plugins-dbusnotifications-1.5.4-1.34.aarch64.rpm"
RPM_HASH = "573bb875ecdd2c875cc64d7e522e305d0b1688123be93a535709eb238421891693c5b659021328e6942f162316b53e65ea95ecfbb92610932bc41179b5a54e30"

RPROVIDES:${PN} += "libdbusnotifications.so \
vacuum-im-plugins-dbusnotifications"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libvacuumutils.so.37"

inherit rpm
