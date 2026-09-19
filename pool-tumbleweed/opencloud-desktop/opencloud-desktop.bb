SUMMARY = "The OpenCloud synchronization client"
DESCRIPTION = "With OpenCloud Desktop files can be continously kept in sync between a local \
workstation and the OpenCloud server."
LICENSE = "GPL-2.0-only & GPL-3.0-only"

PV = "4.0.0"

RPM_NAME = "opencloud-desktop-4.0.0-1.1.aarch64.rpm"
RPM_HASH = "fd3ff343a5b88788f42a794f1ace1aa06e23432dd198402eb13c10f7277d589fbddbb1f32471dec7e45e8e525b68c9dfdc7e5d1117c441fdaca8b839a79fbd58"

RPROVIDES:${PN} += "libOpenCloudGui.so \
libOpenCloudGuiplugin.so \
libOpenCloudResourcesplugin.so \
liblibsyncplugin.so \
opencloud-desktop \
qt6qmlimport-eu.OpenCloud.gui \
qt6qmlimport-eu.OpenCloud.gui.1 \
qt6qmlimport-eu.OpenCloud.libsync \
qt6qmlimport-eu.OpenCloud.libsync.1 \
qt6qmlimport-eu.OpenCloud.resources \
qt6qmlimport-eu.OpenCloud.resources.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libOpenCloudLibSync.so.0 \
libOpenCloudResources.so.0 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libkdsingleapplication-qt6.so.1.2 \
libopencloudsync0 \
libstdc++.so.6 \
libz.so.1 \
opencloud-extensions-resources \
qt6-sql-sqlite \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Controls.Basic \
qt6qmlimport-QtQuick.Layouts"

inherit rpm
