SUMMARY = "Cooling control and monitoring"
DESCRIPTION = "This is the desktop application for CoolerControl, \
an application for monitoring and controlling supported cooling \
devices. It features flexible control options, and live thermal data."
LICENSE = "GPL-3.0-or-later"

PV = "4.3.1"

RPM_NAME = "coolercontrol-4.3.1-1.3.aarch64.rpm"
RPM_HASH = "450b4be4e7210be182b798277c48ba7d18eabe3de4f9c4a33f07616d69a58eee84783cbe2f4410aafddbb34d28e4d33e5cb6675fa1ec24ac81b2fe75042c990a"

RPROVIDES:${PN} += "coolercontrol"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6WebChannel.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
