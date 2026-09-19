SUMMARY = "Day-night cycle helper library"
DESCRIPTION = "KNightTime provides helpers for scheduling the dark-light cycle. It can be used to implement \
features such as adjusting the screen color temperature based on time of day, etc."
LICENSE = "LGPL-2.1-or-later"

PV = "6.7.5"

RPM_NAME = "knighttime6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "579212cc17a649c6a711d108b447c780e744a32679751641acd8ca16109dd9f7283a0df2ad02cf58cc6d9049c97d15728e56ede20f0ecdd18f2d16402beec76b"

RPROVIDES:${PN} += "knighttime6"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6DBusAddons.so.6 \
libKNightTime.so.0 \
libKNightTime0 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Positioning.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
