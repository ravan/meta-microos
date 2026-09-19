SUMMARY = "Translation file thumbnail generators"
DESCRIPTION = "This package allows KDE applications to show thumbnails and previews of po files."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kdesdk-thumbnailers-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "709b3d29747940d903b4b44ed47897cb97f872636e331fc66b79b6affcc4fe0026a20b8823628f55000b474dbfae73946eb83da5ec01c9b6f013f9e0d8521242"

RPROVIDES:${PN} += "kdesdk-thumbnailers"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6KIOGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgettextpo.so.0 \
libstdc++.so.6"

inherit rpm
