SUMMARY = "Core library for kdav"
DESCRIPTION = "kdav is a library providing a KJob-based implementation of DAV protocols such as \
CardDAV, WebDAV, and CalDAV."
LICENSE = "LGPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6DAV6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "0cbf88a4a51a55440a3858ad8403e04d7c39d49b5584a73fb716d538e3162f4b3064eebb37f939dbdf7f1be4dcac98483731ed41d3422b29f6180be8b74a972c"

RPROVIDES:${PN} += "libKF6DAV.so.6 \
libKF6DAV6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kdav \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
