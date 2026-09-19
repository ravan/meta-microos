SUMMARY = "Framework which lets applications perform actions as a privileged user"
DESCRIPTION = "KAuth is a framework to let applications perform actions as a privileged user."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kauth-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "af6fecef677dfb5214dc1a577034d9c062d20c3e605e0114e037cff052cc8e30364e4ef3493abbfe08c8219fcabf612dc47d4e4f8d6ad1d6ea4dbf8a7896aa15"

RPROVIDES:${PN} += "kf6-kauth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6AuthCore.so.6 \
libKF6WindowSystem.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libpolkit-qt6-core-1.so.1 \
libstdc++.so.6"

inherit rpm
