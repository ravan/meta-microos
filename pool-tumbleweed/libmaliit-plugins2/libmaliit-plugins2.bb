SUMMARY = "Maliit Framework plugins shared library"
DESCRIPTION = "Provides the plugin-related shared libraries built for the Maliit \
Framework."
LICENSE = "LGPL-2.1-only"

PV = "2.3.0"

RPM_NAME = "libmaliit-plugins2-2.3.0-1.18.aarch64.rpm"
RPM_HASH = "4e9cd44a3529066d238bb15540e5f0e76181aca644e0cca8fd1e38a641de8ee976e34de74ad7b32bb4f72007ce50d3ebccbadc60656835260236b8d188c4208c"

RPROVIDES:${PN} += "libmaliit-plugins.so.2 \
libmaliit-plugins2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libudev.so.1 \
libwayland-client.so.0 \
libxcb-xfixes.so.0 \
libxcb.so.1 \
maliit-framework"

inherit rpm
