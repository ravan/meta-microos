SUMMARY = "The ownCloud synchronization client"
DESCRIPTION = "The ownCloud sync client - github.com/owncloud/client \
 \
ownCloud client enables you to connect to your private \
ownCloud Server. With it you can create folders in your home \
directory, and keep the contents of those folders synced with your \
ownCloud server. Simply copy a file into the directory and the \
ownCloud Client does the rest. \
 \
ownCloud gives you anytime and anywhere access to the files you \
need, whether through this desktop application, our mobile apps, \
the web interface, or other WebDAV clients. With it, you can \
easily view and share documents and information in a secure, \
flexible and controlled architecture. You can extend ownCloud \
with plug-ins from the community, or that you build yourself."
LICENSE = "GPL-2.0-only & GPL-3.0-only"

PV = "6.0.3"

RPM_NAME = "owncloud-client-6.0.3-1.6.aarch64.rpm"
RPM_HASH = "1ddca76d14a911a366e5663c957e3695f506bcc8fb31f20fcb52bc4acf8d01cdc767d06622f40d5f9d32c4a957ce0e2834df9f0a8e1088cdb3d65f1571da7760"

RPROVIDES:${PN} += "config-owncloud-client \
liblibsyncplugin.so \
libowncloudGui.so \
libowncloudGuiplugin.so \
libowncloudResourcesplugin.so \
owncloud-client \
qt6qmlimport-org.ownCloud.gui \
qt6qmlimport-org.ownCloud.gui.1 \
qt6qmlimport-org.ownCloud.libsync \
qt6qmlimport-org.ownCloud.libsync.1 \
qt6qmlimport-org.ownCloud.resources \
qt6qmlimport-org.ownCloud.resources.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLibreGraphAPI.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libkdsingleapplication-qt6.so.1.2 \
libownCloudCsync.so.0 \
libownCloudLibSync.so.0 \
libownCloudResources.so.0 \
libowncloudsync0 \
libstdc++.so.6 \
owncloud-extensions-resources \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Controls.Basic \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-org.ownCloud.gui.1 \
qt6qmlimport-org.ownCloud.libsync.1 \
qt6qmlimport-org.ownCloud.resources.1"

inherit rpm
