SUMMARY = "Plugins responsible for better integration of Qt applications in KDE Workspace"
DESCRIPTION = "Framework Integration is a set of plugins responsible for better \
integration of Qt applications when running on a \
KDE Plasma workspace. \
 \
Applications do not need to link to this directly."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6Style6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "e38e0600aa8764d233b27aeaad2018303ac41a0bade625484d365ed38a696970206374714199f5bf1a6ed13e863a39fb8aeaf4bec059889f26d2fa10d53afd32"

RPROVIDES:${PN} += "libKF6Style.so.6 \
libKF6Style6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6IconThemes.so.6 \
libKF6WidgetsAddons.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
