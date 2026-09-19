SUMMARY = "KIO slave for stashing temporary files"
DESCRIPTION = "This KIO slave can be used to stash files in a virtual \
folder temporarily. It requires use of a KIO-compatible \
file manager, like dolphin."
LICENSE = "GPL-2.0-or-later"

PV = "1.0git.20250301T021103~51f07b6"

RPM_NAME = "kio-stash-1.0git.20250301T021103~51f07b6-1.5.aarch64.rpm"
RPM_HASH = "d3523740d5c2858cd126fed2d356e2f6165fd834017bffa33448b6396ee932b528d4da2d20581a8a2fb580ccdaefd167e37a89d0c1f57a8653b32e186ed2ceff"

RPROVIDES:${PN} += "kio-stash"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
