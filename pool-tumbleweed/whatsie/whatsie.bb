SUMMARY = "Feature rich WhatsApp Client for Desktop Linux"
DESCRIPTION = "Feature rich WhatsApp Client for Desktop Linux."
LICENSE = "MIT"

PV = "5.1.0"

RPM_NAME = "whatsie-5.1.0-1.1.aarch64.rpm"
RPM_HASH = "5405f00b956e88e1c80a88fa3a45db2c3a9f0d972e167f747e8e8913874edd98ad5af721f4f88abf5f9187e96560e99ce029857c7372d805dcaf6ca2e92431f8"

RPROVIDES:${PN} += "whatsie"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Positioning.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
