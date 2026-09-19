SUMMARY = "Plasma screen management library"
DESCRIPTION = "Plugins for dynamic display management in Plasma"
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "libkscreen6-plugin-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "bfd44c02f046845dcb6154d74c0f931acbb73e2827dd60055bb42846a65642ce3660e2c9b0a8ee26c670e2cbcf5bd94343b3fadefda2a665f60ba6cd9e0bdc9f"

RPROVIDES:${PN} += "libkscreen2-plugin \
libkscreen6-plugin"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKF6Screen.so.8 \
libKF6Screen8 \
libKF6ScreenDpms.so.8 \
libKF6ScreenDpms8 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6WaylandClient.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwayland-client.so.0 \
libxcb-randr.so.0 \
libxcb.so.1"

inherit rpm
