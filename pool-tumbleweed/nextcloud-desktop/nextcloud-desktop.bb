SUMMARY = "Nextcloud desktop synchronisation client"
DESCRIPTION = "The Nextcloud Desktop Client is a tool to synchronise files from \
the Nextcloud Server with your computer. \
 \
Nextcloud Desktop enables you to connect to your private \
Nextcloud Server. With it you can create directories in your home \
directory, and keep the contents of those directories synced with \
the server. Simply copy a file into the directory and the desktop \
synchronisation client does the rest."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "34.0.3"

RPM_NAME = "nextcloud-desktop-34.0.3-1.1.aarch64.rpm"
RPM_HASH = "3fcf3199ac3b64585e5f5c6d09ea6fdf92189d9fd71cc0ad570e4cb6d5c42cbf467d36f22372ece0090a422f25a0417a2c165edc3ac6d1d95fa23383c072a8d4"

RPROVIDES:${PN} += "nextcloud-client \
nextcloud-client-lang \
nextcloud-desktop"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6GuiAddons.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libcloudproviders.so.0 \
libcrypto.so.3 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libkdsingleapplication-qt6.so.1.2 \
libm.so.6 \
libnextcloud-csync.so.0 \
libnextcloudsync.so.0 \
libnextcloudsync0 \
libqt6keychain.so.1 \
libstdc++.so.6 \
nextcloud-cli \
qt6-declarative-imports \
qt6-multimedia-imports \
qt6-qt5compat-imports"

inherit rpm
