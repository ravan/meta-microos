SUMMARY = "Qt GUI for WINE"
DESCRIPTION = "Q4Wine is a Qt-based GUI for WINE. It can help manage Wine \
prefixes and installed applications. \
 \
General features: \
- Can export Qt color theme into Wine color settings. \
- Can work with different Wine versions at the same time. \
- Creation, deletion and management of prefixes (WINEPREFIX). \
- Control for Wine process. \
- Autostart icon support. \
- CD image use. \
- Icons can be extracted from PE files (.exe, .dll). \
- Backup and restore for managed prefixes. \
- Wine AppDB browser. \
- Logging subsystem. \
- Winetricks support."
LICENSE = "GPL-3.0-only"

PV = "1.4.2"

RPM_NAME = "q4wine-1.4.2-1.11.aarch64.rpm"
RPM_HASH = "22de2af9bd2a5bffe12041bc237c8bc6b0fbfa53d0924751fa2d709ec1dad09e4135836a5f48d9a24830e61226491fe920fe25c12927a14fa19e679df74448c9"

RPROVIDES:${PN} += "bundled-SingleApplication \
libq4wine-core.so \
q4wine"

RDEPENDS:${PN} += "fuseiso \
icoutils \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
sudo \
wine"

inherit rpm
