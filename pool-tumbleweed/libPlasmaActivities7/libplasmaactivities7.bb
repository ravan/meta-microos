SUMMARY = "Library for Plasma Activities support"
DESCRIPTION = "Kactivities provides an API for using and interacting with the Plasma Activities Manager."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "libPlasmaActivities7-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "78d9391f3eea13592e561f9a3d78cc8949b91c42ece6d49452f7f265be47c7280f5c530e171a3bcf804e784ec3d0450802ec5f0af32a99494e756212b8173b7b"

RPROVIDES:${PN} += "libPlasmaActivities.so.7 \
libPlasmaActivities7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libc.so.6 \
libstdc++.so.6 \
plasma6-activities"

inherit rpm
