SUMMARY = "Nextcloud sync client - Command-line utility"
DESCRIPTION = "The Nextcloud Desktop Client is a tool to synchronise files from \
the Nextcloud Server with your computer. \
 \
This package provides Nextcloud's command-line sync utility."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "34.0.3"

RPM_NAME = "nextcloud-cli-34.0.3-1.1.aarch64.rpm"
RPM_HASH = "3c4de96489187edfa2f6b861eadbea3339d6607d11f4a2e699459d194c6c7bbd4c9dea5ad4c2d23c38f48c99d9ae60278038d7a85db8a49a839232ff235cf381"

RPROVIDES:${PN} += "config-nextcloud-cli \
nextcloud-cli"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6GuiAddons.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libcloudproviders.so.0 \
libcrypto.so.3 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libkdsingleapplication-qt6.so.1.2 \
libm.so.6 \
libnextcloud-csync.so.0 \
libnextcloudsync.so.0 \
libqt6keychain.so.1 \
libstdc++.so.6"

inherit rpm
