SUMMARY = "UPnP and OpenHome audio Control Point"
DESCRIPTION = "upplay is a Qt based audio Control Point for browsing and playing music \
managed by your UPnP/DLNA media servers to your UPnP/DLNA/OpenHome players (renderers)."
LICENSE = "GPL-2.0-or-later"

PV = "1.9.12"

RPM_NAME = "upplay-1.9.12-1.1.aarch64.rpm"
RPM_HASH = "95146b1c0e5a20b33cc76ef66850a6b67efe06ca42966d1500cedc04b2788863e53dc40b20d106b7c7f569173a49663b0c334fea45c0cd81c502b3a14682b218"

RPROVIDES:${PN} += "upplay"

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
libjsoncpp.so.27 \
libstdc++.so.6 \
libupnpp.so.17"

inherit rpm
